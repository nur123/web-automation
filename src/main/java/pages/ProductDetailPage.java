package pages;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static locators.ProductDetailPageLocator.*;
import static locators.RegisterLocator.*;

public class ProductDetailPage extends BasePageObject {

    public boolean isOnPage() {
        try {
            return isDisplayed(BUTTON_ADD_TO_CART);

        } catch (Exception e) {
            return false;
        }
    }

    public void expandHowToUse() {
        click(LABEL_HOW_TO_USE);
    }

    public boolean checkHowToUseDescriptionDiplayed() {
        try {
            return isDisplayed(LABEL_HOW_TO_USE_DESCRIPTION);

        } catch (Exception e) {
            return false;
        }
    }

    public void expandIngredients() { click(LABEL_INGREDIENTS);}

    public boolean checkIngredientsDescriptionDisplayed() {
        try {
            return isDisplayed(LABEL_INGREDIENTS_DESCRIPTION);

        } catch (Exception e) {
            return false;
        }
    }

    public void expandWhatsInside() { click(LABEL_WHATS_INSIDE);}

    public void expandTips() { click(LABEL_TIPS); }

    public boolean checkTipsDescriptionDisplayed() {
        try {
            return isDisplayed(LABEL_TIPS_DESCRIPTION);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickAddQuantityBtn() {
        click(BUTTON_ADD_QUANTITY);
    }

    public void clickAddToCardBtn() {
        click(BUTTON_ADD_TO_CART);
    }

    public boolean checkPopUpSuccessATCDisplayed() {
        try {
            return isDisplayed(LABEL_POPUP_SUCCESS_ATC);

        } catch (Exception e) {
            return false;
        }
    }

    public void openPDP134030999() {
        openPage("http://sit-2.tbsgroup.co.id/product/134030999");
    }

    //Check product name
    public boolean checkProductName() {
        try {
            return isDisplayed(PRODUCT_NAME);

        } catch (Exception e) {
            return false;
        }
    }

    //Check product description
    public boolean checkProductDescription() {
        try {
            return isDisplayed(PRODUCT_DESCRIPTION);

        } catch (Exception e) {
            return false;
        }
    }

    //Check product description
    public boolean checkProductImage() {
        try {
            return isDisplayed(PRODUCT_IMAGE);

        } catch (Exception e) {
            return false;
        }
    }

    //Image Slider
    public void clickSlider1() {
        waitABit(1);
        click(IMAGE_SLIDER_1);
    }
    public boolean checkImageTile1() {
        try {
            return isDisplayed(IMAGE_TILE_1);

        } catch (Exception e) {
            return false;
        }
    }
    public void clickSlider2() {
        click(IMAGE_SLIDER_2);
    }
    public boolean checkImageTile2() {
        try {
            return isDisplayed(IMAGE_TILE_2);

        } catch (Exception e) {
            return false;
        }
    }
    public void clickSlider3() {
        click(IMAGE_SLIDER_3);
    }
    public boolean checkImageTile3() {
        try {
            return isDisplayed(IMAGE_TILE_3);

        } catch (Exception e) {
            return false;
        }
    }
    public void clickSlider4() {
        click(IMAGE_SLIDER_4);
    }
    public boolean checkImageTile4() {
        try {
            return isDisplayed(IMAGE_TILE_4);

        } catch (Exception e) {
            return false;
        }
    }
    public void clickNextSlide() {
        click(NEXT_SLIDE);
    }
    public void clickPreviousSlide() {
        click(PREVIOUS_SLIDE);
    }

    //Click Image Tile
    public void clickImageTile() {
        click(IMAGE_TILE_1);
    }

    //Click Plus Button
    public void clickPlusButton() {
        waitABit(1);
        click(PLUS_BUTTON);
    }

    //Click Min Button
    public void clickMinButton() {
        waitABit(1);
        click(MIN_BUTTON);
    }

    //value=1
    public Integer verifyQty() {
        return Integer.valueOf(find(QTY_SELECTOR).getText());
    }
//    public String checkQty(By locator) {
//        return find(locator).getText();
//    }

    //value=2
    public Integer verifyQty2() {
        return Integer.valueOf(find(QTY_SELECTOR).getText());
    }

    //wishlist
    public void clickLoveButton() {
        click(LOVE_BUTTON);
    }
    public boolean checkRedLoveButton() {
        try {
            return isDisplayed(RED_LOVE_BUTTON);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickReviewProdukIniButton() {
        waitABit(1);
        click(BUTTON_REVIEW_PRODUK_INI);
    }

    public boolean checkLabelReviewProdukPopup() {
        try {
            return isDisplayed(LABEL_POPUP_REVIEW_PRODUCT);

        } catch (Exception e) {
            return false;
        }
    }

    public void clickReviewField() {
        waitABit(1);
        click(FIELD_REVIEW);
    }

    public void typeReview(String text) {
        WebElement element = find(FIELD_REVIEW);
        element.clear();
        element.sendKeys(text);
    }

    public void clickLamaPemakaianField() {
        click(FIELD_LAMA_PEMAKAIAN);
    }

    public void selectLamaPemakaian(String bulan) {
        By locator = By.xpath(String.format(SELECTION_LAMA_PEMAKAIAN, bulan));
        click(locator);
    }

    public void selectRekomendasi(String data) {
        By locator = By.xpath(String.format(REKOMENDASIKAN_PRODUK, data));
        click(locator);
    }

    public void clickReviewBtn() {
        click(BUTTON_REVIEW);
    }

    public void clickOosVariant() {
        click(SHADE_OOS_VARIANT);
    }

    public void clickKabarinBtn() {
        click(BUTTON_KABARIN_AKU);
    }

    public void clickEmailKabarinBtn() {
        waitABit(1);
        click(KABARIN_AKU_EMAIL_FIELD);
    }

    public void typeEmailKabarinAku(String email) {
        WebElement element = find(KABARIN_AKU_EMAIL_FIELD);
        element.clear();
        element.sendKeys(email);
    }

    public void clickKabarinKirimBtn() {
        click(BUTTON_KABARIN_AKU_KIRIM);
    }

    public void scrollVertical(String nilai){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,"+nilai+")");
    }

}
