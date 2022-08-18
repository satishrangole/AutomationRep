package com.company;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32/cromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.id("disabled-button")).isEnabled());
        System.out.println(driver.findElement(By.id("enabled-button")).isEnabled());
        System.out.println(driver.findElement(By.id("show-textbox")).isDisplayed());

        Thread.sleep(4000);
        driver.close();
    }


}
