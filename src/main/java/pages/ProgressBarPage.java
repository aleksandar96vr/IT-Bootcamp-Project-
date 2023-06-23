package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage extends BasePage{

    private WebElement startStopBtn;
    private WebElement progressBarAt100Percent;
    private WebElement progressBar;
    public ProgressBarPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getProgressBarAt100Percent(){
        progressBarAt100Percent =getDriver().findElement(By.xpath("//div[@aria-valuenow='100']"));
        return progressBarAt100Percent;
    }
    public WebElement getStartStopBtn(){
        startStopBtn =getDriver().findElement(By.id("startStopButton"));
        return startStopBtn;
    }
    public WebElement getProgressBar (){
        progressBar=getDriver().findElement(By.xpath("//div[@role='progressbar']"));
        return progressBar;
    }
    public void open (){
        getDriver().get("https://demoqa.com/progress-bar");
    }
    public void startStopProgress(){
        getStartStopBtn().click();
    }

}
