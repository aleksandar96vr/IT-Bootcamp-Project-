package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonPageTests extends BaseTest{
    @Test
    public void verifyYesButton (){
        getRadioButtonPage().open();
        getRadioButtonPage().getYesBtn().click();
        Assert.assertTrue(getRadioButtonPage().getYesTxt().isDisplayed());
    }
    @Test
    public void verifyImpressiveButton (){
        getRadioButtonPage().open();
        getRadioButtonPage().getImpressiveBtn().click();
        Assert.assertTrue(getRadioButtonPage().getImpressiveTxt().isDisplayed());
    }
}
