Feature: Homepage Promo Kilat

  @WEBAUTO-412 @TEST
  Scenario: View all product on promo kilat successfully
    Given user open bodyshop website
    When user click button "Lihat Semua" On promo kilat section
    Then user redirected to product list page

  @WEBAUTO-413 @TEST
  Scenario: View product detail from promo kilat successfully
    Given user open bodyshop website
#    When user click image "Drops Of Youth Youth Concentrate Serum 30ml" On promo kilat section
    When user click 1st product image
    Then user redirected to product detail page
