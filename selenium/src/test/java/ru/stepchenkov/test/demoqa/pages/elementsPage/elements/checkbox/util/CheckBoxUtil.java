package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.checkbox.util;

import org.assertj.core.api.Assertions;
import ru.stepchenkov.test.demoqa.pages.MainPage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.checkbox.CheckBox;

import java.util.List;

public final class CheckBoxUtil {
    private final static CheckBox CHECK_BOX_PAGE =  new MainPage().getElementPage().checkBox();

    private CheckBoxUtil() {}

    public static void testHomeGroupCheckBox() {
        checkBoxTesting(CHECK_BOX_PAGE.clickHomeCheckBox(), true, true, true);
        checkBoxTesting(CHECK_BOX_PAGE.clickDocumentsInHome(), false, false, false);
        checkBoxTesting(CHECK_BOX_PAGE.clickDesktopInHome(), false, false, false);
        checkBoxTesting(CHECK_BOX_PAGE.clickDownloadInHome(), false, false, false);
    }

    public static void testDesktopGroupCheckBox() {
        checkBoxTesting(CHECK_BOX_PAGE.clickDesktopCheckBox(), true, true, true);
        checkBoxTesting(CHECK_BOX_PAGE.clickNotesInDesktop(), false, true, false);
        checkBoxTesting(CHECK_BOX_PAGE.clickCommandInDesktop(), false, false, true);
    }

    public static void testDownloadGroupCheckBox() {
        checkBoxTesting(CHECK_BOX_PAGE.clickDownloadLabel(), true, true, true);
        checkBoxTesting(CHECK_BOX_PAGE.clickWordInDownload(), false, true, false);
        checkBoxTesting(CHECK_BOX_PAGE.clickExcelInDownload(), false, false, true);
    }

    private static void checkBoxTesting(List<Boolean> list, Boolean... value) {
        ;
        Assertions.assertThat(list)
                .isNotNull()
                .containsExactly(value);
    }
}
