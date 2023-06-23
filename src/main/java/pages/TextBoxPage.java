package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage{

    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitBtn;
    private WebElement displayedFullName;
    private WebElement displayedEmail;
    private WebElement displayedCurrentAddress;
    private WebElement displayedPermanentAddress;


    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getFullNameField (){
        fullNameField=getDriver().findElement(By.xpath("//input[@placeholder='Full Name']"));
        return fullNameField;
    }
    public WebElement getEmailField (){
        emailField=getDriver().findElement(By.xpath("//input[@placeholder='name@example.com']"));
        return emailField;
    }
    public WebElement getCurrentAddressField (){
        currentAddressField=getDriver().findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        return currentAddressField;
    }
    public WebElement getPermanentAddressField (){
        permanentAddressField=getDriver().findElement(By.xpath("//textarea[@id='permanentAddress']"));
        return permanentAddressField;
    }
    public WebElement getSubmitBtn (){
        submitBtn=getDriver().findElement(By.id("submit"));
        return submitBtn;
    }
    public WebElement getDisplayedFullName (){
        displayedFullName=getDriver().findElement(By.xpath("//p[@id='name']"));
        return displayedFullName;
    }
    public WebElement getDisplayedEmail (){
        displayedEmail=getDriver().findElement(By.xpath("//p[@id='email']"));
        return displayedEmail;
    }
    public WebElement getDisplayedCurrentAddress (){
        displayedCurrentAddress=getDriver().findElement(By.xpath("//p[@id='currentAddress']"));
        return displayedCurrentAddress;
    }
    public WebElement getDisplayedPermanentAddress (){
        displayedPermanentAddress=getDriver().findElement(By.xpath("//p[@id='permanentAddress']"));
        return displayedPermanentAddress;
    }

    public void fullNameFieldInput (String fullName){
        getFullNameField().sendKeys(fullName);
    }
    public void emailFieldInput (String email){
        getEmailField().sendKeys(email);
    }
    public void currentAddressFieldInput (String currentAddress){
        getCurrentAddressField().sendKeys(currentAddress);
    }
    public void permanentAddressFieldInput (String permanentAddress){
        getPermanentAddressField().sendKeys(permanentAddress);
    }
    public void open (){
        getDriver().get("https://demoqa.com/text-box");
    }
}
