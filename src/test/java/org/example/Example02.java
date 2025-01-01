package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Example02 {

    @Test
    public void test_method(){

        EdgeOptions options=new EdgeOptions();

        options.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(options);

        driver.get("https://www.google.com/");

        driver.close();
    }
}
