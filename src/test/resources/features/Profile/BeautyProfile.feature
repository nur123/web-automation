Feature: My Account

  @WEBAUTO-389
  Scenario: User update beauty profile successfully
    Given user open bodyshop website
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto14@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "Password123"
    When user click button Masuk
    When user click profile icon
    Then user redirect to profile page
    When user click button beauty profil
    Then user redirect to beauty profile page
    When user click button Ubah Beauty Profile
    When user click on jenis kulit "Berminyak"
    When user click on kondisi kulit "Aging"
    When user click button Simpan
    Then user see alert "Beauty Profile berhasil disimpan"
    And user successfully update beauty profile jenis kulit "Berminyak"
    When user click button Ubah Beauty Profile
    When user click on jenis kulit "Berminyak"
    When user click on kondisi kulit "Aging"
    When user click button Simpan
    Then user see alert "Beauty Profile berhasil disimpan"

