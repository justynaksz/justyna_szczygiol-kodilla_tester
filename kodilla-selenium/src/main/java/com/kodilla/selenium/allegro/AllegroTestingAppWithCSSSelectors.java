package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppWithCSSSelectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement categoryCombo = driver.findElement(By.cssSelector("div > select"));
        Select select = new Select(categoryCombo);
        select.selectByIndex(3);

        WebElement input = driver.findElement(By.cssSelector("div > input"));
        input.sendKeys("Mavic mini");
        input.submit();

        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select > article")));

        List<WebElement> articles = driver.findElements(By.cssSelector("select > article"));
        articles.forEach(n -> n.getText());
    }
}