package locators;

import org.openqa.selenium.By;

public interface RegisterLocator {

    By BREADCRUMB_REGISTER = By.xpath("//h5[normalize-space()='register']");

    By LABEL_MEMPERBARUI_DATA = By.xpath("//h2[normalize-space()='Memperbarui Data']");

    By FIELD_NAMA_AWAL = By.xpath("//input[@id='firstName']");

    By FIELD_NAMA_AKHIR = By.xpath("//input[@id='lastName']");

    By FIELD_NAMA_PANGGILAN = By.xpath("//input[@id='nickname']");

    By FIELD_JENIS_KELAMIN_F = By.xpath("//input[@value='F']");

    By FIELD_JENIS_KELAMIN_M = By.xpath("//input[@value='M']");

    String FIELD_JENIS_KELAMIN = "//span[normalize-space()='%s']";

    By FIELD_EMAIL = By.xpath("//input[@id='email']");

    By FIELD_DOB = By.xpath("//input[@id='dob']");

    By FIELD_PHONE_NUMBER = By.xpath("//input[@id='phoneNumber']");

    By FIELD_REFERRAL = By.xpath("//input[@id='referralCode']");

    By FIELD_PASSWORD = By.xpath("//input[@id='password']");

    By FIELD_REPASSWORD = By.xpath("//input[@id='confirmPassword']");

    By CHECKBOX_END = By.xpath("//input[@name='agreement']");

    By BUTTON_KIRIM = By.xpath("(//button[normalize-space()='Kirim'])[1]");

    By VALIDATE_NAMA_AWAL = By.xpath("//p[@id='firstName-helper-text']");

    By VALIDATE_NAMA_AKHIR = By.xpath("//p[@id='lastName-helper-text']");

    By VALIDATE_NAMA_PANGGILAN = By.xpath("//p[@id=':r3:-helper-text']");

    By VALIDATE_EMAIL = By.xpath("//p[@id='email-helper-text']");

    By VALIDATE_DOB = By.xpath("//p[@id='dob-helper-text']");

    By VALIDATE_NOMOR_PONSEL = By.xpath("//p[@id='phoneNumber-helper-text']");

    By VALIDATE_PASSWORD = By.xpath("//p[@id='password-helper-text']");

    By VALIDATE_REPASSWORD = By.xpath("//p[@id='confirmPassword-helper-text']");

//    By REGISTER_ALERT = By.xpath("//body/div/div/div/div[2]");
//    By REGISTER_ALERT = By.xpath("(//div[@class='MuiAlert-message css-1xsto0d'])[1]");
    By REGISTER_ALERT = By.xpath("//div[@id='notistack-snackbar']");

}
