package zerobank.pages;

import zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class AccountActivityPage {

    public AccountActivityPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "aa_accountId")
    public WebElement accountOpts;

    @FindBy(xpath = "//table//thead//th")
    public List<WebElement> colNames;

    @FindBy(xpath = "//li[starts-with(@class,'ui-state-default')][.='Find Transactions']")
    public WebElement findTransactions;

    @FindBy(id = "aa_fromDate")
    public WebElement fromDateInput;

    @FindBy(id = "aa_toDate")
    public WebElement toDateInput;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement findButton;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr//td[1]")
    public List<WebElement> allDates;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr//td[2]")
    public List<WebElement> allDescriptions;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr//td[3]")
    public List<WebElement> allDeposits;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr//td[4]")
    public List<WebElement> allWithdrawals;

    @FindBy(id = "aa_description")
    public WebElement descrInput;

    @FindBy(id = "aa_type")
    public WebElement selectType;
}