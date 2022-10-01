package pages;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static locators.HeaderLocator.*;
import static locators.LoginLocator.*;
import static locators.RegisterLocator.VALIDATE_EMAIL;
import static locators.RegisterLocator.VALIDATE_PASSWORD;

public class LoginPage extends BasePageObject {

    public void clickLoginBtn() {
        waitABit(1);
        click(BUTTON_LOGIN);
    }

    public boolean checkLoginPopupDisplayed() {
        waitABit(1);
        try {
            return isDisplayed(LABEL_LOGIN);

        } catch (Exception e) {
            return false;
        }
    }

//    public void typeEmail(By locator, CharSequence... text) {
//        WebElement element = find(FIELD_EMAIL_NOMOR_PONSEL);
//        element.clear();
//        element.sendKeys(text);
//    }
    public void typeEmail(String text) {
        WebElement element = find(FIELD_EMAIL_NOMOR_PONSEL);
        element.clear();
        element.sendKeys(text);
    }

    public void typePassword(String text) {
        WebElement element = find(FIELD_LOGIN_PASSWORD);
        element.clear();
        element.sendKeys(text);
    }

    public void clickMasuk() {
        click(BUTTON_MASUK);
    }

    public boolean checkLoginAlert() {
        try {
            return isDisplayed(LOGIN_ALERT);

        } catch (Exception e) {
            return false;
        }
    }

    public String verifyPopupAlertLogin() {
        return find(LOGIN_ALERT).getText();
    }

    public void clickMasukDaftar() {
        click(BUTTON_MASUK_DAFTAR);
    }

    public boolean checkVerifikasiAKunPopupDisplayed() {
        waitABit(2);
        try {
            return isDisplayed(LABEL_VERIFIKASI_AKUN);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkPilihMetodeVerifikasiAKunPopupDisplayed() {
        waitABit(2);
        try {
            return isDisplayed(LABEL_PILIH_METODE_VERIFIKASI);

        } catch (Exception e) {
            return false;
        }
    }

    public String verifyLoginPasswordValidation() {
        return find(VALIDATE_LOGIN_PASSWORD).getText();
    }



}
