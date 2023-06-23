package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarPageTests extends BaseTest{
    @Test
    public void verifyProgressBarAt100Percent (){
        getProgressBarPage().open();
        getProgressBarPage().startStopProgress();
        getWait().until(ExpectedConditions.attributeToBe(getProgressBarPage().getProgressBar(), "aria-valuenow", "100"));
        Assert.assertTrue(getProgressBarPage().getProgressBarAt100Percent().isDisplayed());
    }

}
