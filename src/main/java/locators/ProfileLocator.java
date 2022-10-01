package locators;

import org.openqa.selenium.By;

public interface ProfileLocator {

    By BREADCRUMB_PROFILE = By.xpath("//h5[contains(text(),'my account')]");
    By LABEL_PROFIL = By.xpath("//h1[contains(text(),'Profil')]");
    By BUTTON_BEAUTYPROFILE = By.xpath("(//a[normalize-space()='BEAUTY PROFILE'])[1]");
    By BREADCRUMB_BEAUTY_PROFILE = By.xpath("//h5[contains(text(),'beauty profile')]");
    By LABEL_BEAUTYPROFILE = By.xpath("//h1[normalize-space()='Beauty Profile']");
    By BUTTON_UBAH_BEAUTY_PROFILE = By.xpath("(//button[normalize-space()='Ubah Beauty Profile'])[1]");
    String BUTTON_JENIS_KULIT = "//span[contains(@label,'%s')]";
    String BUTTON_JENIS_KULIT_SELECTED = "//span[contains(@label,'%s')]//svg[data-testid='CheckIcon']";
//    String BUTTON_JENIS_KULIT_SELECTED = "//span[contains(@label,'%s')]//div[contains(@class,'flex flex-col items-center justify-center gap-2 text-center p-4 rounded-md w-20 h-full MuiBox-root css-r5k14k')]//*[name()='svg']";
    String BUTTON_KONDISI_KULIT = "//span[contains(@label,'%s')]";
    By BUTTON_SIMPAN = By.xpath("(//button[normalize-space()='Simpan'])[1]");
    By ALERT_UPDATE_BEAUTY_PROFILE = By.xpath("//div[@id='notistack-snackbar']");
    By LABEL_HALO = By.xpath("//h2[contains(text(),'Halo,')]");
    String DATA_NAMA = "//h1[contains(text(),'%s')]";
    String DATA_MEMBER_NUMBER = "//p[contains(text(),'%s')]";
    String DATA_MEMBER_DATE = "//h4[contains(text(),'%s')]";
    String DATA_GENDER = "//h4[contains(text(),'%s')]";
    String DATA_EMAIL = "//h4[contains(text(),'%s')]";
    String DATA_REFERRAL = "//h4[contains(text(),'%s')]";
    By BUTTON_UBAH_PROFIL = By.xpath("(//button[normalize-space()='Ubah Profil'])[1]");
    By BUTTON_KELUAR = By.xpath("//button[@id=':rj:']");
    String DATA_STORE_CREDIT = "//h2[normalize-space()='%s']";
    By BUTTON_LIHAT_DETAIL = By.xpath("(//button[normalize-space()='Lihat Detail'])[1]");
    By LABEL_DETAIL_STORE_CREDIT = By.xpath("//h2[contains(text(),'Detail Store Credit')]");
    String PROFIL_MENU_BUTTON = "(//a[normalize-space()='%s'])[1]";

    //POPUP UBAH PROFIL
    By LABEL_UBAH_PROFIL = By.xpath("//h2[contains(text(),'Ubah Profil')]");
    By INPUT_FULLNAME = By.xpath("//input[@id='fullName']");
    By INPUT_NICKNAME = By.xpath("//input[@id='nickName']");
    By INPUT_PHONE = By.xpath("//input[@id='phone']");
    By INPUT_EMAIL = By.xpath("//input[@id='email']");
    String INPUT_GENDER = "//span[contains(text(),'%s')]";
    By INPUT_DOB = By.xpath("//input[@id='dob']");
    By BUTTON_BATAL = By.xpath("(//button[normalize-space()='Batal'])[1]");
    By BUTTON_SIMPAN_UPDATE = By.xpath("(//button[normalize-space()='Simpan'])[1]");
    By BUTTON_KONFIRMASI = By.xpath("(//button[normalize-space()='Konfirmasi'])[1]");
    By VALIDATOR_FULLNAME = By.xpath("//p[@id='fullName-helper-text']");
    By VALIDATOR_PHONE = By.xpath("//p[@id='phone-helper-text']");
    By VALIDATOR_EMAIL = By.xpath("//p[@id='email-helper-text']");
    By VALIDATOR_DOB = By.xpath("//p[@id='dob-helper-text']");
    By VALIDATOR_PASSWORD  = By.xpath("//p[@id='password-helper-text']");


    //WISHLIST
    By BUTTON_WISHLIST = By.xpath("(//a[normalize-space()='WISHLIST'])[1]");
    By BREADCRUMB_WISHLIST = By.xpath("//h5[normalize-space()='wishlist']");
    By LABEL_WISHLIST = By.xpath("//h1[normalize-space()='Wishlist']");

    //MEMBERSHIP
    By BUTTON_MEMBERSHIP = By.xpath("(//a[@id=':rc:'])[1]");
    By BREADCRUMB_MEMBERSHIP = By.xpath("//h5[normalize-space()='membership']");
    By LABEL_MEMBERSHIP = By.xpath("//h1[normalize-space()='Membership']");

    //PESANANKU
    By BUTTON_PESANANKU = By.xpath("(//a[normalize-space()='PESANANKU'])[1]");
    By BREADCRUMB_PESANANKU = By.xpath("//h5[normalize-space()='my order']");
    By LABEL_PESANANKU = By.xpath("//h1[normalize-space()='Pesananku']");

    //VOUCHER
    By BUTTON_DAFTAR_VOUCHER = By.xpath("(//a[normalize-space()='DAFTAR VOUCHERMU'])[1]");
    By BREADCRUMB_DAFTAR_VOUCHER = By.xpath("//h5[normalize-space()='my voucher']");
    By LABEL_DAFTAR_VOUCHER = By.xpath("//h1[normalize-space()='Voucher yang Ada']");

    //RIWAYAT BELANJA
    By BUTTON_RIWAYAT_BELANJA = By.xpath("(//a[normalize-space()='RIWAYAT BELANJA'])[1]");
    By BREADCRUMB_RIWAYAT_BELANJA = By.xpath("//h5[normalize-space()='shopping history']");
    By LABEL_RIWAYAT_BELANJA = By.xpath("//h1[normalize-space()='Riwayat Belanja']");

    //KARTU TERSIMPAN
    By BUTTON_KARTU_TERSIMPAN = By.xpath("(//a[normalize-space()='KARTU TERSIMPAN'])[1]");
    By BREADCRUMB_KARTU_TERSIMPAN = By.xpath("//h5[normalize-space()='saved cards']");
    By LABEL_KARTU_TERSIMPAN = By.xpath("//h1[normalize-space()='Kartu Tersimpan']");

    //ALAMAT TERSIMPAN
    By BUTTON_ALAMAT_TERSIMPAN = By.xpath("(//a[normalize-space()='ALAMAT TERSIMPAN'])[1]");
    By BREADCRUMB_ALAMAT_TERSIMPAN = By.xpath("//h5[normalize-space()='saved address']");
    By LABEL_ALAMAT_TERSIMPAN = By.xpath("//h1[contains(text(),'Alamat Tersimpan')]");

    //UBAH SANDI
    By BUTTON_UBAH_SANDI = By.xpath("(//a[normalize-space()='UBAH KATA SANDI'])[1]");
    By BREADCRUMB_UBAH_SANDI = By.xpath("//h5[normalize-space()='change password']");
    By LABEL_UBAH_SANDI = By.xpath("//h1[normalize-space()='Ubah Kata Sandi']");

}
