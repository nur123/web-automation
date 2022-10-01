Feature: Store Locator

  @WEBAUTO-441
  Scenario: User unable to view store list if there is no TBSI store in that city
    Given user open bodyshop website
    When user click store icon
    Then user redirected to stores page
    When user click city or store name field
    When user fill city name "Purworejo"
    When user click button "Cari"
    Then user see OOPS image
    And user see text Maaf Toko The Body Shop terdekat tidak ditemukan

  @WEBAUTO-442
  Scenario: User unable to view store list if there is no TBSI store in user's current location
    Given user open bodyshop website
    When user click store icon
    Then user redirected to stores page
    When user click button "Pakai Lokasiku"
    Then user see OOPS image
    And user see text Maaf Toko The Body Shop terdekat tidak ditemukan

  @WEBAUTO-473
  Scenario: User unable to view store list if user find store with wrong store name
    Given user open bodyshop website
    When user click store icon
    Then user redirected to stores page
    When user click city or store name field
    When user fill store name "TBS Indah Plaza Bandung"
    When user click button "Cari"
    Then user see OOPS image
    And user see text Maaf Toko The Body Shop terdekat tidak ditemukan