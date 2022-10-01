Feature: Register to website
  Background:
    Given user on register page

  @WEBAUTO-366
  Scenario: User registration fails if Nama Awal is less than 3 characters
    When user click nama awal field
    When user fill nama awal field "Ir"
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then user see nama awal validation error message "Nama harus lebih dari 3 karakter"

  @WEBAUTO-381
  Scenario: User registration fails if Nama Akhir is empty
    When user click nama akhir field
    When user fill nama akhir field ""
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then user see nama akhir validation error message "\"lastName\" is not allowed to be empty"

  @WEBAUTO-382
  Scenario: User registration fails if email address format is wrong
    When user click email field
    When user fill email registration field "Iron@hotmail"
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then user see email validation error message "Format email salah"

  @WEBAUTO-383
  Scenario: User registration fails if Nomor Ponsel less than 9 digits
    When user click nomor ponsel field
    When user fill nomor ponsel "81211"
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then user see nomor ponsel validation error message "Nomor harus lebih dari 9 digit"

  @WEBAUTO-384
  Scenario: User registration fails if Nomor Ponsel more than 15 digits
    When user click nomor ponsel field
    When user fill nomor ponsel "8771111122222333"
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then user see nomor ponsel validation error message "Nomor harus kurang dari 15 digit"

  @WEBAUTO-385
  Scenario: User registration fails if Kata Sandi less than 8 characters
    When user click kata sandi field
    When user fill kata sandi "passwod"
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then user see password validation error message "Kata sandi harus lebih dari 8 karakter"

  @WEBAUTO-386
  Scenario: User registration fails if Kata Sandi format is wrong
    When user click kata sandi field
    When user fill kata sandi "passwordpassword"
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then user see password validation error message "Ikuti format kata sandi yang diminta"

  @WEBAUTO-387
  Scenario: User registration fails if Ulangi Kata Sandi is not equal with Kata Sandi
    When user click kata sandi field
    When user fill kata sandi "password123"
    When user click ulangi kata sandi field
    When user fill ulangi kata sandi "123password"
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then user see ulangi password validation error message "Kata sandi kamu tidak sama"

