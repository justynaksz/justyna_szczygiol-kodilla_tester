package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearch {

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[3]/span/div/div/div[3]/button[2]")
    static WebElement acceptCookies;

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static WebElement searchButton;

    //u mnie były polskie nazwy, "Szukaj w Google" było w HTMLu tylko raz, dlatego nie ma listy

    private static GoogleResults googleResults;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\IdeaProjects\\kodilla-course\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.navigate().to("http://www.google.com");

        PageFactory.initElements(driver, GoogleSearch.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[2]/div[2]/div[3]/span/div/div/div[3]/button[2]")));
        acceptCookies.click();
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        driver.close();
    }

   public static GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();

        // nie działa kliknięcie w opcję szukania

        GoogleResults googleResults = new GoogleResults();
        return googleResults;
    }
}
