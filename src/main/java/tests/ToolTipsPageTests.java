package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipsPageTests extends BaseTest{
    @Test
    public void verifyHoverFunctionOnBtn(){
        getToolTipsPage().open();
        hoverOnElement(getToolTipsPage().getHoverMeToSeeBtn());
        Assert.assertTrue(getToolTipsPage().getHoveredTxt().isDisplayed());
    }
}
