package pages;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static locators.ProfileLocator.*;

public class MyAccountPage extends BasePageObject {

    public void clickUbahProfilBtn() {
        waitABit(1);
        click(BUTTON_UBAH_PROFIL);
    }

    public boolean checkUbahProfilPopupDisplayed() {
        waitABit(1);
        try {
            return isDisplayed(LABEL_UBAH_PROFIL);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickBatalBtn() {
        waitABit(1);
        click(BUTTON_BATAL);
    }

    public void clickSimpanBtn() {
        waitABit(1);
        click(BUTTON_SIMPAN_UPDATE);
    }

    public String checkAccountName(String nama) {
        By locator = By.xpath(String.format(DATA_NAMA,nama));
        return find(locator).getText();
    }

    public String checkMemberNumber(String nomor) {
        By locator = By.xpath(String.format(DATA_MEMBER_NUMBER,nomor));
        return find(locator).getText();
    }

    public String checkMemberDate(String tanggal) {
        By locator = By.xpath(String.format(DATA_MEMBER_DATE,tanggal));
        return find(locator).getText();
    }

    public String checkGender(String gender) {
        By locator = By.xpath(String.format(DATA_GENDER,gender));
        return find(locator).getText();
    }

    public String checkMemberEmail(String email) {
        By locator = By.xpath(String.format(DATA_EMAIL,email));
        return find(locator).getText();
    }

    public String checkMemberReferral(String referral) {
        By locator = By.xpath(String.format(DATA_REFERRAL,referral));
        return find(locator).getText();
    }

    public void clickKeluarBtn() {
        waitABit(1);
        click(BUTTON_KELUAR);
    }

    public void clickKonfirmasiBtn() {
        click(BUTTON_KONFIRMASI);
    }

    public void clickGender(String gender) {
        By locator = By.xpath(String.format(INPUT_GENDER,gender));
        click(locator);
    }

    public void clickFieldFullname() {
        waitABit(1);
        click(INPUT_FULLNAME);
    }

    public void fillFullname(String nama) {
        WebElement element = find(INPUT_FULLNAME);
        element.clear();
        element.sendKeys(nama);
    }

    public void clickFieldNickname() {
        waitABit(1);
        click(INPUT_NICKNAME);
    }

    public void fillNickname(String nama) {
        WebElement element = find(INPUT_NICKNAME);
        element.clear();
        element.sendKeys(nama);
    }

    public void navigateBack() {
        waitABit(1);
        getDriver().navigate().back();
    }

    public void clickPhoneNumberField() {
        click(INPUT_PHONE);
    }

    public void fillPhoneNumber(String nomor) {
        WebElement element = find(INPUT_PHONE);
        element.clear();
        element.sendKeys(nomor);
    }

    public void clickEmailField() {
        click(INPUT_EMAIL);
    }

    public void fillEmail(String email) {
        WebElement element = find(INPUT_EMAIL);
        element.clear();
        element.sendKeys(email);
    }

    public void clickTglLahirField() {
        click(INPUT_DOB);
    }

    public void fillTglLahir(String tanggal) {
        WebElement element = find(INPUT_DOB);
        element.clear();
        element.sendKeys(tanggal);
    }

    //WISHLIST
    public void clickWishlist() {
        waitABit(1);
        click(BUTTON_WISHLIST);
    }

    public boolean checkBreadcrumbWishlist() {
        try {
            return isDisplayed(BREADCRUMB_WISHLIST);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelWishlist() {
        try {
            return isDisplayed(LABEL_WISHLIST);

        } catch (Exception e) {
            return false;
        }
    }

    //MEMBERSHIP
    public void clickMembership() {
        waitABit(1);
        click(BUTTON_MEMBERSHIP);
    }

    public boolean checkBreadcrumbMembership() {
        try {
            return isDisplayed(BREADCRUMB_MEMBERSHIP);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelMembership() {
        try {
            return isDisplayed(LABEL_MEMBERSHIP);

        } catch (Exception e) {
            return false;
        }
    }

    //PESANANKU
    public void clickPesananku() {
        waitABit(1);
        click(BUTTON_PESANANKU);
    }

    public boolean checkBreadcrumbPesananku() {
        try {
            return isDisplayed(BREADCRUMB_PESANANKU);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelPesananku() {
        try {
            return isDisplayed(LABEL_PESANANKU);

        } catch (Exception e) {
            return false;
        }
    }

    //DAFTAR VOUCHER
    public void clickDaftarVoucher() {
        waitABit(1);
        click(BUTTON_DAFTAR_VOUCHER);
    }

    public boolean checkBreadcrumbDaftarVoucher() {
        try {
            return isDisplayed(BREADCRUMB_DAFTAR_VOUCHER);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelDaftarVoucher() {
        try {
            return isDisplayed(LABEL_DAFTAR_VOUCHER);

        } catch (Exception e) {
            return false;
        }
    }

    //RIWAYAT BELANJA
    public void clickRiwayatBelanja() {
        waitABit(1);
        click(BUTTON_RIWAYAT_BELANJA);
    }

    public boolean checkBreadcrumbRiwayatBelanja() {
        try {
            return isDisplayed(BREADCRUMB_RIWAYAT_BELANJA);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelRiwayatBelanja() {
        try {
            return isDisplayed(LABEL_RIWAYAT_BELANJA);

        } catch (Exception e) {
            return false;
        }
    }

    //KARTU TERSIMPAN
    public void clickKartuTersimpan() {
        waitABit(1);
        click(BUTTON_KARTU_TERSIMPAN);
    }

    public boolean checkBreadcrumbKartuTersimpan() {
        try {
            return isDisplayed(BREADCRUMB_KARTU_TERSIMPAN);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelKartuTersimpan() {
        try {
            return isDisplayed(LABEL_KARTU_TERSIMPAN);

        } catch (Exception e) {
            return false;
        }
    }

    //ALAMAT TERSIMPAN
    public void clickAlamatTersimpan() {
        waitABit(1);
        click(BUTTON_ALAMAT_TERSIMPAN);
    }

    public boolean checkBreadcrumbAlamatTersimpan() {
        try {
            return isDisplayed(BREADCRUMB_ALAMAT_TERSIMPAN);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelAlamatTersimpan() {
        try {
            return isDisplayed(LABEL_ALAMAT_TERSIMPAN);

        } catch (Exception e) {
            return false;
        }
    }

    //UBAH SANDI
    public void clickUbahSandi() {
        waitABit(1);
        click(BUTTON_UBAH_SANDI);
    }

    public boolean checkBreadcrumbUbahSandi() {
        try {
            return isDisplayed(BREADCRUMB_UBAH_SANDI);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelUbahSandi() {
        try {
            return isDisplayed(LABEL_UBAH_SANDI);

        } catch (Exception e) {
            return false;
        }
    }

    public String verifyUpdateNamaLengkapValidation() {
        return find(VALIDATOR_FULLNAME).getText();
    }

    public String verifyUpdateNomorPonselValidation() {
        return find(VALIDATOR_PHONE).getText();
    }

    public String verifyUpdateEmailValidation() {
        return find(VALIDATOR_EMAIL).getText();
    }

    public String verifyUpdateTanggalLahirValidation() {
        return find(VALIDATOR_DOB).getText();
    }

    public String verifyPasswordValidation() {
        return find(VALIDATOR_PASSWORD).getText();
    }

    public void clickLihatDetail() {
        click(BUTTON_LIHAT_DETAIL);
    }

    public boolean checkLabelDetailStoreCredit() {
        try {
            return isDisplayed(LABEL_DETAIL_STORE_CREDIT);

        } catch (Exception e) {
            return false;
        }
    }


}
