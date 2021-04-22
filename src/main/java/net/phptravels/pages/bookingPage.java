package net.phptravels.pages;

import net.phptravels.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingPage {
    public bookingPage() {
        PageFactory.initElements(Driver.get(), this);

    }
    @FindBy(xpath = "//a[@class='btn btn-primary btn-action btn-block']")
    WebElement invoiceButton;
}
