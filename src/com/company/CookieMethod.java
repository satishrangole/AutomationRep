package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookieMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.manage().window().maximize();

        Cookie cookie = new Cookie("Satish", "Rangole");

        driver.manage().addCookie(cookie);

        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie c : cookies){
            System.out.println(c);
        }
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        driver.manage().deleteCookie(cookie);

        Set<Cookie> cookies1 = driver.manage().getCookies();

        for (Cookie c : cookies1){
            System.out.println(c);
        }
        driver.quit();
    }
}

