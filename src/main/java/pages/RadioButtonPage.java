package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage{

    private WebElement yesBtn;
    private WebElement yesTxt;
    private WebElement impressiveBtn;
    private WebElement impressiveTxt;

    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesBtn (){
        yesBtn=getDriver().findElement(By.xpath("//label[@for='yesRadio']"));
        return yesBtn;
    }
    public WebElement getYesTxt (){
        yesTxt = getDriver().findElement(By.xpath("//span[@class='text-success'and text()='Yes']"));
        return yesTxt;
    }
    public WebElement getImpressiveBtn (){
        impressiveBtn=getDriver().findElement(By.xpath("//label[@for='impressiveRadio']"));
        return impressiveBtn;
    }
    public WebElement getImpressiveTxt (){
        impressiveTxt = getDriver().findElement(By.xpath("//span[@class='text-success'and text()='Impressive']"));
        return impressiveTxt;
    }

    public void open (){
        getDriver().get("https://demoqa.com/radio-button");
    }
}
