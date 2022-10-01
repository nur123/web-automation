package pages;

import base.BasePageObject;
import org.openqa.selenium.By;

import static locators.ProductDetailPageLocator.BUTTON_ADD_TO_CART;
import static locators.ProductDetailPageLocator.LABEL_POPUP_SUCCESS_ATC;
import static locators.PromoKilatSectionLocator.*;

public class PromoKilatSection extends BasePageObject {

    public void clickProductImage(String productName) {
        waitABit(1);
        By locator = By.xpath(String.format(LOCATOR_PRODUCT_IMAGE, productName));
        click(locator);
    }

    public void clickNotifyMeBtn() {
        click(BUTTON_NOTIFY_ME);
    }

    public boolean checkPopUpNotifyMeDisplayed() {
        try {
            return isDisplayed(LABEL_POPUP_KABARI_SAAT_ADA_STOK);

        } catch (Exception e) {
            return false;
        }
    }

//    public boolean checkProductName() {
//        try {
//            return isDisplayed(LABEL_PRODUCT);
//
//        } catch (Exception e) {
//            return false;
//        }
//    }
    public void clickLihatSemuaProduk(String linkName) {
        waitABit(1);
        By locator = By.xpath(String.format(LOCATOR_LIHAT_SEMUA_PRODUK, linkName));
        click(locator);
    }

    public void clickProductImagePertama() {
        waitABit(1);
        click(PRODUCT_IMAGE_PERTAMA);
    }


}
