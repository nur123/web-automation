Feature: Register to website
  Background:
    Given user open bodyshop website

  @WEBAUTO-365
  Scenario: Register to website with email successfully
    When user click login link
    When user fill email field "testerauto21@gmail.com"
    When user click Masuk Daftar button
    When user click button ok on verifikasi akun popup
    When user click first OTP field
    When user fill 1st OTP field "0"
    When user fill 2nd OTP field "0"
    When user fill 3rd OTP field "0"
    When user fill 4th OTP field "0"
    When user fill 5th OTP field "0"
    When user fill 6th OTP field "0"
    When user click verifikasi button
    When user click nama awal field
    When user fill nama awal field "Ironman"
    When user click nama akhir field
    When user fill nama akhir field "Sukamto"
    When user click nama panggilan field
    When user fill nama panggilan "Iron"
    When user select jenis kelamin "Male"
    When user click tanggal lahir field
    When user fill tanggal lahir "11012001"
    When user click nomor ponsel field
    When user fill nomor ponsel "8151231237"
    When user click kode referral field
    When user fill kode referral "004"
    When user click kata sandi field
    When user fill kata sandi "Password123"
    When user click ulangi kata sandi field
    When user fill ulangi kata sandi "Password123"
    When user click checkbox kebijakan privasi
    When user click Kirim button
    Then successfully register and alert displayed
