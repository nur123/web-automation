package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginSteps {

    LoginPage login = new LoginPage();
    RegisterPage register = new RegisterPage();

    @When("user click login link")
    public void userClickLoginButton() {
        login.clickLoginBtn();
    }

    @Then("login popup displayed")
    public void userSeeTipsInformation() {
        Assertions.assertTrue(login.checkLoginPopupDisplayed());
    }

    @When("user fill email field {string}")
    public void userFillEmailPhoneNumber(String text) {
        login.typeEmail(text);
    }

    @When("user fill phone number {string}")
    public void userFillPhoneNumber(String text) {
        login.typeEmail(text);
    }

    @When("user fill password field {string}")
    public void userFillPasswordLogin(String text) {
        login.typePassword(text);
    }

    @When("user click button Masuk")
    public void userClickMasukButton() {
        login.clickMasuk();
    }

    @Then("successfully logged in and alert displayed")
    public void userSeeLoginAlert() {
        Assertions.assertTrue(login.checkLoginAlert());
    }

    @When("user click Masuk Daftar button")
    public void userClickMasukDaftarButton() {
        login.clickMasukDaftar();
    }

    @Then("Verifikasi akun popup successfully displayed")
    public void userSeeVerifykasiAkunPopup() {
        Assertions.assertTrue(login.checkVerifikasiAKunPopupDisplayed());
    }

    @Then("Pilih metode verifikasi akun popup successfully displayed")
    public void userSeePilihMetodeVerifykasiAkunPopup() {
        Assertions.assertTrue(login.checkPilihMetodeVerifikasiAKunPopupDisplayed());
    }

    @Then("Validation error message invalid password displayed {string}")
    public void loginPasswordValidation(String password) {
        Assertions.assertEquals(password,login.verifyLoginPasswordValidation());
    }

    @And("alert login message {string} displayed")
    public void userSeeAlertLogin(String text) {
        Assertions.assertEquals(text,login.verifyPopupAlertLogin());
    }

}
