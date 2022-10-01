package locators;

import org.openqa.selenium.By;

public interface LoginLocator {

    By LABEL_LOGIN = By.xpath("//h3[normalize-space()='Masuk / Daftar']");

    By FIELD_EMAIL_NOMOR_PONSEL = By.xpath("//input[@id='username']");

    By FIELD_LOGIN_PASSWORD = By.xpath("//input[@id='password']");

    By BUTTON_MASUK = By.xpath("(//button[normalize-space()='Masuk'])[1]");

//    By LOGIN_ALERT = By.xpath("//div[@id='__next']/div/div/div[2]");
//    By LOGIN_ALERT = By.xpath("(//div[@class='MuiAlert-message css-1xsto0d'])[1]");
    By LOGIN_ALERT = By.xpath("//div[@id='notistack-snackbar']");

    By BUTTON_MASUK_DAFTAR = By.xpath("(//button[normalize-space()='Masuk / Daftar'])[1]");

    By LABEL_VERIFIKASI_AKUN = By.xpath("(//h1[normalize-space()='Verifikasi Akun'])[1]");

    By LABEL_PILIH_METODE_VERIFIKASI = By.xpath("(//div[@class='text-cp-green-tbs italic my-6'])[1]");

    By BUTTON_OK = By.xpath("(//button[normalize-space()='OK'])[1]");

    By LABEL_MASUK_DAFTAR = By.xpath("//h3[normalize-space()='Masuk / Daftar']");

    By FIELD_OTP_1 = By.xpath("(//input[@type='tel'])[1]");

    By FIELD_OTP_2 = By.xpath("(//input[@type='tel'])[2]");

    By FIELD_OTP_3 = By.xpath("(//input[@type='tel'])[3]");

    By FIELD_OTP_4 = By.xpath("(//input[@type='tel'])[4]");

    By FIELD_OTP_5 = By.xpath("(//input[@type='tel'])[5]");

    By FIELD_OTP_6 = By.xpath("(//input[@type='tel'])[6]");

    By BUTTON_VERIFIKASI = By.xpath("(//button[normalize-space()='VERIFIKASI'])[1]");

    By VALIDATE_LOGIN_PASSWORD = By.xpath("//p[@id=':r1k4:-helper-text']");

}
