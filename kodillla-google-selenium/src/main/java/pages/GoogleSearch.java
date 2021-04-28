package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearch extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"zV9nZe\"]/div")
    static WebElement acceptCookies;

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(xpath = "//*[@class=\"g\"]")
    static WebElement searchButton;

    private GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() throws InterruptedException {
        PageFactory.initElements(driver, GoogleSearch.class);
        Thread.sleep(5000);
        acceptCookies.click();
        Thread.sleep(3000);
        inputField.sendKeys("Kodilla");
        Thread.sleep(5000);
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
    }


    public GoogleResults loadResults(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(5000);
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
