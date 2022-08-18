package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumExample3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("satishrangole1991@gmail.com");
        Thread.sleep(3000);
        //name
        driver.findElement(By.name("login")).sendKeys("52945640Ka@");
        Thread.sleep(3000);

        //classname
        driver.findElement(By.className("signinbtn")).click();

        Thread.sleep(3000);

        //Tagname
        driver.findElement(By.tagName("input"));

        //LinkText
        driver.findElement(By.linkText("Forgot Password?")).click();
        Thread.sleep(3000);

        //partialLinkText
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(3000);

        //Xpath
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        Thread.sleep(3000);


        List<WebElement> elements = driver.findElements(By.tagName("input"));
        for( WebElement e : elements){
            System.out.println(e);

        }

        driver.close();

    }
}
