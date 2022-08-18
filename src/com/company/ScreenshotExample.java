/*package com.company;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

public class ScreenshotExample {

    public static void main(String[] args)  throws InterruptedException {

    ChromeOptions options = new ChromeOptions();
    options.setAcceptInsecureCerts(true);

    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://youtube.com");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(screenshot,new File());
    Thread.sleep(4000);
    driver.close();

}


}
