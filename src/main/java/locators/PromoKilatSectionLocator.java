package locators;

import org.openqa.selenium.By;

public interface PromoKilatSectionLocator {

    String LOCATOR_PRODUCT_IMAGE = "//img[@alt='%s']";

    By BUTTON_NOTIFY_ME = By.xpath("//button[@id=':r10:']");
   // By BUTTON_ADD_TO_CART = By.xpath("//div[contains(@class,'justify-between')]//button[text()='Tambah Ke Tas']");

    By LABEL_POPUP_KABARI_SAAT_ADA_STOK = By.xpath("//h3[normalize-space()='Kabari saat ada stok, ya']");

    //String PRO

    String LOCATOR_LIHAT_SEMUA_PRODUK = "//a[contains(text(),'%s')]";

    By PRODUCT_IMAGE_PERTAMA = By.xpath("(//div[@class='ProductCard_overlapGrid__4WqHN'])[1]");

    By PROMOKILAT_RIGHT_ARROW = By.xpath("(//*[name()='svg'][@class='absolute top-0 bottom-0 right-2 z-40 m-auto h-9 w-9 cursor-pointer opacity-0 transition hover:scale-125 group-hover:opacity-100'])[1]");

}
