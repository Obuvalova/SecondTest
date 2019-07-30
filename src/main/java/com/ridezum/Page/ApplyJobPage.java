package com.ridezum.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplyJobPage extends BasePage {

    public ApplyJobPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    List<WebElement>Jobs;

    public void clickApplyJobPage() {
        Jobs.get(0).click();

    }












}
