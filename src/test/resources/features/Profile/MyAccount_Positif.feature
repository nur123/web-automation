Feature: My Account

  @WEBAUTO-438
  Scenario: User view profile successfully
    Given user open bodyshop website
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto14@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "Password123"
    When user click button Masuk
    When user click profile icon
    Then user redirect to profile page
    And user see account name "Ironman Sukamto"
    And user see member number "10000115159582"
    And user see member since "23/08/2022"
    And user see gender "Laki-Laki"
    And user see email "testerauto14@gmail.com"
    And user see kode referral "004"


  @WEBAUTO-439
  Scenario: User able to cancel update data
    Given user open bodyshop website
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto14@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "Password123"
    When user click button Masuk
    When user click profile icon
    Then user redirect to profile page
    When user click button Ubah Profil
    When user click field Nama Lengkap
    When user update Nama Lengkap "Ironman S"
    When user click Batal
    Then user redirect to profile page
    And user see account name "Ironman Sukamto"

  @WEBAUTO-440
  Scenario: User able to access menu in My Account page
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
    When user go back
    When user click button Wishlist
    Then user redirect to wishlist page
    When user go back
    When user click button Membership
    Then user redirect to membership page
    When user go back
    When user click button Pesananku
    Then user redirect to Pesananku page
    When user go back
    When user click button Daftar Vouchermu
    Then user redirect to Daftar Voucher page
    When user go back
    When user click button Riwayat Belanja
    Then user redirect to Riwayat Belanja page
    When user go back
    When user click button Kartu Tersimpan
    Then user redirect to Kartu Tersimpan page
    When user go back
    When user click button Alamat Tersimpan
    Then user redirect to Alamat Tersimpan page
    When user go back
    When user click button Ubah Kata Sandi
    Then user redirect to Ubah Kata Sandi page

  @WEBAUTO-451
  Scenario: user able to view store credit detail in My Account page
    Given user open bodyshop website
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto14@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "Password123"
    When user click button Masuk
    When user click profile icon
    Then user redirect to profile page
    When user click button Lihat Detail
    Then user see detail store credit