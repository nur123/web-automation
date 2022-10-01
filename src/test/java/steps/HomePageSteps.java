package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();
    @Given("user open bodyshop website")
    public void userOpenBodyshopWebsite() {
        homePage.openHomePage();
    }

}
