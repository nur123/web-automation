package locators;

import org.openqa.selenium.By;

public interface CarbonFootprintLocator {

    String LABEL_CARBON_FOOTPRINT = "//h5[normalize-space()='%s']";
    By BUTTON_NEXT_QUESTION = By.xpath("//button[normalize-space()='Next Questions']");
    By BUTTON_BACK = By.xpath("//button[normalize-space()='Back']");
    By JAWABAN_1 = By.xpath("//input[contains(@value,'Iya karena suhu udara naik hingga 1,5 derajat celsius')]");
    By JAWABAN_2 = By.xpath("//input[contains(@value,'Berubahnya kondisi fisik atmosfer bumi antara lain suhu dan distribusi curah hujan yang membawa dampak luas terhadap berbagai sektor kehidupan manusia')]");
    By JAWABAN_3 = By.xpath("//input[contains(@value,'Cuaca ekstrem hanya bagian dari siklus alami bumi')]");
    By JAWABAN_4 = By.xpath("//input[contains(@value,'Gaya hidup yang bertujuan untuk mengurangi dampak lingkungan seseorang, dengan cara yang berkelanjutan baik untuk Bumi maupun untuk orang tersebut')]");
    By JAWABAN_5 = By.xpath("//input[contains(@value,'Membeli produk kebutuhan sehari-hari dengan sistem refill atau curah')]");
    By JAWABAN_6 = By.xpath("//input[contains(@value,'Transportasi pribadi (mobil dan motor berbahan bakar bensin)')]");
    By JAWABAN_7 = By.xpath("//input[contains(@value,'Sesekali menyalakan lampu dan AC pada siang hari, menggunakan air secukupnya')]");
    By JAWABAN_8 = By.xpath("//input[contains(@value,'Selalu membawa tumbler, tas belanja lipat dan wadah untuk membungkus makanan')]");
    By JAWABAN_9 = By.xpath("//input[contains(@value,'Produk yang sesuai kebutuhan dan saya suka, tidak penting tentang bahan atau kemasan dan kampanyenya')]");
    By JAWABAN_10 = By.xpath("//input[contains(@value,'Memilah sampah di rumah, hemat penggunaan listrik dan air, lebih sering menggunakan transportasi umum')]");
    By BUTTON_RESULT = By.xpath("//button[normalize-space()='SEE THE RESULT!']");
    By LABEL_RESULT = By.xpath("//h3[normalize-space()='Congratulations!']");
    By LABEL_FINAL_SCORE = By.xpath("//h6[normalize-space()='YOUR FINAL SCORE IS:']");
    By LABEL_YOU_GOT = By.xpath("//h6[normalize-space()='You got']");
    By TEXT_BTN_CLIMATE_ACTION_NOW = By.xpath("//h5[normalize-space()='Climate action now!']");
    By LABEL_CLIMATE_ACTION_NOW = By.xpath("//h1[normalize-space()='CLIMATE ACTION NOW']");
    By BUTTON_LEARN_MORE = By.xpath("//button[normalize-space()='Learn more about our campaign']");

}
