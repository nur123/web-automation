Feature: PDP

  Background:
#    Given user open Tea Tree Skin Clearing Facial Wash detail page
    Given user open bodyshop website
    When user click 1st product image

  @WEBAUTO-363
  Scenario: Slide and see multiple images successfully
    When user click previous slide
    When user click next slide
    Then user see image tile2
    When user click previous slide
    Then user see image tile1

  @WEBAUTO-395
  Scenario: User able to view product information
    When user expand How to Use section
    Then user see How to Use information
#    When user expand Ingredients section
#    Then user see Ingredients information
    When user expand What's Inside section
    Then user see What's Inside informartion
    When user expand Tips section
    Then user see Tips information

  @WEBAUTO-396
  Scenario: User able to increase and decrease qty product before add to cart
    When user click Plus button
    Then qty is 1
    When user click Plus button
    Then qty is 2
    When user click Min button
    Then qty is 1

  @WEBAUTO-397
  Scenario: Add to cart product successfully
    When user click add quantity button on product detail page
    When user click add to cart button on product detail page
    Then user see success ATC popup

  @WEBAUTO-398
  Scenario: Add to wishlist successfully
    When user click love button
    Then love button becomes red

  @WEBAUTO-399
  Scenario: Send email for OOS product successfully
    When user select oos variant product
    When user click button Kabarin Aku, ya!
    Then user see email form popup
    When user click email field on popup
    When user fill email field on popup "testerauto01@gmail.com"
    When user click kirim button on popup

  @WEBAUTO-400
  Scenario: User able to send product reviews
    When user scroll page "900"
    When user click button Review Produk Ini
    Then user see produk review pop up
    When user click review field
    When user fill review field "Ini contoh review produk"
    When user click lama pemakaian field
    When user select lama pemakaian "2 bulan"
    When user merekomendasikan produk "Ya"
    When user click button Review