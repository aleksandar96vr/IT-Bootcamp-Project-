package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage{

    private WebElement textBox;
    private WebElement textBoxTxt;
    private WebElement checkBox;
    private WebElement checkBoxTxt;
    private WebElement radioButton;
    private WebElement radioButtonTxt;
    private WebElement webTables;
    private WebElement webTablesTxt;
    private WebElement buttons;
    private WebElement buttonsTxt;
    private WebElement links;
    private WebElement linksTxt;
    private WebElement brokenLinksImages;
    private WebElement brokenLinksImagesTxt;
    private WebElement uploadAndDownload;
    private WebElement uploadAndDownloadTxt;
    private WebElement dynamicProperties;
    private WebElement dynamicPropertisTxt;



    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getTextBox (){
        textBox = getDriver().findElement(By.xpath("//span[@class='text' and text()='Text Box']"));
        return textBox;
    }
    public WebElement getTextBoxTxt (){
        textBoxTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Text Box']"));
        return textBoxTxt;
    }
    public WebElement getCheckBox (){
        checkBox = getDriver().findElement(By.xpath("//span[@class='text' and text()='Check Box']"));
        return checkBox;
    }
    public WebElement getCheckBoxTxt (){
        checkBoxTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Check Box']"));
        return checkBoxTxt;
    }
    public WebElement getRadioButton (){
        radioButton = getDriver().findElement(By.xpath("//span[@class='text' and text()='Radio Button']"));
        return radioButton;
    }
    public WebElement getRadioButtonTxt (){
        radioButtonTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Radio Button']"));
        return radioButtonTxt;
    }
    public WebElement getWebTables (){
        webTables = getDriver().findElement(By.xpath("//span[@class='text' and text()='Web Tables']"));
        return webTables;
    }
    public WebElement getWebTablesTxt (){
        webTablesTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Web Tables']"));
        return webTablesTxt;
    }
    public WebElement getButtons (){
        buttons = getDriver().findElement(By.xpath("//span[@class='text' and text()='Buttons']"));
        return buttons;
    }
    public WebElement getButtonsTxt (){
        buttonsTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Buttons']"));
        return buttonsTxt;
    }
    public WebElement getLinks (){
        links = getDriver().findElement(By.xpath("//span[@class='text' and text()='Links']"));
        return links;
    }
    public WebElement getLinksTxt (){
        linksTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Links']"));
        return linksTxt;
    }
    public WebElement getBrokenLinksImages (){
        brokenLinksImages = getDriver().findElement(By.xpath("//span[@class='text' and text()='Broken Links - Images']"));
        return brokenLinksImages;
    }
    public WebElement getBrokenLinksImagesTxt (){
        brokenLinksImagesTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Broken Links - Images']"));
        return brokenLinksImagesTxt;
    }
    public WebElement getUploadAndDownload (){
        uploadAndDownload = getDriver().findElement(By.xpath("//span[@class='text' and text()='Upload and Download']"));
        return uploadAndDownload;
    }
    public WebElement getUploadAndDownloadTxt (){
        uploadAndDownloadTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Upload and Download']"));
        return uploadAndDownloadTxt;
    }
    public WebElement getDynamicProperties(){
        dynamicProperties = getDriver().findElement(By.xpath("//span[@class='text' and text()='Dynamic Properties']"));
        return dynamicProperties;
    }
    public WebElement getDynamicPropertisTxt (){
        dynamicPropertisTxt=getDriver().findElement(By.xpath("//div[@class='main-header' and text()='Dynamic Properties']"));
        return dynamicPropertisTxt;
    }
    public void open (){
        getDriver().get("https://demoqa.com/elements");
    }

}
