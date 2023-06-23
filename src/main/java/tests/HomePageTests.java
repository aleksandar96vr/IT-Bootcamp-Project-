package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{

    @Test
    public void verifyElementsCard () {
        getHomePage().open();
        getHomePage().scrollDown(400);
        getHomePage().getElementsCard().click();
        Assert.assertTrue(getHomePage().getElementsTxt().isDisplayed());
    }
    @Test
    public void verifyFormsCard () {
        getHomePage().open();
        getHomePage().scrollDown(400);
        getHomePage().getFormsCard().click();
        Assert.assertTrue(getHomePage().getFormsTxt().isDisplayed());
    }
    @Test
    public void verifyAlertsCard () {
        getHomePage().open();
        getHomePage().scrollDown(400);
        getHomePage().getAlertsCard().click();
        Assert.assertTrue(getHomePage().getAlertsTxt().isDisplayed());
    }
    @Test
    public void verifyWidgetsCard () {
        getHomePage().open();
        getHomePage().scrollDown(400);
        getHomePage().getWidgetsCard().click();
        Assert.assertTrue(getHomePage().getWidgetsTxt().isDisplayed());
    }
    @Test
    public void verifyInteractionsCard () {
        getHomePage().open();
        getHomePage().scrollDown(400);
        getHomePage().getInteractionsCard().click();
        Assert.assertTrue(getHomePage().getInteractionsTxt().isDisplayed());
    }
    @Test
    public void verifyBoogStoreCard () {
        getHomePage().open();
        getHomePage().scrollDown(800);
        getHomePage().getBookStoreCard().click();
        Assert.assertTrue(getHomePage().getBookStoreTxt().isDisplayed());
    }
}
