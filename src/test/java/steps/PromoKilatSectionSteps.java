package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.ProductDetailPage;
import pages.PromoKilatProductListPage;
import pages.PromoKilatSection;

public class PromoKilatSectionSteps {

    PromoKilatSection promoKilatSection = new PromoKilatSection();
    PromoKilatProductListPage promoKilatProductListPage = new PromoKilatProductListPage();

    ProductDetailPage productDetailPage = new ProductDetailPage();

    @When("user click image {string} On promo kilat section")
    public void userClickImageOnPromoKilatSection(String productName) {
        promoKilatSection.clickProductImage(productName);
    }

    @When("user click button {string} On promo kilat section")
    public void userClickLihatSemuaProdukOnPromoKilatSection(String linkName){
        promoKilatSection.clickLihatSemuaProduk((linkName));
    }
    @Then("user redirected to product list page")
    public void userRedirectToPromoKilatProductListPage() {
        Assertions.assertTrue(promoKilatProductListPage.isOnListPage());
    }

    @When("user click 1st product image")
    public void userClick1stProductImage() {
        promoKilatSection.clickProductImagePertama();
    }

    @Then("user redirected to product detail page")
    public void userRedirectToProductDetailPage() {
        Assertions.assertTrue(productDetailPage.isOnPage());
    }


}
