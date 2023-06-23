package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage extends BasePage{

    private WebElement smallModalBtn;
    private WebElement smallModalTxt;
    private WebElement largeModalBtn;
    private WebElement largeModalTxt;
    public ModalDialogsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getSmallModalBtn (){
        smallModalBtn=getDriver().findElement(By.id("showSmallModal"));
        return smallModalBtn;
    }
    public WebElement getSmallModalTxt (){
        smallModalTxt=getDriver().findElement(By.xpath("//div[@class='modal-title h4' and text()='Small Modal']"));
        return smallModalTxt;
    }
    public WebElement getLargeModalBtn (){
        largeModalBtn=getDriver().findElement(By.id("showLargeModal"));
        return largeModalBtn;
    }
    public WebElement getLargeModalTxt (){
        largeModalTxt=getDriver().findElement(By.xpath("//div[@class='modal-title h4' and text()='Large Modal']"));
        return largeModalTxt;
    }
    public void open (){
        getDriver().get("https://demoqa.com/modal-dialogs");
    }
}
