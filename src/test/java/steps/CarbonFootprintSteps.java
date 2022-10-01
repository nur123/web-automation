package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.CarbonFootprintPage;

public class CarbonFootprintSteps {

    CarbonFootprintPage carbon = new CarbonFootprintPage();

    @Given("user open carbon footprint page")
    public void userOpenCarbonFootprintPage() {
        carbon.openCarbonFootprintPage();
    }

    @When("user answer question 1")
    public void userAnswerQuestion1() {
        carbon.answer1();
    }
    @When("user answer question 2")
    public void userAnswerQuestion2() {
        carbon.answer2();
    }
    @When("user answer question 3")
    public void userAnswerQuestion3() {
        carbon.answer3();
    }
    @When("user answer question 4")
    public void userAnswerQuestion4() {
        carbon.answer4();
    }
    @When("user answer question 5")
    public void userAnswerQuestion5() {
        carbon.answer5();
    }
    @When("user answer question 6")
    public void userAnswerQuestion6() {
        carbon.answer6();
    }
    @When("user answer question 7")
    public void userAnswerQuestion7() {
        carbon.answer7();
    }
    @When("user answer question 8")
    public void userAnswerQuestion8() {
        carbon.answer8();
    }
    @When("user answer question 9")
    public void userAnswerQuestion9() {
        carbon.answer9();
    }
    @When("user answer question 10")
    public void userAnswerQuestion10() {
        carbon.answer10();
    }

    @When("user click button Next Question")
    public void userClickNextQuestionBtn() {
        carbon.clickNextQuestion();
    }

    @Then("user see label {string}")
    public void userSeeLabel(String label) {
        carbon.checkQuestionLabel(label);
    }

    @When("user click button See The Result")
    public void userClickSeeResultBtn() {
        carbon.clickResult();
    }

    @Then("user see point result")
    public void userSeePointResult() {
        Assertions.assertTrue(carbon.checkLabelCongratulation());
        Assertions.assertTrue(carbon.checkLabelFinalScore());
        Assertions.assertTrue(carbon.checkLabelYouGot());
    }

    @When("user click button Back")
    public void userCLickBackBtn() {
        carbon.clickBack();
    }

    @When("user click button Climate action now")
    public void userClickClimateActionNowBtn() {
        carbon.clickClimateActionBtn();
    }

    @Then("user redirect to climate action now page")
    public void userRedirectToClimateActionNow() {

        Assertions.assertTrue(carbon.checkLabelClimateActionNow());
    }
}
