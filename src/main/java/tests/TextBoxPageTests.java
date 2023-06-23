package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxPageTests extends BaseTest{
    @Test
    public void verifyInputAndDisplayedTextEquality (){
        getTextBoxPage().open();
        getTextBoxPage().fullNameFieldInput(getFaker().name().fullName());
        getTextBoxPage().emailFieldInput(getFaker().internet().emailAddress());
        getTextBoxPage().currentAddressFieldInput(getFaker().address().fullAddress());
        getTextBoxPage().permanentAddressFieldInput(getFaker().address().secondaryAddress());
        getTextBoxPage().scrollDown(350);
        getTextBoxPage().getSubmitBtn().click();
        Assert.assertTrue(getTextBoxPage().getDisplayedFullName().getText().contains(getTextBoxPage().getFullNameField().getText()));
        Assert.assertTrue(getTextBoxPage().getDisplayedEmail().getText().contains(getTextBoxPage().getEmailField().getText()));
        Assert.assertTrue(getTextBoxPage().getDisplayedCurrentAddress().getText().contains(getTextBoxPage().getCurrentAddressField().getText()));
        Assert.assertTrue(getTextBoxPage().getDisplayedPermanentAddress().getText().contains(getTextBoxPage().getPermanentAddressField().getText()));
    }
}
