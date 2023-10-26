package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private ElementsPage elementsPage;
    private RadioButtonPage radioButtonPage;
    private ButtonsPage buttonsPage;
    private Actions actions;
    private ModalDialogsPage modalDialogsPage;
    private Faker faker;
    private TextBoxPage textBoxPage;
    private ProgressBarPage progressBarPage;
    private ToolTipsPage toolTipsPage;


    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public ElementsPage getElementsPage() {
        return elementsPage;
    }
    public RadioButtonPage getRadioButtonPage (){
        return radioButtonPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public Actions getActions() {
        return actions;
    }

    public ModalDialogsPage getModalDialogsPage() {
        return modalDialogsPage;
    }

    public Faker getFaker() {
        return faker;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public ProgressBarPage getProgressBarPage() {
        return progressBarPage;
    }

    public ToolTipsPage getToolTipsPage() {
        return toolTipsPage;
    }
    public void doubleClick(WebElement element){
        getActions().doubleClick(element).perform();
    }
    public void rightClick (WebElement element){
        getActions().contextClick(element).perform();
    }
    public void hoverOnElement(WebElement element) {
        getActions().moveToElement(element).pause(Duration.ofSeconds(1)).perform();
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Aleksandar//Documents//Selenium//chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C://Users//Aleksandar//Documents//Selenium//chrome.exe");
        driver = new ChromeDriver(co);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver,wait);
        elementsPage=new ElementsPage(driver,wait);
        radioButtonPage= new RadioButtonPage(driver,wait);
        buttonsPage=new ButtonsPage(driver,wait);
        actions=new Actions(driver);
        modalDialogsPage=new ModalDialogsPage(driver,wait);
        faker=new Faker();
        textBoxPage=new TextBoxPage(driver,wait);
        progressBarPage=new ProgressBarPage(driver,wait);
        toolTipsPage=new ToolTipsPage(driver,wait);
    }
    @BeforeMethod
    public void beforeEachTest() {
        getDriver().manage().window().maximize();
    }

    @AfterClass
    public void cleanUp() {
        getDriver().close();
    }
}
