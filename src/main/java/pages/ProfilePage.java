package pages;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static locators.HeaderLocator.*;
import static locators.ProfileLocator.*;
import static locators.PromoKilatSectionLocator.LOCATOR_LIHAT_SEMUA_PRODUK;
import static locators.RegisterLocator.VALIDATE_EMAIL;

public class ProfilePage extends BasePageObject {

    public void clickProfileIcon() {
        waitABit(1);
        click(PROFILE_ICON);
    }

    public boolean checkBreadcrumbProfile() {
        try {
            return isDisplayed(BREADCRUMB_PROFILE);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelProfile() {
        try {
            return isDisplayed(LABEL_PROFIL);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickBeautyProfile() {
        waitABit(1);
        click(BUTTON_BEAUTYPROFILE);
    }

    public boolean checkBreadcrumbBeautyProfile() {
        try {
            return isDisplayed(BREADCRUMB_BEAUTY_PROFILE);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelBeautyProfile() {
        try {
            return isDisplayed(LABEL_BEAUTYPROFILE);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickUbahBeautyProfile() {
        waitABit(1);
        click(BUTTON_UBAH_BEAUTY_PROFILE);
    }

    public void clickJenisKulit(String jenis) {
        waitABit(1);
        By locator = By.xpath(String.format(BUTTON_JENIS_KULIT, jenis));
        click(locator);
    }

    public void clickKondisiKulit(String jenis) {
        waitABit(1);
        By locator = By.xpath(String.format(BUTTON_KONDISI_KULIT, jenis));
        click(locator);
    }

    public void clickSimpanBtn() {
        waitABit(1);
        click(BUTTON_SIMPAN);
    }

    public boolean checkAlertUpdateBeautyProfile() {
        try {
            return isDisplayed(ALERT_UPDATE_BEAUTY_PROFILE);

        } catch (Exception e) {
            return false;
        }
    }

    public String verifyAlertUpdateBeautyProfile() {
        return find(ALERT_UPDATE_BEAUTY_PROFILE).getText();
    }

    public boolean checkSelectedJenisKulit(String jenis) {
        try {
            By locator = By.xpath(String.format(BUTTON_JENIS_KULIT_SELECTED, jenis));
            return isDisplayed(locator);

        } catch (Exception e) {
            return false;
        }
    }





}
