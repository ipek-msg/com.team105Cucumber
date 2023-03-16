package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualityDemyPage;
import utilities.ConfigReader;

public class QualityDemyStepDefinations {

    QualityDemyPage qualityDemyPage = new QualityDemyPage();

    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {

        qualityDemyPage.ilkLoginLinki.click();
    }

    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenenUsername) {
        qualityDemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenenUsername));

    }

    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPassword) {
        qualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));

    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualityDemyPage.loginButonu.click();

    }

    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {

        Assert.assertTrue(qualityDemyPage.basariliGirisCoursesLinki.isDisplayed());

    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @And("kullanici kutusuna manuel olarak {string} yazar")
    public void kullaniciKutusunaManuelOlarakYazar(String username) {

        qualityDemyPage.kullaniciEmailKutusu.sendKeys(username);
    }

    @And("password kutusuna manuel olarak {string} yazar")
    public void passwordKutusunaManuelOlarakYazar(String password) {
        qualityDemyPage.passwordKutusu.sendKeys(password);
    }

    @Then("acceptButonuna click yapar")
    public void accept_butonuna_click_yapar() {
        qualityDemyPage.acceptbutonu.click();

    }
}