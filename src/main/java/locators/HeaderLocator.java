package locators;

import org.openqa.selenium.By;

public interface HeaderLocator {

    By BUTTON_LOGIN = By.xpath("//button[contains(text(),'LOGIN')]");
    By PROFILE_ICON = By.xpath("//img[@src='/account.svg']");
    By WISHLIST_ICON = By.xpath("//img[@src='/heart.svg']");
    By SEARCH_ICON = By.xpath("//img[@src='/search.svg']");
//    By BAG_ICON = By.xpath("//img[@src='/shopping_bag.svg']");
    By BAG_ICON = By.xpath("//header/div[1]/div[2]/div[3]/div[1]/div[1]");
    By LABEL_MINI_CART = By.xpath("//h1[contains(text(),'Tas Belanja')]");
    By BUTTON_LANJUT_BELANJA = By.xpath("//button[text()='Lanjut Berbelanja']");
    By TBSI_LOGO = By.xpath("//header/div[1]/div[2]/div[2]/a[1]/span[1]/img[1]");


}
