package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox.util.SpecialRepo;

import java.util.List;

public final class HomeCheckBox extends BasePage implements SpecialRepo {

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
    private WebElement expandLiElements;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/label")
    private WebElement homeLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label")
    private WebElement desktopLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label")
    private WebElement documentsLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label")
    private WebElement downloadLabel;
    @FindBy(xpath = "//*[@id=\"tree-node-desktop\"]")
    private WebElement desktopCB;
    @FindBy(xpath = "//*[@id=\"tree-node-documents\"]")
    private WebElement documentsCB;
    @FindBy(xpath = "//*[@id=\"tree-node-downloads\"]")
    private WebElement downloadCB;
    @FindBy(xpath = "//*[@id=\"tree-node-home\"]")
    private WebElement homeCB;

    public HomeCheckBox() {
        PageFactory.initElements(driver, this);
        expandLiElements.click();
    }
    public List<Boolean> clickHome() {
        offAnySelected();

        homeLabel.click();
        return List.of(
                desktopCB.isSelected(),
                documentsCB.isSelected(),
                downloadCB.isSelected()
        );
    }

    public List<Boolean> clickDocuments() {
        offAnySelected();

        documentsLabel.click();
        return List.of(
                homeCB.isSelected(),
                desktopCB.isSelected(),
                downloadCB.isSelected()
        );
    }
    public List<Boolean> clickDesktop() {
        offAnySelected();

        desktopLabel.click();
        return List.of(
                homeCB.isSelected(),
                documentsCB.isSelected(),
                downloadCB.isSelected()
        );
    }
    public List<Boolean> clickDownload() {
        offAnySelected();

        downloadLabel.click();
        return List.of(
                homeCB.isSelected(),
                desktopCB.isSelected(),
                documentsCB.isSelected()
        );
    }

    public void offAnySelected() {
        if (homeCB.isSelected()) homeLabel.click();
        if (desktopCB.isSelected()) desktopLabel.click();
        if (documentsCB.isSelected()) documentsLabel.click();
        if (downloadCB.isSelected()) downloadLabel.click();
    }
}
