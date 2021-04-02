package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement categoryCombo = driver.findElement(By.xpath("//+[@class=\"mp7g_oh mr3m_1 _r65gb\"]/select"));
        Select select = new Select(categoryCombo);
        select.selectByIndex(3);

        WebElement input = driver.findElement(By.name("string"));
        input.sendKeys("Mavic mini");
        input.submit();
    }
}
