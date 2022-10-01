package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.MyAccountPage;

public class MyAccountSteps {

    MyAccountPage akun = new MyAccountPage();

    @And("user see account name {string}")
    public void userSeeAccountName(String nama) {
        Assertions.assertEquals(nama,akun.checkAccountName(nama));
    }

    @And("user see member number {string}")
    public void userSeeMemberNumber(String nomor) {
        Assertions.assertEquals(nomor,akun.checkMemberNumber(nomor));
    }

    @And("user see member since {string}")
    public void userSeeMemberDate(String tanggal) {
        Assertions.assertEquals(tanggal,akun.checkMemberDate(tanggal));
    }

    @And("user see gender {string}")
    public void userSeeGender(String gender) {
        Assertions.assertEquals(gender,akun.checkGender(gender));
    }

    @And("user see email {string}")
    public void userSeeEmail(String email) {
        Assertions.assertEquals(email,akun.checkMemberEmail(email));
    }

    @And("user see kode referral {string}")
    public void userSeeReferral(String referral) {
        Assertions.assertEquals(referral,akun.checkMemberReferral(referral));
    }

    @When("user click button Ubah Profil")
    public void userClickUbahProfil() {
        akun.clickUbahProfilBtn();
    }

    @When("user change gender {string}")
    public void userChangeGender(String gender) {
        akun.clickGender(gender);
    }

    @When("user click Simpan")
    public void userClickSimpan() {
        akun.clickSimpanBtn();
    }

    @When("user click button Konfirmasi")
    public void userClickKonfirmasi() {
        akun.clickKonfirmasiBtn();
    }

    @When("user click field Nama Lengkap")
    public void userClickFieldFullname() {
        akun.clickFieldFullname();
    }

    @When("user update Nama Lengkap {string}")
    public void userFillFullname(String nama) {
        akun.fillFullname(nama);
    }

    @When("user click field Nama Panggilan")
    public void userClickFieldNickname() {
        akun.clickFieldNickname();
    }

    @When("user update Nama Panggilan {string}")
    public void userFillNickname(String nama) {
        akun.fillNickname(nama);
    }

    @When("user click Batal")
    public void userClickBatal() {
        akun.clickBatalBtn();
    }

    @When("user go back")
    public void userGoBack() {
        akun.navigateBack();
    }

    @When("user click field Nomor Ponsel")
    public void userClickNomorPonselField() {
        akun.clickPhoneNumberField();
    }

    @When("user update nomor ponsel {string}")
    public void userFillNomorPonsel(String nomor) {
        akun.fillPhoneNumber(nomor);
    }

    @When("user click field Email")
    public void userClickEmailField() {
        akun.clickEmailField();
    }

    @When("user update email {string}")
    public void userFillEmail(String email) {
        akun.fillEmail(email);
    }

    @When("user click field Tanggal Lahir")
    public void userClickTglLahirField() {
        akun.clickTglLahirField();
    }

    @When("user update Tgl lahir {string}")
    public void userFillTglLahir(String tanggal) {
        akun.fillTglLahir(tanggal);
    }

    //WISHLIST
    @When("user click button Wishlist")
    public void userClickWishlist() {
        akun.clickWishlist();
    }

    @Then("user redirect to wishlist page")
    public void userRedirectToWishlist() {
        Assertions.assertTrue(akun.checkBreadcrumbWishlist());
        Assertions.assertTrue(akun.checkLabelWishlist());
    }

    //MEMBERSHIP
    @When("user click button Membership")
    public void userClickMembership() {
        akun.clickMembership();
    }
    @Then("user redirect to membership page")
    public void userRedirectToMembership() {
        Assertions.assertTrue(akun.checkBreadcrumbMembership());
    }

    //PESANANKU
    @When("user click button Pesananku")
    public void userClickPesananku() {
        akun.clickPesananku();
    }

    @Then("user redirect to Pesananku page")
    public void userRedirectToPesananku() {
        Assertions.assertTrue(akun.checkBreadcrumbPesananku());
        Assertions.assertTrue(akun.checkLabelPesananku());
    }

    //DAFTAR VOUCHER
    @When("user click button Daftar Vouchermu")
    public void userClickDaftarVoucher() {
        akun.clickDaftarVoucher();
    }

    @Then("user redirect to Daftar Voucher page")
    public void userRedirectToDaftarVoucher() {
        Assertions.assertTrue(akun.checkBreadcrumbDaftarVoucher());
        Assertions.assertTrue(akun.checkLabelDaftarVoucher());
    }

    //RIWAYAT BELANJA
    @When("user click button Riwayat Belanja")
    public void userClickRiwayatBelanja() {
        akun.clickRiwayatBelanja();
    }

    @Then("user redirect to Riwayat Belanja page")
    public void userRedirectToRiwayatBelanja() {
        Assertions.assertTrue(akun.checkBreadcrumbRiwayatBelanja());
        Assertions.assertTrue(akun.checkLabelRiwayatBelanja());
    }

    //KARTU TERSIMPAN
    @When("user click button Kartu Tersimpan")
    public void userClickKartuTersimpan() {
        akun.clickKartuTersimpan();
    }

    @Then("user redirect to Kartu Tersimpan page")
    public void userRedirectToKartuTersimpan() {
        Assertions.assertTrue(akun.checkBreadcrumbKartuTersimpan());
        Assertions.assertTrue(akun.checkLabelKartuTersimpan());
    }

    //ALAMAT TERSIMPAN
    @When("user click button Alamat Tersimpan")
    public void userClickAlamatTersimpan() {
        akun.clickAlamatTersimpan();
    }

    @Then("user redirect to Alamat Tersimpan page")
    public void userRedirectToAlamatTersimpan() {
        Assertions.assertTrue(akun.checkBreadcrumbAlamatTersimpan());
        Assertions.assertTrue(akun.checkLabelAlamatTersimpan());
    }

    //UBAH KATA SANDI
    @When("user click button Ubah Kata Sandi")
    public void userClickUbahKataSandi() {
        akun.clickUbahSandi();
    }

    @Then("user redirect to Ubah Kata Sandi page")
    public void userRedirectToUbahKataSandi() {
        Assertions.assertTrue(akun.checkBreadcrumbUbahSandi());
        Assertions.assertTrue(akun.checkLabelUbahSandi());
    }

    @Then("user see fullname error message {string}")
    public void userSeeFullnameErrorMessage(String message) {
        Assertions.assertEquals(message,akun.verifyUpdateNamaLengkapValidation());
    }

    @Then("user see phone number error message {string}")
    public void userSeePhoneNumberErrorMessage(String message) {
        Assertions.assertEquals(message,akun.verifyUpdateNomorPonselValidation());
    }

    @Then("user see email error message {string}")
    public void userSeeEmailErrorMessage(String message) {
        Assertions.assertEquals(message,akun.verifyUpdateEmailValidation());
    }

    @Then("user see tanggal lahir error message {string}")
    public void userSeeTanggalLahirErrorMessage(String message) {
        Assertions.assertEquals(message,akun.verifyUpdateTanggalLahirValidation());
    }

    @Then("user see password error message {string}")
    public void userSeePasswordErrorMessage(String message) {
        Assertions.assertEquals(message,akun.verifyPasswordValidation());
    }

    @When("user click button Lihat Detail")
    public void userClickLihatDetail() {
        akun.clickLihatDetail();
    }

    @Then("user see detail store credit")
    public void userSeeDetailStoreCredit() {
        Assertions.assertTrue(akun.checkLabelDetailStoreCredit());
    }

}
