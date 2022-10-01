package pages;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static locators.LoginLocator.*;
//import static locators.LoginLocator.BUTTON_VERIFIKASI;
import static locators.PromoKilatSectionLocator.LOCATOR_PRODUCT_IMAGE;
import static locators.RegisterLocator.*;
import static locators.HomePageLocator.*;

public class RegisterPage extends BasePageObject {

//    public void openRegisterPage() {
//        openPage("http://sit-2.tbsgroup.co.id/register");
//    }
    public void openRegisterPage() {

        openPage("https://sit-fe.codina.io/register");
    }
    public boolean isOnRegisterPage() {
        try {
            return isDisplayed(BREADCRUMB_REGISTER);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickOKOnVerifikasiAkun() {
        waitABit(1);
        click(BUTTON_OK);
    }

    public void click1stOtpField() {
        waitABit(1);
        click(FIELD_OTP_1);
    }

    public void type1stOtp(String text) {
        WebElement element = find(FIELD_OTP_1);
        element.clear();
        element.sendKeys(text);
    }

    public void type2ndOtp(String text) {
        WebElement element = find(FIELD_OTP_2);
        element.clear();
        element.sendKeys(text);
    }

    public void type3rdOtp(String text) {
        WebElement element = find(FIELD_OTP_3);
        element.clear();
        element.sendKeys(text);
    }

    public void type4thOtp(String text) {
        WebElement element = find(FIELD_OTP_4);
        element.clear();
        element.sendKeys(text);
    }

    public void type5thOtp(String text) {
        WebElement element = find(FIELD_OTP_5);
        element.clear();
        element.sendKeys(text);
    }

    public void type6thOtp(String text) {
        WebElement element = find(FIELD_OTP_6);
        element.clear();
        element.sendKeys(text);
    }

    public void clickVerifikasiBtn() {
        waitABit(1);
        click(BUTTON_VERIFIKASI);
    }

    public void clickNamaAwal() {
        waitABit(1);
        click(FIELD_NAMA_AWAL);
    }

    public void typeNamaAwal(String text) {
        WebElement element = find(FIELD_NAMA_AWAL);
        element.clear();
        element.sendKeys(text);
    }

    public void clickNamaAkhir() {
        waitABit(1);
        click(FIELD_NAMA_AKHIR);
    }

    public void typeNamaAkhir(String text) {
        WebElement element = find(FIELD_NAMA_AKHIR);
        element.clear();
        element.sendKeys(text);
    }

    public void clickNamaPanggilan() {
        click(FIELD_NAMA_PANGGILAN);
    }

    public void typeNamaPanggilan(String text) {
        WebElement element = find(FIELD_NAMA_PANGGILAN);
        element.clear();
        element.sendKeys(text);
    }

    public void selectJenisKelamin(String kelamin) {
        By locator = By.xpath(String.format(FIELD_JENIS_KELAMIN, kelamin));
        click(locator);
    }

    public void clickEmail() {
        click(FIELD_EMAIL);
    }

    public void typeEmail(String text) {
        WebElement element = find(FIELD_EMAIL);
        element.clear();
        element.sendKeys(text);
    }

    public void clickTanggalLahir() {
        click(FIELD_DOB);
    }

    public void typeTanggalLahir(String text) {
        WebElement element = find(FIELD_DOB);
        element.clear();
        element.sendKeys(text);
    }

    public void clickNomorPonsel() {
        click(FIELD_PHONE_NUMBER);
    }

    public void typeNomorPonsel(String text) {
        WebElement element = find(FIELD_PHONE_NUMBER);
        element.clear();
        element.sendKeys(text);
    }

    public void clickKodeReferral() {
        click(FIELD_REFERRAL);
    }

    public void typeKodeReferral(String text) {
        WebElement element = find(FIELD_REFERRAL);
        element.clear();
        element.sendKeys(text);
    }

    public void clickKataSandi() {
        click(FIELD_PASSWORD);
    }

    public void typeKataSandi(String text) {
        WebElement element = find(FIELD_PASSWORD);
        element.clear();
        element.sendKeys(text);
    }

    public void clickUlangiKataSandi() {
        click(FIELD_REPASSWORD);
    }

    public void typeUlangiKataSandi(String text) {
        WebElement element = find(FIELD_REPASSWORD);
        element.clear();
        element.sendKeys(text);
    }

    public void clickKebijakanPrivasi() {
        click(CHECKBOX_END);
    }

    public void clickKirimBtn() {
        click(BUTTON_KIRIM);
    }

    public String verifyNamaAwalValidation() {
        return find(VALIDATE_NAMA_AWAL).getText();
    }

    public String verifyNamaAkhirValidation() {
        return find(VALIDATE_NAMA_AKHIR).getText();
    }

    public String verifyEmailValidation() {
        return find(VALIDATE_EMAIL).getText();
    }

    public String verifyNomorPonselValidation() {
        return find(VALIDATE_NOMOR_PONSEL).getText();
    }

    public String verifyPasswordValidation() {
        return find(VALIDATE_PASSWORD).getText();
    }

    public String verifyUlangiPasswordValidation() {
        return find(VALIDATE_REPASSWORD).getText();
    }

    public boolean checkRegisterAlert() {
        waitABit(1);
        try {
            return isDisplayed(REGISTER_ALERT);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkInHomepage() {
        waitABit(1);
        try {
            return isDisplayed(PRODUK_POPULER);

        } catch (Exception e) {
            return false;
        }
    }

}
