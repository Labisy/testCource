package ru.stepchenkov.test.util;

import org.assertj.core.api.Assertions;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.CheckBox;

import java.util.List;

public final class CheckBoxUtil {
    public static void homeCheckBox(CheckBox checkBoxPage) {
        checkBoxTesting(checkBoxPage.clickHomeCheckBox(), true, true, true);
        checkBoxTesting(checkBoxPage.clickDocumentsInHome(), false, false, false);
        checkBoxTesting(checkBoxPage.clickDesktopInHome(), false, false, false);
        checkBoxTesting(checkBoxPage.clickDownloadInHome(), false, false, false);
    }

    public static void desktopCheckBox(CheckBox checkBoxPage) {
        checkBoxTesting(checkBoxPage.clickDesktopCheckBox(), true, true, true);
        checkBoxTesting(checkBoxPage.clickNotesInDesktop(), false, true, false);
        checkBoxTesting(checkBoxPage.clickCommandInDesktop(), false, false, true);
    }

    public static void downloadCheckBox(CheckBox checkBoxPage) {
        checkBoxTesting(checkBoxPage.clickDownloadLabel(), true, true, true);
        checkBoxTesting(checkBoxPage.clickWordInDownload(), false, true, false);
        checkBoxTesting(checkBoxPage.clickExcelInDownload(), false, false, true);
    }

    public static void checkBoxTesting(List<Boolean> list, boolean... value) {
        Assertions.assertThat(list)
                .isNotNull()
                .hasSize(3)
                .containsExactlyInAnyOrder(value[0], value[1], value[2]);
    }
}
