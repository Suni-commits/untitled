package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Example03 {

    @Test
    public void test_launchBrowser() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(5000);

        WebElement Email = driver.findElement(By.xpath("//input[@id='username']"));
        Email.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123456");

        WebElement Signin = driver.findElement(By.xpath("//button[@id='frm-btn']"));

        Signin.click();

        Thread.sleep(20000);

        // Corrected XPath expression here
        WebElement alert = driver.findElement(By.xpath("//h5[@class='id-card-title']"));

        System.out.println("The message showing after logged in: " + alert.getText());

        driver.quit();
    }
}
