package ru.stepchenkov.test.demoqa.pages.elementsPage.elements;

import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox.DesktopCheckBox;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox.DocumentsCheckBox;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox.HomeCheckBox;

import java.util.List;

public class CheckBox extends BasePage {

    private final HomeCheckBox homeCheckBox;
    private final DesktopCheckBox desktopCheckBox;

    public CheckBox() {
        this.homeCheckBox = new HomeCheckBox();
        this.desktopCheckBox = new DesktopCheckBox();
    }

    public List<Boolean> clickHomeCheckBox() {
        return homeCheckBox.clickHomeCB();
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
}
