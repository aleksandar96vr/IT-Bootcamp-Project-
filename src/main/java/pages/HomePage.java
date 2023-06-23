package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    private WebElement elementsCard;
    private WebElement elementsTxt;
    private WebElement formsCard;
    private WebElement formsTxt;
    private WebElement alertsCard;
    private WebElement alertsTxt;
    private WebElement widgetsCard;
    private WebElement widgetsTxt;
    private WebElement interactionsCard;
    private WebElement interactionsTxt;
    private WebElement bookStoreCard;
    private WebElement bookStoreTxt;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getElementsCard (){
        elementsCard=getDriver().findElement(By.xpath("//h5[text()='Elements']"));
        return elementsCard;
    }
    public WebElement getElementsTxt(){
        elementsTxt = getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Elements']"));
        return elementsTxt;
    }
    public WebElement getFormsCard (){
        formsCard=getDriver().findElement(By.xpath("//h5[text()= 'Forms']"));
        return formsCard;
    }
    public WebElement getFormsTxt (){
        formsTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Forms']"));
        return formsTxt;
    }
    public WebElement getAlertsCard (){
        alertsCard=getDriver().findElement(By.xpath("//h5[text()= 'Alerts, Frame & Windows']"));
        return alertsCard;
    }
    public WebElement getAlertsTxt(){
        alertsTxt =getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Alerts, Frame & Windows']"));
        return alertsTxt;
    }
    public WebElement getWidgetsCard(){
        widgetsCard=getDriver().findElement(By.xpath("//h5[text()= 'Widgets']"));
        return widgetsCard;
    }
    public WebElement getWidgetsTxt (){
        widgetsTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Widgets']"));
        return widgetsTxt;
    }
    public WebElement getInteractionsCard(){
        interactionsCard=getDriver().findElement(By.xpath("//h5[text()= 'Interactions']"));
        return interactionsCard;
    }
    public WebElement getInteractionsTxt (){
        interactionsTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Interactions']"));
        return interactionsTxt;
    }
    public WebElement getBookStoreCard(){
        bookStoreCard=getDriver().findElement(By.xpath("//h5[text()= 'Book Store Application']"));
        return bookStoreCard;
    }
    public WebElement getBookStoreTxt (){
        bookStoreTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Book Store']"));
        return bookStoreTxt;
    }

    public void open (){
        getDriver().get("https://demoqa.com/");
    }

}
