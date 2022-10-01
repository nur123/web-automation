package pages;

import static locators.ProductDetailPageLocator.LABEL_POPUP_REVIEW_PRODUCT;
import static locators.RegisterLocator.VALIDATE_PASSWORD;
import static locators.StoreLocator.*;
import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StorePage extends BasePageObject {

    public void clickStoreIcon() {
        waitABit(1);
        click(ICON_LOCATION);
    }

    public boolean isOnStorePage() {
        try {
            return isDisplayed(BREADCRUMB_STORES);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickCityStoreName() {
        waitABit(1);
        click(FIELD_NAMA_KOTA_TOKO);
    }

    public void typeCityStoreName(String text) {
        WebElement element = find(FIELD_NAMA_KOTA_TOKO);
        element.clear();
        element.sendKeys(text);
    }

    public void clickCariBtn(String text) {
        By locator = By.xpath(String.format(BUTTON_CARI_STORES, text));
        click(locator);
    }

    public void clickPakaiLokasiBtn(String text) {
        By locator = By.xpath(String.format(BUTTON_PAKAI_LOKASI, text));
        click(locator);
    }

    public boolean checkTitikTokoTerdekat() {
        try {
            return isDisplayed(LABEL_TITIK_TOKO_TERDEKAT);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkDaftarToko() {
        try {
            return isDisplayed(STORE_LIST);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkMap() {
        try {
            return isDisplayed(MAP_VIEW);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickLihatDiPeta() {
        waitABit(1);
        click(BUTTON_LIHATDIPETA);
    }

    public void clickDaftarToko() {
        waitABit(1);
        click(BUTTON_DAFTAR_TOKO);
    }

    public boolean checkImageOOPS() {
        try {
            return isDisplayed(IMAGE_OOPS);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkTextOOPS() {
        try {
            return isDisplayed(TEXT_OOPS);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkTextOOPS2() {
        try {
            return isDisplayed(TEXT_OOPS2);

        } catch (Exception e) {
            return false;
        }
    }

    public String verifyStoreName(String nama) {
        By locator = By.xpath(String.format(STORE_NAME, nama));
        return find(locator).getText();
    }

    public void clickPetunjukArah() {
        click(BUTTON_PETUNJUK_ARAH);
    }

    public Integer verifyJmlToko() {
        String nomor = find(LABEL_JML_TOKO).getText();
        return Integer.valueOf(nomor);
    }


}
