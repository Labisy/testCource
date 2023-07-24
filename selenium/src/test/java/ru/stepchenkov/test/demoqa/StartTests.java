package ru.stepchenkov.test.demoqa;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stepchenkov.test.core.BaseTestSetup;
import ru.stepchenkov.test.demoqa.pages.MainPage;
import ru.stepchenkov.test.readProperties.ConfigurationProvider;
import ru.stepchenkov.test.util.CheckBoxUtil;
import ru.stepchenkov.test.util.RadioButtonUtil;

class StartTests extends BaseTestSetup {

    @Test
    void textBox() {
        var response = new MainPage()
                .getElementPage()
                .textBox()
                .createFullTicket(
                        ConfigurationProvider.NAME,
                        ConfigurationProvider.EMAIL,
                        ConfigurationProvider.ADDRESS,
                        ConfigurationProvider.PERMANENT_ADDRESS)
                .findTicket();

        Assertions.assertThat(response)
                .isNotNull()
                .isEqualTo(ConfigurationProvider.getFullTicket());
    }

    @Test
    void checkBox() {
        var checkBoxPage = new MainPage()
                .getElementPage()
                .checkBox();
        CheckBoxUtil.testHomeGroupCheckBox(checkBoxPage);
        CheckBoxUtil.testDesktopGroupCheckBox(checkBoxPage);
        CheckBoxUtil.testDownloadGroupCheckBox(checkBoxPage);
    }

    @Test
    void radioButton() {
        var radioButtonPage = new MainPage().getElementPage().radioButton();
        RadioButtonUtil.checkBlockUseRadioButton(radioButtonPage);
        RadioButtonUtil.checkYesClickAndMessage(radioButtonPage);
        RadioButtonUtil.checkImpressiveClickAndMassage(radioButtonPage);
    }
}
