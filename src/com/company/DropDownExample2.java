package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample2 {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
    WebElement drpdown = driver.findElement(By.name("Month"));

    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoview();",drpdown);

    Select select = new Select(drpdown);

    select.selectByVisibleText("February");
    Thread.sleep(4000);
    select.selectByIndex(4);
    Thread.sleep(4000);
    select.selectByValue("Ap");
    Thread.sleep(4000);
    select.selectByIndex(6);
    Thread.sleep(4000);
    select.deselectByValue("dec");
    Thread.sleep(4000);
    select.selectByVisibleText("October");
    Thread.sleep(3000);

    select.deselectByValue("Ap");
    select.selectByVisibleText("February");
    select.selectByIndex(6);
    select.selectByVisibleText("October");
    select.deselectAll();

    driver.close();

}

}




