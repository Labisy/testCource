package ru.stepchenkov.test.demoqa.pages.elementsPage.elements;

import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox.DesktopCheckBox;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox.DownloadCheckBox;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox.HomeCheckBox;

import java.util.List;

public class CheckBox extends BasePage {

    private final HomeCheckBox homeCheckBox;
    private final DesktopCheckBox desktopCheckBox;
    private final DownloadCheckBox downloadCheckBox;

    public CheckBox() {
        this.homeCheckBox = new HomeCheckBox();
        this.desktopCheckBox = new DesktopCheckBox();
        this.downloadCheckBox = new DownloadCheckBox();
    }

    public List<Boolean> clickHomeCheckBox() {
        return homeCheckBox.clickHome();
    }

    public List<Boolean> clickDocumentsInHome() {
        return homeCheckBox.clickDocuments();
    }

    public List<Boolean> clickDesktopInHome() {
        return homeCheckBox.clickDesktop();
    }

    public List<Boolean> clickDownloadInHome() {
        return homeCheckBox.clickDownload();
    }

    public List<Boolean> clickDesktopCheckBox() {
        return desktopCheckBox.clickDesktopLabel();
    }

    public List<Boolean> clickNotesInDesktop() {
        return desktopCheckBox.clickNotesLabel();
    }

    public List<Boolean> clickCommandInDesktop() {
        return desktopCheckBox.clickCommandLabel();
    }

    public List<Boolean> clickDownloadLabel() {
        return downloadCheckBox.clickDownloadLabel();
    }

    public List<Boolean> clickWordInDownload() {
        return downloadCheckBox.clickWordLabel();
    }

    public List<Boolean> clickExcelInDownload() {
        return downloadCheckBox.clickExcelLabel();
    }
}
