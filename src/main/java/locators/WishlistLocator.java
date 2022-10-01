package locators;

import org.openqa.selenium.By;

public interface WishlistLocator {

    By BREADCRUMB_WISHLIST = By.xpath("//h5[normalize-space()='wishlist']");
    By LABEL_WISHLIST = By.xpath("//h1[normalize-space()='Wishlist']");

}
