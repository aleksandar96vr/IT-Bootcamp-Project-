package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsPageTests extends BaseTest {
    @Test
    public void verifyDoubleClickBtn  () {
        getButtonsPage().open();
        doubleClick(getButtonsPage().getDoubleClickBtn());
        Assert.assertTrue(getButtonsPage().getDoubleClickBtnTxt().isDisplayed());
    }
    @Test
    public void verifyRightClickBtn (){
        getButtonsPage().open();
        rightClick(getButtonsPage().getRightClickBtn());
        Assert.assertTrue(getButtonsPage().getRightClickBtnTxt().isDisplayed());
    }
    @Test
    public void verifyClickBtn (){
        getButtonsPage().open();
        getButtonsPage().getClickBtn().click();
        Assert.assertTrue(getButtonsPage().getClickBtnTxt().isDisplayed());
    }
}
