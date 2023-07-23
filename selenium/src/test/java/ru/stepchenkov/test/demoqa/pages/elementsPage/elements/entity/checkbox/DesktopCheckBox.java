package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesktopCheckBox extends AbstractCheckBox {
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label")
    private WebElement desktopLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label")
    private WebElement notesLabel;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label")
    private WebElement commandLabel;
    @FindBy(xpath = "//*[@id=\"tree-node-desktop\"]")
    private WebElement desktopCB;
    @FindBy(xpath = "//*[@id=\"tree-node-notes\"]")
    private WebElement notesCB;
    @FindBy(xpath = "//*[@id=\"tree-node-commands\"]")
    private WebElement commandCB;

    public List<Boolean> clickDesktopLabel() {
        offAnySelected();
        desktopLabel.click();
        return List.of(desktopCB.isSelected(), notesCB.isSelected(), commandCB.isSelected());
    }

    public List<Boolean> clickNotesLabel() {
        offAnySelected();
        notesLabel.click();
        return List.of(desktopCB.isSelected(), notesCB.isSelected(), commandCB.isSelected());
    }

    public List<Boolean> clickCommandLabel() {
        offAnySelected();
        commandLabel.click();
        return List.of(desktopCB.isSelected(), notesCB.isSelected(), commandCB.isSelected());
    }

    @Override
    public void offAnySelected() {
        if (desktopCB.isSelected()) desktopLabel.click();
        if (notesCB.isSelected()) notesLabel.click();
        if (commandCB.isSelected()) commandLabel.click();
    }
}
