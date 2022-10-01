package locators;

import org.openqa.selenium.By;

public interface ProductDetailPageLocator {

    By LABEL_HOW_TO_USE = By.xpath("//h2[contains(text(),'How to use')]");
    By LABEL_HOW_TO_USE_DESCRIPTION = By.xpath("//div[@id='howToUse-content']/div/div");
    By LABEL_INGREDIENTS = By.xpath("//h2[contains(text(),'Ingredients')]");
    By LABEL_INGREDIENTS_DESCRIPTION = By.xpath("//div[@id='ingredient-content']/div/div");
    By LABEL_WHATS_INSIDE = By.xpath("//h2[contains(text(),\"What's Inside\")]");
    By LABEL_TIPS = By.xpath("//h2[contains(text(),'Tips')]");
    By LABEL_TIPS_DESCRIPTION = By.xpath("//div[@id='productTips-content']/div/div");
    By BUTTON_ADD_QUANTITY = By.cssSelector("svg[data-testid='AddIcon']");
    By BUTTON_ADD_TO_CART = By.xpath("//div[contains(@class,'justify-between')]//button[text()='Tambah Ke Tas']");
    By LABEL_POPUP_SUCCESS_ATC = By.xpath("//h3[contains(text(),'Ditambahkan ke Tas')]");
    By PRODUCT_NAME = By.xpath("//h1[normalize-space()='Tea Tree Skin Clearing Facial Wash']");
    By PRODUCT_DESCRIPTION = By.xpath("div[class='color-primary'] div");
    By PRODUCT_IMAGE = By.xpath("(//div[contains(@aria-label,'Go to Slide 1')])[1]");
//    By IMAGE_SLIDER_1 = By.xpath("(//span[@class='image-gallery-thumbnail-inner'])[1]");
    By IMAGE_SLIDER_1 = By.xpath("xpath=//button[1]/span/img");
//    By IMAGE_TILE_1 = By.xpath("//div[contains(@class,'image-gallery-slide-wrapper center')]//div[contains(@aria-label,'Go to Slide 1')]");
    By IMAGE_TILE_1 = By.xpath("xpath=//div/img");
    By IMAGE_SLIDER_2 = By.xpath("(//img[contains(@class,'image-gallery-thumbnail-image')])[2]");
//    By IMAGE_TILE_2 = By.xpath("//div[contains(@class,'image-gallery-slide-wrapper center')]//div[contains(@aria-label,'Go to Slide 2')]");
    By IMAGE_TILE_2 = By.xpath("xpath=//div[2]/img");
    By IMAGE_SLIDER_3 = By.xpath("(//img[contains(@class,'image-gallery-thumbnail-image')])[3]");
    By IMAGE_TILE_3 = By.xpath("(//img[contains(@class,'image-gallery-image')])[3]");
    By IMAGE_SLIDER_4 = By.xpath("(//img[contains(@class,'image-gallery-thumbnail-image')])[4]");
    By IMAGE_TILE_4 = By.xpath("(//img[contains(@class,'image-gallery-image')])[4]");
    By NEXT_SLIDE = By.xpath("//div[@class='image-gallery-slide-wrapper right']//button[@aria-label='Next Slide']");
    By PREVIOUS_SLIDE = By.xpath("//div[@class='image-gallery-slide-wrapper right']//button[@aria-label='Previous Slide']");
    By PLUS_BUTTON = By.xpath("//div[@class='p-2 bg-cp-green-tbs rounded-r-lg cursor-pointer']//*[name()='svg']");
    By MIN_BUTTON = By.xpath("//div[@class='p-2 bg-cp-green-tbs rounded-l-lg cursor-pointer']//*[name()='svg']");
    By QTY_SELECTOR = By.xpath("(//div[@class='self-center border-t-2 border-b-2 px-5 py-2'])[1]");
    By LOVE_BUTTON = By.xpath("(//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary css-1x2u2ek'])[1]");
    By RED_LOVE_BUTTON = By.xpath("(//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary Mui-checked css-1x2u2ek'])[1]");

    By BUTTON_REVIEW_PRODUK_INI = By.xpath("(//button[normalize-space()='Kirim Review'])[1]");
    By LABEL_POPUP_REVIEW_PRODUCT = By.xpath("//h3[normalize-space()='Review Produk']");
    By LABEL_REVIEW = By.xpath("(//h6[@class='text-cp-green-tbs pb-4'])[1]");
    By FIELD_REVIEW = By.xpath("//textarea[@name='review']");
    By LABEL_FOTO = By.xpath("//h6[normalize-space()='Foto (Opsional)']");
    By SELECTOR_FOTO = By.xpath("(//button[@class='w-24 h-24 border-2 rounded-md border-dashed p-5 border-cs-natural-dust bg-cs-natural-nourishing transition duration-700 hover:border-cs-natural-metal'])[1]");
    By LABEL_LAMA_PEMAKAIAN = By.xpath("(//h6[@class='text-cp-green-tbs pb-2'])[2]");
    By FIELD_LAMA_PEMAKAIAN = By.xpath("//div[contains(text(),'1 bulan')]");
    String SELECTION_LAMA_PEMAKAIAN = "//li[normalize-space()='%s']";
    String REKOMENDASIKAN_PRODUK = "//span[normalize-space()='%s']";
    By BUTTON_REVIEW = By.xpath("(//button[normalize-space()='Review'])[1]");
    By SHADE_OOS_VARIANT = By.xpath("(//img)[42]");
    By BUTTON_KABARIN_AKU = By.xpath("//div[contains(@class,'justify-between')]//button[text()='Kabarin Aku, ya!']");
    By KABARIN_AKU_EMAIL_FIELD = By.xpath("//input[@name='email']");
    By BUTTON_KABARIN_AKU_KIRIM = By.xpath("(//button[normalize-space()='Kirim'])[1]");
}
