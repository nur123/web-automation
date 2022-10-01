Feature: PDP

  Background:
#    Given user open Tea Tree Skin Clearing Facial Wash detail page
    Given user open bodyshop website
    When user click 1st product image

  @WEBAUTO-368
  Scenario: User unable to set quantity more than 10
    When user click Plus button 12x
    Then qty is 10
