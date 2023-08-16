package ru.stepchenkov.test.demoqa;

import org.junit.jupiter.api.Test;
import ru.stepchenkov.test.core.BaseTestSetup;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.checkbox.util.CheckBoxUtil;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.util.RadioButtonUtil;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.textbox.util.TextBoxUtil;

class StartTests extends BaseTestSetup {

    @Test
    void textBox() {
        TextBoxUtil.testFullTicket();
    }

    @Test
    void checkBox() {
        CheckBoxUtil.testHomeGroupCheckBox();
        CheckBoxUtil.testDesktopGroupCheckBox();
        CheckBoxUtil.testDownloadGroupCheckBox();
    }

    @Test
    void radioButton() {
        RadioButtonUtil.checkBlockUseRadioButton();
        RadioButtonUtil.checkYesClickAndMessage();
        RadioButtonUtil.checkImpressiveClickAndMassage();
    }
}
