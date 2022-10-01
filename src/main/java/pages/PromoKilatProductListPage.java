package pages;

import base.BasePageObject;

import static locators.PromoKilatProductListPageLocator.*;

public class PromoKilatProductListPage extends BasePageObject{
    public boolean isOnListPage() {
        try {
            return isDisplayed(BREADCRUMB_PRODUCT_LIST_PAGE);

        } catch (Exception e) {
            return false;
        }
    }
}
