import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("k.shtangey")
@Tag("positive")
@Feature("Проверка курсов валют")
public class HomeWork1 {

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @Test
    @DisplayName("Проверка, что страница курса валют открывается")
    @Description("Проверяем, что страница курсов валют успешно открывается")
    void checkKursiValutelFinance() {
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout = 100000;
        Configuration.timeout = 100000;

        openRambler();
        clickMenu();
        clickMoreButton();
        openCurrencyPage();
        checkPageTitle();
    }

    @Step("Открыть главную страницу Rambler")
    public void openRambler() {
        open("https://www.rambler.ru/");
        Allure.step("Главная страница открыта");
    }

    @Step("Кликнуть по кнопке меню")
    public void clickMenu() {
        $("span.rc__475a6x").click();
    }

    @Step("Кликнуть по кнопке 'Ещё'")
    public void clickMoreButton() {
        $("[data-cerber='tabs::tab_more']").click();
    }

    @Step("Открыть страницу курсов валют")
    public void openCurrencyPage() {
        $$(".rc__6fkms6 li").get(2).click();
    }

    @Step("Проверить заголовок страницы")
    public void checkPageTitle() {
        $("h1").shouldHave(text("Курс валют ЦБ РФ на сегодня"));
    }
}

































//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Condition.*;
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.*;
//
//
//import com.codeborne.selenide.Configuration;
//import com.codeborne.selenide.logevents.SelenideLogger;
//import io.qameta.allure.Description;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.selenide.AllureSelenide;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//
//public class HomeWork1 {
//
//    @BeforeAll
//    static void setup() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//    }
//    @Owner("k.shtangey")
//    @Tag("positive")
//    @Feature("Проверка курсов валют")
//    @Test
//    @DisplayName ("Проверка, что страницы курса валют открывается")
//    @Description("Проверяем, что страница курсов валют успешно открывается")
//    void checkKursiValutelFinance (){
//        Configuration.browser = "chrome"; // выбор браузера
//        Configuration.pageLoadTimeout = 100000; // таймаут прогрузки страницы
//        Configuration.timeout = 100000; // таймаут прогрузки элементов
//
//        open ("https://www.rambler.ru/");
//        $("span.rc__475a6x").click();
//        $("[data-cerber='tabs::tab_more']").click();
//        $$(".rc__6fkms6 li").get(2).click();
//        $("h1.yemDMyhu").shouldHave(text("Курс валют ЦБ РФ на сегодня"));
//
//    }
//}
////Открыть главную страницу
////Кликнуть по кнопке Личные финансы
////Нажать кнопку еще
////Перейти на курсы валют
////Проверить на наличие курса валют