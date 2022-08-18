package com.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.annotation.concurrent.ThreadSafe;

public class AlertMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.findElement(By.id("alertbtn")).click();

        Thread.sleep(4000);

        driver.manage().window().maximize();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(4000);
        driver.close();
    }
}