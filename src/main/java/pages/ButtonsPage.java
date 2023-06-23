package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{

    private WebElement doubleClickBtn;
    private WebElement doubleClickBtnTxt;
    private WebElement rightClickBtn;
    private WebElement rightClickBtnTxt;
    private WebElement clickBtn;
    private WebElement clickTxt;


    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickBtn (){
        doubleClickBtn=getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickBtn;
    }
    public WebElement getDoubleClickBtnTxt (){
        doubleClickBtnTxt=getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickBtnTxt;
    }
    public WebElement getRightClickBtn (){
        rightClickBtn=getDriver().findElement(By.id("rightClickBtn"));
        return rightClickBtn;
    }
    public WebElement getRightClickBtnTxt (){
        rightClickBtnTxt=getDriver().findElement(By.id("rightClickMessage"));
        return rightClickBtnTxt;
    }
    public WebElement getClickBtn (){
        clickBtn =getDriver().findElement(By.xpath("//button[@type='button' and text()='Click Me']"));
        return clickBtn;
    }
    public WebElement getClickBtnTxt (){
        clickTxt=getDriver().findElement(By.id("dynamicClickMessage"));
        return clickTxt;
    }

    public void open (){
        getDriver().get("https://demoqa.com/buttons");
    }
}
