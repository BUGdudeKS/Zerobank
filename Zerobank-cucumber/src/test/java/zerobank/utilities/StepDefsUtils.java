package zerobank.utilities;

import zerobank.pages.AccountActivityPage;
import zerobank.pages.AccountSummaryPage;
import zerobank.pages.DashboardMenuPage;
import zerobank.pages.LoginPage;

import java.util.List;


public class StepDefsUtils {

    static AccountActivityPage accountActivity = new AccountActivityPage();
    static LoginPage loginPage = new LoginPage();
    static AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    static DashboardMenuPage dashboardMenuPagePage = new DashboardMenuPage();

    public static List<String> getListOf(String listOf){

        List<String> colContent;
        colContent = BrowserUtils.getElementsText(accountActivity.allDeposits);

        switch (listOf){
            case "deposit":
                colContent = BrowserUtils.getElementsText(accountActivity.allDeposits);
                break;
            case "withdrawal":
                colContent = BrowserUtils.getElementsText(accountActivity.allWithdrawals);
        }
        return colContent;
    }
}