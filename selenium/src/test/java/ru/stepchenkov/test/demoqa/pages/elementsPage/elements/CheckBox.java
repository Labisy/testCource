package ru.stepchenkov.test.demoqa.pages.elementsPage.elements;

import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.HomeCheckBox;

import java.util.List;

public class CheckBox extends BasePage {

    private final HomeCheckBox homeCheckBox;

    public CheckBox() {
        this.homeCheckBox = new HomeCheckBox();
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
}
