package locators;

import org.openqa.selenium.By;

public interface StoreLocator {
    By ICON_LOCATION = By.xpath("//a[normalize-space()='']//img[@alt='location']");
    By BREADCRUMB_STORES = By.xpath("//h5[normalize-space()='stores']");
//    By FIELD_NAMA_KOTA_TOKO = By.xpath("(//input[@id=':r5:'])[1]");
//    By FIELD_NAMA_KOTA_TOKO = By.xpath("//div[@placeholder='Masukan nama kota atau toko']//input");
    By FIELD_NAMA_KOTA_TOKO = By.xpath("//input[@id='store-search-input']");
    String BUTTON_CARI_STORES = "(//button[normalize-space()='%s'])[1]";
    String BUTTON_PAKAI_LOKASI = "(//button[normalize-space()='%s'])[1]";
    By LABEL_TITIK_TOKO_TERDEKAT = By.xpath("//h5[normalize-space()='Titik Toko Terdekat']");
    By LABEL_JML_TOKO = By.xpath("/html[1]/body[1]/div[1]/section[2]/div[1]/div[2]/h6[1]");
//    By STORE_LIST = By.xpath("//div[@id='mui-p-68855-P-1']");
    By STORE_LIST = By.xpath("/html[1]/body[1]/div[1]/section[2]/div[1]/div[3]/div[2]/div[1]");
//    By MAP_VIEW = By.xpath("//div[@id='mui-p-68855-P-2']");
    By MAP_VIEW = By.xpath("//div[@id='storeMap']");
    By BUTTON_LIHATDIPETA = By.xpath("//button[normalize-space()='Lihat di Peta']");
    By BUTTON_DAFTAR_TOKO = By.xpath("//button[normalize-space()='Daftar Toko']");
    By IMAGE_OOPS = By.xpath("//img[@alt='Oops']");
    By TEXT_OOPS = By.xpath("//h5[contains(text(),'Maaf! Toko The Body Shop® terdekat tidak ditemukan')]");
    By TEXT_OOPS2 = By.xpath("//p[contains(text(),'Silakan pilih Toko terdekat di daerah lain')]");
    String STORES_NAME = "/html[1]/body[1]/div[1]/section[2]/div[1]/div[3]/div[2]/div[1]/div[%s]/div[1]/h5[1]";
    String STORE_NAME = "//h5[contains(text(),'%s')]";
    By BUTTON_PETUNJUK_ARAH = By.xpath("/html[1]/body[1]/div[1]/section[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/button[1]");


}
