package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.MyAccountPage;
import pages.ProfilePage;

public class ProfileSteps {

    ProfilePage profile = new ProfilePage();


    @When("user click profile icon")
    public void userClickProfileIcon() {
        profile.clickProfileIcon();
    }

    @Then("user redirect to profile page")
    public void userRedirectProfilePage() {
        Assertions.assertTrue(profile.checkBreadcrumbProfile());
        Assertions.assertTrue(profile.checkLabelProfile());
    }

    @When("user click button beauty profil")
    public void userClickBeautyProfil() {
        profile.clickBeautyProfile();
    }

    @Then("user redirect to beauty profile page")
    public void userRedirectBeautyProfile() {
        Assertions.assertTrue(profile.checkBreadcrumbBeautyProfile());
        Assertions.assertTrue(profile.checkLabelBeautyProfile());
    }

    @When("user click button Ubah Beauty Profile")
    public void userClickUbahBeautyProfileBtn() {
        profile.clickUbahBeautyProfile();
    }

    @When("user click on jenis kulit {string}")
    public void userClickJenisKulit(String text) {
        profile.clickJenisKulit(text);
    }

    @When("user click on kondisi kulit {string}")
    public void userClickKondisiKulit(String text) {
        profile.clickKondisiKulit(text);
    }

    @When("user click button Simpan")
    public void userClickSimpanBtn() {
        profile.clickSimpanBtn();
    }

    @Then("user see alert {string}")
    public void userSeeAlert(String text) {
        Assertions.assertEquals(text,profile.verifyAlertUpdateBeautyProfile());
    }

    @And("user successfully update beauty profile jenis kulit {string}")
    public void userSuccessfullyUpdateBeautyprofile(String jenis) {

        Assertions.assertFalse(profile.checkSelectedJenisKulit(jenis));
    }


}
