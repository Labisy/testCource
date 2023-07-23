package ru.stepchenkov.test.demoqa.pages.elementsPage.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.Ticket;
import ru.stepchenkov.test.util.ResponseConverter;

public class TextBox extends BasePage {

    @FindBy(id = "userName")
    private WebElement fullName;
    @FindBy(id = "userEmail")
    private WebElement email;
    @FindBy(id = "currentAddress")
    private WebElement address;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(id = "name")
    private WebElement ticketName;
    @FindBy(id = "email")
    private WebElement ticketEmail;
    @FindBy(xpath = "//p[@id='currentAddress']")
    private WebElement ticketAddress;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    private WebElement ticketPermanentAddress;

    public TextBox() {
        PageFactory.initElements(driver, this);
    }

    public TextBox createFullTicket(String pageName, String pageEmail, String pageAddress, String pagePermanentAddress) {
        fullName.click();
        fullName.sendKeys(pageName);

        email.click();
        email.sendKeys(pageEmail);

        address.click();
        address.sendKeys(pageAddress);

        permanentAddress.click();
        permanentAddress.sendKeys(pagePermanentAddress);

        submitButton.click();
        return this;
    }

    /**
     * С сервера возвращается значения в формате Name:igor, а нам необходим igor
     * для этого используется конвертер.
     * @return class Ticket
     */
    public Ticket findTicket() {
        return ResponseConverter.getNormalTiket(
                ticketName.getText(),
                ticketEmail.getText(),
                ticketAddress.getText(),
                ticketPermanentAddress.getText());
    }
}
