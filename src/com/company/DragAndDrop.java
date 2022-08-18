package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        driver.manage().window().maximize();

        WebElement srcDrag=driver.findElement(By.id("draggable"));
        WebElement srcDrop= driver.findElement(By.id("droppable"));

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0]..scrollIntoView();",srcDrag );

        Actions actions= new Actions(driver);
        actions.dragAndDrop(srcDrag, srcDrop).perform();

        Thread.sleep(4000);

        driver.close();





    }
}

