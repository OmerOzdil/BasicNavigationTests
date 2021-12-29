package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {

        //Chrome();
        FireFox();
       //Edge();

    }

    private static void FireFox() throws InterruptedException {
        //set the browser type
        WebDriver driver= BrowserFactory.getDriver("firefox");

        driver.get("https://google.com");
        String titleGoogle= driver.getTitle();


        driver.get("https://etsy.com");
        Thread.sleep(1000);
        String titleEtsy=driver.getTitle();

        driver.navigate().back();

        Thread.sleep(1000);
        String titleback=driver.getTitle();

        StringUtility.verifyEquals(titleGoogle,titleback);

        driver.navigate().forward();

        Thread.sleep(1000);
        String titleForward=driver.getTitle();

        StringUtility.verifyEquals(titleEtsy,titleForward);

        driver.quit();



    }

    private static void Edge() throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("edge");

        driver.get("https://google.com");
        String titleGoogle= driver.getTitle();


        driver.get("https://etsy.com");
        Thread.sleep(1000);
        String titleEtsy=driver.getTitle();

        driver.navigate().back();

        Thread.sleep(1000);
        String titleback=driver.getTitle();

        StringUtility.verifyEquals(titleGoogle,titleback);

        driver.navigate().forward();

        Thread.sleep(1000);
        String titleForward=driver.getTitle();

        StringUtility.verifyEquals(titleEtsy,titleForward);

        driver.quit();




    }

    private static void Chrome() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");

        driver.get("https://google.com");
        String titleGoogle= driver.getTitle();


        driver.get("https://etsy.com");
        Thread.sleep(1000);
        String titleEtsy=driver.getTitle();

        driver.navigate().back();

        Thread.sleep(1000);
        String titleback=driver.getTitle();

        StringUtility.verifyEquals(titleGoogle,titleback);

        driver.navigate().forward();

        Thread.sleep(1000);
        String titleForward=driver.getTitle();

        StringUtility.verifyEquals(titleEtsy,titleForward);

        driver.quit();


    }
}
