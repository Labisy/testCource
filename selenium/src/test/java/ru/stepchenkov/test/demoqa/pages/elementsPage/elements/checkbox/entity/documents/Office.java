package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.checkbox.entity.documents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.checkbox.entity.AbstractCheckBox;

import java.util.List;

public class Office extends AbstractCheckBox {

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label")
    private WebElement officeLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label")
    private WebElement publicLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label")
    private WebElement privateLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label")
    private WebElement classifiedLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label")
    private WebElement generalLabel;
    @FindBy(xpath = "//*[@id=\"tree-node-office\"]")
    private WebElement officeCB;
    @FindBy(xpath = "//*[@id=\"tree-node-public\"]")
    private WebElement publicCB;
    @FindBy(xpath = "//*[@id=\"tree-node-private\"]")
    private WebElement privateCB;
    @FindBy(xpath = "//*[@id=\"tree-node-classified\"]")
    private WebElement classifiedCB;
    @FindBy(xpath = "//*[@id=\"tree-node-general\"]")
    private WebElement generalCB;

    public List<Boolean> checkOffice() {
        offAnySelected();

        officeLabel.click();
        return List.of(
                officeCB.isSelected(),
                publicCB.isSelected(),
                privateCB.isSelected(),
                classifiedCB.isSelected(),
                generalCB.isSelected());
    }

    @Override
    public void offAnySelected() {
        if (officeCB.isSelected()) officeLabel.click();
        if (publicCB.isSelected()) publicLabel.click();
        if (privateCB.isSelected()) privateLabel.click();
        if (classifiedCB.isSelected()) classifiedLabel.click();
        if (generalCB.isSelected()) generalLabel.click();
    }
}
