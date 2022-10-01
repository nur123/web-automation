package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.RegisterPage;

public class RegisterSteps {

    RegisterPage register = new RegisterPage();
    @Given("user on register page")
    public void userOnRegisterPage() {
        register.openRegisterPage();
    }

    @When("user click button ok on verifikasi akun popup")
    public void userClickOK() {
        register.clickOKOnVerifikasiAkun();
    }

    @When("user click first OTP field")
    public void userClickFirstOTPField() {
        register.click1stOtpField();
    }

    @When("user fill 1st OTP field {string}")
    public void userFill1stOtp(String text) {
        register.type1stOtp(text);
    }

    @When("user fill 2nd OTP field {string}")
    public void userFill2ndOtp(String text) {
        register.type2ndOtp(text);
    }

    @When("user fill 3rd OTP field {string}")
    public void userFill3rdOtp(String text) {
        register.type3rdOtp(text);
    }

    @When("user fill 4th OTP field {string}")
    public void userFill4thOtp(String text) {
        register.type4thOtp(text);
    }

    @When("user fill 5th OTP field {string}")
    public void userFill5thOtp(String text) {
        register.type5thOtp(text);
    }

    @When("user fill 6th OTP field {string}")
    public void userFill6thOtp(String text) {
        register.type6thOtp(text);
    }
    @When("user click verifikasi button")
    public void userClickVerifikasiBtn() {
        register.clickVerifikasiBtn();
    }

    @Then("user redirect to register form")
    public void userRedirectToRegisterPage() {
        Assertions.assertTrue(register.isOnRegisterPage());
    }

    @When("user click nama awal field")
    public void userClickNamaAwal() {
        register.clickNamaAwal();
    }

    @When("user fill nama awal field {string}")
    public void userFillNamaAwal(String text) {
        register.typeNamaAwal(text);
    }

    @When("user click nama akhir field")
    public void userClickNamaAkhir() {
        register.clickNamaAkhir();
    }

    @When("user fill nama akhir field {string}")
    public void userFillNamaAkhir(String text) {
        register.typeNamaAkhir(text);
    }

    @When("user click nama panggilan field")
    public void userClickNamaPanggilan() {
        register.clickNamaPanggilan();
    }

    @When("user fill nama panggilan {string}")
    public void userFillNamaPanggilan(String text) {
        register.typeNamaPanggilan(text);
    }

    @When("user select jenis kelamin {string}")
    public void userSelectJenisKelamin(String kelamin) {
        register.selectJenisKelamin(kelamin);
    }

    @When("user click tanggal lahir field")
    public void userClickTanggalLahir() {
        register.clickTanggalLahir();
    }

    @When("user fill tanggal lahir {string}")
    public void userFillTanggalLahir(String text) {
        register.typeTanggalLahir(text);
    }

    @When("user click nomor ponsel field")
    public void userClickNomorPonsel() {
        register.clickNomorPonsel();
    }

    @When("user fill nomor ponsel {string}")
    public void userFillNomorPonsel(String text) {
        register.typeNomorPonsel(text);
    }

    @When("user click kode referral field")
    public void userClickKodeReferral() {
        register.clickKodeReferral();
    }

    @When("user fill kode referral {string}")
    public void userFillKodeReferral(String text) {
        register.typeKodeReferral(text);
    }

    @When("user click kata sandi field")
    public void userClickKataSandi() {
        register.clickKataSandi();
    }

    @When("user fill kata sandi {string}")
    public void userFillKataSandi(String text) {
        register.typeKataSandi(text);
    }

    @When("user click ulangi kata sandi field")
    public void userClickUlangiKataSandi() {
        register.clickUlangiKataSandi();
    }

    @When("user fill ulangi kata sandi {string}")
    public void userFillUlangiKataSandi(String text) {
        register.typeUlangiKataSandi(text);
    }

    @When("user click checkbox kebijakan privasi")
    public void userClickKebijakanPrivasi() {
        register.clickKebijakanPrivasi();
    }

    @When("user click Kirim button")
    public void userClickKirimBtn() {
        register.clickKirimBtn();
    }

    @Then("user see nama awal validation error message {string}")
    public void namaAwalValidation(String nama) {
        Assertions.assertEquals(nama,register.verifyNamaAwalValidation());
    }

    @Then("user see nama akhir validation error message {string}")
    public void namaAkhirValidation(String nama) {
        Assertions.assertEquals(nama,register.verifyNamaAkhirValidation());
    }

    @When("user click email field")
    public void userClickEmail() {
        register.clickEmail();
    }

    @When("user fill email registration field {string}")
    public void userFillEmailRegistration(String email){
        register.typeEmail(email);
    }


    @Then("user see email validation error message {string}")
    public void emailValidation(String email) {
        Assertions.assertEquals(email,register.verifyEmailValidation());
    }

    @Then("user see nomor ponsel validation error message {string}")
    public void nomorPonselValidation(String nomor) {
        Assertions.assertEquals(nomor,register.verifyNomorPonselValidation());
    }

    @Then("user see password validation error message {string}")
    public void passwordValidation(String password) {
        Assertions.assertEquals(password,register.verifyPasswordValidation());
    }

    @Then("user see ulangi password validation error message {string}")
    public void ulangiPasswordValidation(String password) {
        Assertions.assertEquals(password,register.verifyUlangiPasswordValidation());
    }

    @Then("successfully register and alert displayed")
    public void userSeeLoginAlert() {
        Assertions.assertTrue(register.checkInHomepage());
//        Assertions.assertTrue(register.checkRegisterAlert());
    }


}
