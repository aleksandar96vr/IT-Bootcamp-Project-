package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalDialogsPageTests extends BaseTest{
    @Test
    public void verifySmallModalBtn (){
        getModalDialogsPage().open();
        getModalDialogsPage().getSmallModalBtn().click();
        Assert.assertTrue(getModalDialogsPage().getSmallModalTxt().isDisplayed());
    }
    @Test
    public void verifyLargeModalBtn (){
        getModalDialogsPage().open();
        getModalDialogsPage().getLargeModalBtn().click();
        Assert.assertTrue(getModalDialogsPage().getLargeModalTxt().isDisplayed());
    }
}
