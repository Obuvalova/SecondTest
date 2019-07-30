package com.ridezum;

import com.ridezum.Page.ApplyDriverPage;
import com.ridezum.Page.HomePage;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class ApplyDriverTest extends BaseTest {

    private HomePage homePage;
    private ApplyDriverPage driverPage;


    @Test
    public void testApplyDriver() throws InterruptedException {
        homePage = new HomePage(driver);
        driverPage = homePage.clickApplyButton();


        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));


        driverPage.inputFirstName("Mariya");
        driverPage.inputLastName("Petrova");
        driverPage.inputEmail("a@gmail.com");
        driverPage.inputPhoneNumber("(123)123-1234");
        driverPage.inputZipCode("111001");
        driverPage.selectRegion();
        driverPage.clickSubmitButton();

        Random random = new Random();
        int randomNumber = random.nextInt(6);
        driverPage.selectRegion(randomNumber);




    }






}
