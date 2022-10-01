package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.StorePage;

import static locators.StoreLocator.STORES_NAME;
import static locators.StoreLocator.STORE_NAME;

public class StoreSteps {

    StorePage store = new StorePage();

    @When("user click store icon")
    public void userClickStoreIcon() {
        store.clickStoreIcon();
    }

    @Then("user redirected to stores page")
    public void userOnStorePage() {
        store.isOnStorePage();
    }

    @When("user click city or store name field")
    public void userClickCityStoreName() {
        store.clickCityStoreName();
    }

    @When("user fill city name {string}")
    public void userFillCityName(String city) {
        store.typeCityStoreName(city);
    }

    @When("user fill store name {string}")
    public void userFillStoreName(String stor) {
        store.typeCityStoreName(stor);
    }

    @When("user click button {string}")
    public void userClickButtonCari(String text) {
        store.clickCariBtn(text);
    }

    @Then("Titik lokasi toko terdekat displayed")
    public void titikLokasiTerdekat() {
        store.checkTitikTokoTerdekat();
    }
    @And("stores list displayed")
    public void storeList() {
        store.checkDaftarToko();
    }

    @And("stores name is {string}")
    public void storeName(String storename) {
        Assertions.assertEquals(storename,store.verifyStoreName(storename));
    }

    @When("user click button lihat di peta")
    public void userClickLihatdiPeta() {
        store.clickLihatDiPeta();
    }

    @Then("map view displayed")
    public void mapView() {
        Assertions.assertTrue(store.checkMap());
    }

    @When("user click button daftar toko")
    public void userClickDaftarToko() {
        store.clickDaftarToko();
    }

    @Then("user see OOPS image")
    public void userSeeOOPSImage() {
        Assertions.assertTrue(store.checkImageOOPS());
    }

    @And("user see text Maaf Toko The Body Shop terdekat tidak ditemukan")
    public void userSeeTextMaaf() {
//        Assertions.assertTrue(store.checkTextOOPS());
        Assertions.assertTrue(store.checkTextOOPS2());
    }

    @When("user click button Petunjuk arah")
    public void userClickPetunjukArahBtn() {
        store.clickPetunjukArah();
    }

}
