package steps;

import base.BasePageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.ProductDetailPage;

import static locators.ProductDetailPageLocator.QTY_SELECTOR;

public class ProductDetailPageSteps {

    ProductDetailPage productDetailPage = new ProductDetailPage();
    @Then("user redirect to product detail page")
    public void userRedirectToProductDetailPage() {
        Assertions.assertTrue(productDetailPage.isOnPage());
    }

    @When("user expand How to Use section")
    public void userExpandHowToUseSection() {
        productDetailPage.expandHowToUse();
    }

    @Then("user see How to Use information")
    public void userSeeHowToUseInformation() {
        Assertions.assertTrue(productDetailPage.checkHowToUseDescriptionDiplayed());
    }

    @When("user expand Ingredients section")
    public void userExpandIngredientsSection() {
        productDetailPage.expandIngredients();
    }

    @Then("user see Ingredients information")
    public void userSeeIngredientsInformation() {
        Assertions.assertTrue(productDetailPage.checkIngredientsDescriptionDisplayed());
    }

    @When("user expand What's Inside section")
    public void userExpandWhatSInsideSection() {
        productDetailPage.expandWhatsInside();
    }

    @Then("user see What's Inside informartion")
    public void userSeeWhatSInsideInformartion() {
    }

    @When("user expand Tips section")
    public void userExpandTipsSection() {
        productDetailPage.expandTips();
    }

    @Then("user see Tips information")
    public void userSeeTipsInformation() {
        Assertions.assertTrue(productDetailPage.checkTipsDescriptionDisplayed());
    }

    @When("user click add quantity button on product detail page")
    public void userClickAddQuantityButtonOnProductDetailPage() {
        productDetailPage.clickAddQuantityBtn();
    }

    @When("user click add to cart button on product detail page")
    public void userClickAddToCartButtonOnProductDetailPage() {
        productDetailPage.clickAddToCardBtn();
    }

    @Then("user see success ATC popup")
    public void userSeeSuccessATCPopup() {
        Assertions.assertTrue(productDetailPage.checkPopUpSuccessATCDisplayed());
    }

    // PDP Image Slider
    @Given("user open Tea Tree Skin Clearing Facial Wash detail page")
    public void userOpenTeaTreeSkinClearingFacialWash() {
        productDetailPage.openPDP134030999();

        //verify product name
        productDetailPage.checkProductName();

        //verify product description
        productDetailPage.checkProductDescription();

        //verify product image
        productDetailPage.checkProductImage();


    }

    @When("user click on 1st image at thumbnail image slider")
    public void userClickSlider1() {
        productDetailPage.clickSlider1();
    }

    @Then("user see image tile1")
    public void userViewImageTile1() {
        productDetailPage.checkImageTile1();
    }

    @When("user click on 2nd image at thumbnail image slider")
    public void userClickSlider2() {
        productDetailPage.clickSlider2();
    }

    @Then("user see image tile2")
    public void userViewImageTile2() {
        productDetailPage.checkImageTile2();
    }

    @When("user click on 3rd image at thumbnail image slider")
    public void userClickSlider3() {
        productDetailPage.clickSlider3();
    }

    @Then("user see image tile3")
    public void userViewImageTile3() {
        productDetailPage.checkImageTile3();
    }

    @When("user click on 4th image at thumbnail image slider")
    public void userClickSlider4() {
        productDetailPage.clickSlider4();
    }

    @Then("user see image tile4")
    public void userViewImageTile4() {
        productDetailPage.checkImageTile4();
    }

    @When("user click next slide")
    public void userClickNextSlide() {
        productDetailPage.clickNextSlide();
    }

    @When("user click previous slide")
    public void userClickPreviousSlide() {
        productDetailPage.clickPreviousSlide();
    }

    @When("user click on image tile")
    public void userClickImageTile() {
        productDetailPage.clickImageTile();
    }

    @When("user click Plus button")
    public void userClickPlusButton() {
        productDetailPage.clickPlusButton();
    }

    @Then("qty is 1")
    public void qtyIs1() {
        //Assertions.assertTrue(Boolean.parseBoolean(productDetailPage.verifyQty().toString(QTY_SELECTOR)));
        Assertions.assertEquals(1,productDetailPage.verifyQty());
    }

    @Then("qty is 2")
    public void qtyIs2() {
        //Assertions.assertTrue(Boolean.parseBoolean(productDetailPage.verifyQty().toString(QTY_SELECTOR)));
        Assertions.assertEquals(2,productDetailPage.verifyQty2());
    }

    @When("user click Min button")
    public void userClickMinButton() {
        productDetailPage.clickMinButton();
    }

    //Wishlist
    @When("user click love button")
    public void userClickLoveButton() {
        productDetailPage.clickLoveButton();
    }

    @Then("love button becomes red")
    public void userSeeRedLoveButton() {
        Assertions.assertTrue(productDetailPage.checkRedLoveButton());
    }

    @When("user click button Review Produk Ini")
    public void userClickReviewprodukIniButton() {
        productDetailPage.clickReviewProdukIniButton();
    }

    @Then("user see produk review pop up")
    public void userViewProdukReviewPopup() {
        productDetailPage.checkLabelReviewProdukPopup();
    }

    @When("user scroll page {string}")
    public void userScrollVertical(String nilai) {
        productDetailPage.scrollVertical(nilai);
    }

    @When("user click review field")
    public void userClickReviewField() {
        productDetailPage.clickReviewField();
    }

    @When("user fill review field {string}")
    public void userFillReviewField(String text) {
        productDetailPage.typeReview(text);
    }

    @When("user click lama pemakaian field")
    public void userClickLamaPemakaianField() {
        productDetailPage.clickLamaPemakaianField();
    }

    @When("user select lama pemakaian {string}")
    public void userSelectLamaPemakaian(String bulan) {
        productDetailPage.selectLamaPemakaian(bulan);
    }

    @When("user merekomendasikan produk {string}")
    public void userSelectRekomendasiProduk(String data) {
        productDetailPage.selectRekomendasi(data);
    }

    @When("user click button Review")
    public void userClickReview() {
        productDetailPage.clickReviewBtn();
    }

    @When("user select oos variant product")
    public void userSelectOOSVariant() {
        productDetailPage.clickOosVariant();
    }

    @When("user click button Kabarin Aku, ya!")
    public void userClickKabarinAkuBtn() {
        productDetailPage.clickKabarinBtn();
    }

    @When("user click email field on popup")
    public void userClickEmailFieldopPopup() {
        productDetailPage.clickEmailKabarinBtn();
    }

    @When("user fill email field on popup {string}")
    public void userFillEmailFieldonPopup(String email) {
        productDetailPage.typeEmailKabarinAku(email);
    }

    @When("user click kirim button on popup")
    public void userClickKirimOnPopup() {
        productDetailPage.clickKabarinKirimBtn();
    }

    @When("user click Plus button 12x")
    public void userClickPlusBtn12() {
        for (int kali=1; kali<=12; kali++){
            productDetailPage.clickPlusButton();
        }
    }

    @Then("qty is 10")
    public void qtyIs10() {
        Assertions.assertEquals(10,productDetailPage.verifyQty());
    }

}
