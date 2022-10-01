Feature: PDP

  Background:
    Given user open Tea Tree Skin Clearing Facial Wash detail page

  Scenario: Send email for OOS product successfully
    When user select oos variant product
    When user click button Kabarin Aku, ya!
    Then user see email form popup
    When user click email field on popup
    When user fill email field on popup "testerauto01@gmail.com"
    When user click kirim button on popup