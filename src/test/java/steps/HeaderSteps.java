package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HeaderPage;
import pages.RegisterPage;

public class HeaderSteps {

    HeaderPage header = new HeaderPage();
    RegisterPage register = new RegisterPage();

    @When("user click love icon on header")
    public void userClickLoveIcon() {
        header.clickWishlist();
    }

    @When("user click bag icon on header")
    public void userClickBagIcon() {
        header.clickBag();
    }

    @Then("user see product in mini cart")
    public void userSeeMiniCart() {
        Assertions.assertTrue(header.checkMiniCartDisplayed());
        Assertions.assertTrue(header.checkBtnLanjutBelanja());
    }

    @When("user click TBSI logo")
    public void userClickTBSILogo() {
        header.clickTBSILogo();
    }

    @Then("user redirected to homepage")
    public void userRediredtToHomepage() {

        Assertions.assertTrue(register.checkInHomepage());
    }
}
