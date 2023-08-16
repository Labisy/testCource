package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.util;

import org.assertj.core.api.Assertions;
import ru.stepchenkov.test.demoqa.pages.MainPage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.RadioButton;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.entity.ListAndData;
import ru.stepchenkov.test.readProperties.ConfigurationProvider;

import java.util.Arrays;

public final class RadioButtonUtil {

    public static final RadioButton RADIO_BUTTON_PAGE = new MainPage().getElementPage().radioButton();

    private RadioButtonUtil() {}

    public static void checkBlockUseRadioButton() {
        Assertions.assertThat(RADIO_BUTTON_PAGE.noUseRadioButton())
                .isEqualTo("true");
    }

    public static void checkYesClickAndMessage() {
        var listAndData = RADIO_BUTTON_PAGE.yesClick();
        checkResult(listAndData, ConfigurationProvider.YES, true, false);
    }

    public static void checkImpressiveClickAndMassage() {
        var listAndData = RADIO_BUTTON_PAGE.impressive();
        checkResult(listAndData, ConfigurationProvider.IMPRESSIVE, false, true);
    }

    private static void checkResult(ListAndData listAndData, String message, Boolean... value) {
        Assertions.assertThat(listAndData)
                .isNotNull()
                .extracting("checked", "message")
                .contains(Arrays.stream(value).toList(), message);
    }
}
