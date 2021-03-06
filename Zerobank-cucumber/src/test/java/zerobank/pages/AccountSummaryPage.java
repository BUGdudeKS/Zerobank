package zerobank.pages;

import zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AccountSummaryPage {

    public AccountSummaryPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Savings")
    public WebElement savingsLink;
}