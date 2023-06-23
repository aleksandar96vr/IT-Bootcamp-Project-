package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTipsPage extends BasePage{

    private WebElement hoverMeToSeeBtn;
    private WebElement hoveredTxt;

    public ToolTipsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getHoverMeToSeeBtn (){
        hoverMeToSeeBtn=getDriver().findElement(By.id("toolTipButton"));
        return hoverMeToSeeBtn;
    }
    public WebElement getHoveredTxt (){
        hoveredTxt=getDriver().findElement(By.xpath("//button[@aria-describedby='buttonToolTip']"));
        return hoveredTxt;
    }
    public void open (){
        getDriver().get("https://demoqa.com/tool-tips");
    }

}
