package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTest {
    @Test
    public void verifyTextBoxPage (){
        getElementsPage().open();
        getElementsPage().getTextBox().click();
        Assert.assertTrue(getElementsPage().getTextBoxTxt().isDisplayed());
    }
    @Test
    public void verifyCheckBoxPage (){
        getElementsPage().open();
        getElementsPage().getCheckBox().click();
        Assert.assertTrue(getElementsPage().getCheckBoxTxt().isDisplayed());
    }
    @Test
    public void verifyRadioButtonPage (){
        getElementsPage().open();
        getElementsPage().getRadioButton().click();
        Assert.assertTrue(getElementsPage().getRadioButtonTxt().isDisplayed());
    }
    @Test
    public void verifyWebTablesPage (){
        getElementsPage().open();
        getElementsPage().scrollDown(400);
        getElementsPage().getWebTables().click();
        Assert.assertTrue(getElementsPage().getWebTablesTxt().isDisplayed());
    }
    @Test
    public void verifyButtonsPage (){
        getElementsPage().open();
        getElementsPage().scrollDown(400);
        getElementsPage().getButtons().click();
        Assert.assertTrue(getElementsPage().getButtonsTxt().isDisplayed());
    }
    @Test
    public void verifyLinksPage (){
        getElementsPage().open();
        getElementsPage().scrollDown(400);
        getElementsPage().getLinks().click();
        Assert.assertTrue(getElementsPage().getLinksTxt().isDisplayed());
    }
    @Test
    public void verifyBrokenLinksImagesPage (){
        getElementsPage().open();
        getElementsPage().scrollDown(400);
        getElementsPage().getBrokenLinksImages().click();
        Assert.assertTrue(getElementsPage().getBrokenLinksImagesTxt().isDisplayed());
    }
    @Test
    public void verifyUploadAndDownloadPage (){
        getElementsPage().open();
        getElementsPage().scrollDown(400);
        getElementsPage().getUploadAndDownload().click();
        Assert.assertTrue(getElementsPage().getUploadAndDownloadTxt().isDisplayed());
    }
    @Test
    public void verifyDynamicPropertiesPage (){
        getElementsPage().open();
        getElementsPage().scrollDown(400);
        getElementsPage().getDynamicProperties().click();
        Assert.assertTrue(getElementsPage().getDynamicPropertisTxt().isDisplayed());
    }
}
