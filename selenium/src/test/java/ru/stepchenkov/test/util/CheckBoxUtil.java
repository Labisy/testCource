package ru.stepchenkov.test.util;

import org.assertj.core.api.Assertions;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.CheckBox;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class CheckBoxUtil {
    public static void homeGroupCheckBox(CheckBox checkBoxPage) {
        checkBoxTesting(checkBoxPage.clickHomeCheckBox(), true, true, true);
        checkBoxTesting(checkBoxPage.clickDocumentsInHome(), false, false, false);
        checkBoxTesting(checkBoxPage.clickDesktopInHome(), false, false, false);
        checkBoxTesting(checkBoxPage.clickDownloadInHome(), false, false, false);
    }

    public static void desktopGroupCheckBox(CheckBox checkBoxPage) {
        checkBoxTesting(checkBoxPage.clickDesktopCheckBox(), true, true, true);
        checkBoxTesting(checkBoxPage.clickNotesInDesktop(), false, true, false);
        checkBoxTesting(checkBoxPage.clickCommandInDesktop(), false, false, true);
    }

    public static void downloadGroupCheckBox(CheckBox checkBoxPage) {
        checkBoxTesting(checkBoxPage.clickDownloadLabel(), true, true, true);
        checkBoxTesting(checkBoxPage.clickWordInDownload(), false, true, false);
        checkBoxTesting(checkBoxPage.clickExcelInDownload(), false, false, true);
    }

    private static void checkBoxTesting(List<Boolean> list, Boolean... value) {;
        Assertions.assertThat(list)
                .isNotNull()
                .containsExactly(value);
    }
}
