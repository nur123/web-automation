package pages;

import base.BasePageObject;
import org.openqa.selenium.By;

import static locators.CarbonFootprintLocator.*;

public class CarbonFootprintPage extends BasePageObject {

    public void openCarbonFootprintPage() {
        openPage("http://sit-2.tbsgroup.co.id/carbon-footprint");
    }

    public boolean checkQuestionLabel(String text) {
//        waitABit(1);
        try {
            By locator = By.xpath(String.format(LABEL_CARBON_FOOTPRINT, text));
            return isDisplayed(locator);

        } catch (Exception e) {
            return false;
        }
    }

    public void answer1() {
        click(JAWABAN_1);
    }
    public void answer2() {
        click(JAWABAN_2);
    }
    public void answer3() {
        click(JAWABAN_3);
    }
    public void answer4() {
        click(JAWABAN_4);
    }
    public void answer5() {
        click(JAWABAN_5);
    }
    public void answer6() {
        click(JAWABAN_6);
    }
    public void answer7() {
        click(JAWABAN_7);
    }
    public void answer8() {
        click(JAWABAN_8);
    }
    public void answer9() {
        click(JAWABAN_9);
    }
    public void answer10() {
        click(JAWABAN_10);
    }

    public void clickNextQuestion() {
        click(BUTTON_NEXT_QUESTION);
    }

    public void clickBack() {
        click(BUTTON_BACK);
    }

    public void clickResult() {
        click(BUTTON_RESULT);
    }

    public void clickLearnMore() {
        click(BUTTON_LEARN_MORE);
    }

    public boolean checkLabelFinalScore() {
        waitABit(1);
        try {
            return isDisplayed(LABEL_FINAL_SCORE);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelCongratulation() {
        waitABit(1);
        try {
            return isDisplayed(LABEL_RESULT);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkLabelYouGot() {
        waitABit(1);
        try {
            return isDisplayed(LABEL_YOU_GOT);
        } catch (Exception e) {
            return false;
        }
    }

    public void clickClimateActionBtn() {
        click(TEXT_BTN_CLIMATE_ACTION_NOW);
    }

    public boolean checkLabelClimateActionNow() {
        waitABit(1);
        try {
            return isDisplayed(LABEL_CLIMATE_ACTION_NOW);
        } catch (Exception e) {
            return false;
        }
    }

}
