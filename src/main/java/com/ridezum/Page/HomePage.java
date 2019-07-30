package com.ridezum.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".front-banner__btns a")
    private List<WebElement> applyButtons;

    @FindBy(css =".main-menu__item" )
    private List<WebElement> upperButtons;




    public ApplyDriverPage clickApplyButton() {
        //wait.until(ExpectedConditions.elementToBeClickable(applyButtons.get(1)));
        applyButtons.get(1).click();
        return new ApplyDriverPage(driver);
    }








}
