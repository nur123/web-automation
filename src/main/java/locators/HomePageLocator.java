package locators;

import org.openqa.selenium.By;

public interface HomePageLocator {
    By PRODUK_POPULER = By.xpath("//h1[normalize-space()='Produk Terpopuler']");
    By SHOPPING_BAG = By.xpath("//img[@src='/shopping_bag.svg']");
    By SHOPPING_BAG_COUNTER = By.xpath("(//span[@class='BaseBadge-badge MuiBadge-badge MuiBadge-standard MuiBadge-anchorOriginTopRight MuiBadge-anchorOriginTopRightRectangular MuiBadge-overlapRectangular MuiBadge-colorSecondary css-p7vt6'])[1]");
    By LABEL_TAS_BELANJA = By.xpath("//h1[normalize-space()='Tas Belanja']");
    By LABEL_ISI_TAS = By.xpath("(//div[@class='sm-cta-button text-cp-green-tbs pb-5'])[1]");
    By BAG_PRODUCT_IMAGE = By.xpath("//section[1]//div[1]//span[1]//img[1]");
    By BAG_PRODUCT_NAME = By.xpath("//h5[contains(text(),'Drops of Youth™ Concentrate 30ml')]");
    By BAG_TRASH_ICON = By.xpath("//section[1]//div[2]//div[1]//button[1]//*[name()='svg']");
    By BAG_PRODUCT_PRICE = By.xpath("//div[normalize-space()='Rp299000']");
    By BAG_MIN_BUTTON1 = By.xpath("//section[1]//div[2]//div[3]//div[1]//div[1]//*[name()='svg']");
    By BAG_MIN_BUTTON2 = By.xpath("//section[2]//div[2]//div[3]//div[1]//div[1]//*[name()='svg']");
    By BAG_PLUS_BUTTON1 = By.xpath("//section[1]//div[2]//div[3]//div[1]//div[3]//*[name()='svg']");
    By BAG_PLUS_BUTTON2 = By.xpath("//section[2]//div[2]//div[3]//div[1]//div[3]//*[name()='svg']");
    By BAG_PRODUCT_QTY1 = By.xpath("//section[1]//div[2]//div[3]//div[1]//div[2]");
    String BUTTON_LIHAT_TAS = "//button[contains(text(),'%s')]";
    String BUTTON_LANJUT_BERBERLANJA = "//button[contains(text(),'%s')]";

}
