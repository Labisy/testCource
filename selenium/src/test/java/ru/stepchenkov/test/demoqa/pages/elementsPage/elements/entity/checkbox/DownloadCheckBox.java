package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DownloadCheckBox extends AbstractCheckBox {

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label")
    private WebElement downloadsLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label")
    private WebElement wordLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label")
    private WebElement excelLabel;
    @FindBy(xpath = "//*[@id=\"tree-node-downloads\"]")
    private WebElement downloadsCB;
    @FindBy(xpath = "//*[@id=\"tree-node-wordFile\"]")
    private WebElement wordCB;
    @FindBy(xpath = "//*[@id=\"tree-node-excelFile\"]")
    private WebElement excelCB;

    public List<Boolean> clickDownloadLabel() {
        offAnySelected();
        downloadsLabel.click();
        return List.of(downloadsCB.isSelected(), wordCB.isSelected(), excelCB.isSelected());
    }

    public List<Boolean> clickWordLabel() {
        offAnySelected();
        wordLabel.click();
        return List.of(downloadsCB.isSelected(), wordCB.isSelected(), excelCB.isSelected());
    }

    public List<Boolean> clickExcelLabel() {
        offAnySelected();
        excelLabel.click();
        return List.of(downloadsCB.isSelected(), wordCB.isSelected(), excelCB.isSelected());
    }

    @Override
    public void offAnySelected() {
        if (downloadsCB.isSelected()) downloadsLabel.click();
        if (wordCB.isSelected()) wordLabel.click();
        if (excelCB.isSelected()) excelLabel.click();
    }
}
