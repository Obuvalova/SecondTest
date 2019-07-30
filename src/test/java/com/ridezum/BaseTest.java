package com.ridezum;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected User user;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pablo\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://ridezum.com/");



        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "Zūm | Your school’s one-stop partner for safe & reliable student transportation";

        Assert.assertEquals(expectedTitle,actualTitle);








        user = new User("Ivan","Ivanov","a@gmail.com","(123)123-1234","NYC","11101");




    }





    @After
    public void quite() {
        //driver.quit();
    }



}
