Feature: Carbon Footprint

  Background:
    Given user open carbon footprint page

  @WEBAUTO-391 @TEST
  Scenario: User get score successfully
    When user answer question 1
    When user click button Next Question
    Then user see label "2 out of 10 Questions!"
    When user answer question 2
    When user click button Next Question
    Then user see label "3 out of 10 Questions!"
    When user answer question 3
    When user click button Next Question
    Then user see label "4 out of 10 Questions!"
    When user answer question 4
    When user click button Next Question
    Then user see label "5 out of 10 Questions!"
    When user answer question 5
    When user click button Next Question
    Then user see label "6 out of 10 Questions!"
    When user answer question 6
    When user click button Next Question
    Then user see label "7 out of 10 Questions!"
    When user answer question 7
    When user click button Next Question
    Then user see label "8 out of 10 Questions!"
    When user answer question 8
    When user click button Next Question
    Then user see label "9 out of 10 Questions!"
    When user answer question 9
    When user click button Next Question
    Then user see label "10 out of 10 Questions!"
    When user answer question 10
    When user click button See The Result
    Then user see point result

  @WEBAUTO-392 @TEST
  Scenario: User able to view previous question and answer
    When user answer question 1
    When user click button Next Question
    Then user see label "2 out of 10 Questions!"
    When user answer question 2
    When user click button Next Question
    Then user see label "3 out of 10 Questions!"
    When user answer question 3
    When user click button Next Question
    Then user see label "4 out of 10 Questions!"
    When user click button Back
    Then user see label "3 out of 10 Questions!"
    When user click button Back
    Then user see label "2 out of 10 Questions!"
    When user click button Back
    Then user see label "1 out of 10 Questions!"

  @WEBAUTO-393 @TEST
  Scenario: User able to view climate action page
    When user answer question 1
    When user click button Next Question
    When user answer question 2
    When user click button Next Question
    When user answer question 3
    When user click button Next Question
    When user answer question 4
    When user click button Next Question
    When user answer question 5
    When user click button Next Question
    When user answer question 6
    When user click button Next Question
    When user answer question 7
    When user click button Next Question
    When user answer question 8
    When user click button Next Question
    When user answer question 9
    When user click button Next Question
    When user answer question 10
    When user click button See The Result
    When user click button Climate action now
    Then user redirect to climate action now page