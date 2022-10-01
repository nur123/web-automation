Feature: Store Locator

  Background:
    Given user open bodyshop website

  @WEBAUTO-402
  Scenario: Find TBSI stores by fill city name successfully
    When user click store icon
    Then user redirected to stores page
    When user click city or store name field
    When user fill city name "Bandung"
    When user click button "Cari"
    Then Titik lokasi toko terdekat displayed
    And stores list displayed
    And stores name is "TBS Bandung Indah Plaza"
    When user click button lihat di peta
    Then map view displayed
    When user click button daftar toko
    Then stores list displayed

  @WEBAUTO-471
  Scenario: Find TBSI stores by fill store name successfully
    When user click store icon
    Then user redirected to stores page
    When user click city or store name field
    When user fill store name "TBS Bandung Indah Plaza"
    When user click button "Cari"
    Then Titik lokasi toko terdekat displayed
    And stores list displayed
    And stores name is "TBS Bandung Indah Plaza"

  @WEBAUTO-443
  Scenario: User able to view store location on map
    When user click store icon
    Then user redirected to stores page
    When user click city or store name field
    When user fill city name "Bandung"
    When user click button "Cari"
    When user click button Petunjuk arah
    Then map view displayed

  @WEBAUTO-452
  Scenario: User able to view store list if there is TBSI store in user's current location
    When user click store icon
    Then user redirected to stores page
    When user click button "Pakai Lokasiku"
    Then Titik lokasi toko terdekat displayed
    And stores list displayed