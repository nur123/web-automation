Feature: Login

  Background:
    Given user open bodyshop website

  @WEBAUTO-369 @TEST
  Scenario: User unable to login using unregistered phone number
    When user click login link
    Then login popup displayed
    When user fill phone number "0899123123"
    When user click Masuk Daftar button
    Then Pilih metode verifikasi akun popup successfully displayed

  @WEBAUTO-376 @TEST
  Scenario: User unable to login using unregistered email
    When user click login link
    Then login popup displayed
    When user fill email field "septian@gmail.com"
    When user click Masuk Daftar button
    Then Verifikasi akun popup successfully displayed

#  @WEBAUTO-377
#  Scenario: User unable to login/register using invalid email format
#    When user click login link
#    Then login popup displayed
#    When user fill email field "septian#gmail.com"
#    When user click Masuk Daftar button
#    Then Validation error message invalid email displayed "Format email salah"
#
#  @WEBAUTO-378
#  Scenario: User unable to login/register using phone number less than 9 characters
#    When user click login link
#    Then login popup displayed
#    When user fill phone number "0878123"
#    When user click Masuk Daftar button
#    Then Validation error message invalid phone number displayed "Nomor harus lebih dari 9 digit"
#
#  @WEBAUTO-379
#  Scenario: User unable to login/register using phone number more than 15 characters
#    When user click login link
#    Then login popup displayed
#    When user fill phone number "0878123456789000"
#    When user click Masuk Daftar button
#    Then Validation error message invalid phone number displayed "Nomor harus kurang dari 15 digit"

  @WEBAUTO-380 @TEST
  Scenario: User login fails if password is wrong
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto11@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "123password123"
    When user click button Masuk
    Then Validation error message invalid password displayed "Kata sandi salah"