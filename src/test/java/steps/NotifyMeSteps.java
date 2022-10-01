package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.PromoKilatSection;

public class NotifyMeSteps {

    PromoKilatSection promoKilatSection = new PromoKilatSection();

    @When("user click button Kabarin Aku, ya! On promo kilat section")
    // Verify product name
//    public void verifyProductname() {
//
//    }
    // Click button notify me
    public void userClickNotifyMeButton() {
        promoKilatSection.clickNotifyMeBtn();
    }

    @Then("user see email form popup")
    public void userSeeNotifyMePopup() {
        Assertions.assertTrue(promoKilatSection.checkPopUpNotifyMeDisplayed());
    }

}
