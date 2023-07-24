package ru.stepchenkov.test.demoqa;

import org.junit.jupiter.api.Test;
import ru.stepchenkov.test.core.BaseTestSetup;
import ru.stepchenkov.test.demoqa.pages.MainPage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.checkbox.util.CheckBoxUtil;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.util.RadioButtonUtil;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.textbox.util.TextBoxUtil;

class StartTests extends BaseTestSetup {

    @Test
    void textBox() {
        var textBoxPage = new MainPage()
                .getElementPage()
                .textBox();
        TextBoxUtil.testFullTicket(textBoxPage);
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
