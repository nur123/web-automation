package pages;

import base.BasePageObject;

import static locators.HeaderLocator.*;
import static locators.LoginLocator.LABEL_LOGIN;

public class HeaderPage extends BasePageObject {

    public void clickWishlist() {
        waitABit(1);
        click(WISHLIST_ICON);
    }

    public void clickBag() {
        waitABit(1);
        click(BAG_ICON);
    }

    public void clickSearch() {
        waitABit(1);
        click(SEARCH_ICON);
    }

    public boolean checkMiniCartDisplayed() {
        try {
            return isDisplayed(LABEL_MINI_CART);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkBtnLanjutBelanja() {
        try {
            return isDisplayed(BUTTON_LANJUT_BELANJA);
        } catch (Exception e) {
            return false;
        }
    }

    public void clickTBSILogo() {
        click(TBSI_LOGO);
    }

}
