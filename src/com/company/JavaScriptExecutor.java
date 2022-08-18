package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoview();",driver.findElement(By.id("iFrame Example")));


        Thread.sleep(4000);
        driver.quit();
    }

}
