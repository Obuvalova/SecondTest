package com.ridezum.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ApplyDriverPage extends BasePage {

    public ApplyDriverPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement regionField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private  WebElement phoneNumberField;

    @FindBy(css = "#application_form_zipcode")
    private  WebElement zipCodeField;

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButtonClick;







    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPhoneNumber(String phonNumber) {
        phoneNumberField.sendKeys(phonNumber);
    }

    public void inputZipCode(String zipCode) {
        zipCodeField.sendKeys(zipCode);
    }

    public void selectRegion() {
         Select select = new Select(regionField);
         select.selectByIndex(2);
    }

    public void clickSubmitButton() {

    }

    public void selectRegion(int i) {
        Select select = new Select(regionField);
        select.selectByIndex(i);
    }
















}
