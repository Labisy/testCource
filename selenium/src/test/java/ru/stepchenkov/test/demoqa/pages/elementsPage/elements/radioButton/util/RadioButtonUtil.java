package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.util;

import org.assertj.core.api.Assertions;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.RadioButton;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.entity.ListAndData;
import ru.stepchenkov.test.readProperties.ConfigurationProvider;

import java.util.Arrays;

public final class RadioButtonUtil {

    public static void checkBlockUseRadioButton(RadioButton radioButton) {
        Assertions.assertThat(radioButton.noUseRadioButton())
                .isEqualTo("true");
    }

    public static void checkYesClickAndMessage(RadioButton radioButton) {
        var listAndData = radioButton.yesClick();
        checkResult(listAndData, ConfigurationProvider.YES, true, false);
    }

    public static void checkImpressiveClickAndMassage(RadioButton radioButton) {
        var listAndData = radioButton.impressive();
        checkResult(listAndData, ConfigurationProvider.IMPRESSIVE, false, true);
    }

    private static void checkResult(ListAndData listAndData, String message, Boolean... value) {
        Assertions.assertThat(listAndData)
                .isNotNull()
                .extracting("checked", "message")
                .contains(Arrays.stream(value).toList(), message);
    }
}