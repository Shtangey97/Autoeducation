package ru.ivmarket.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class YandexResultPage {
    private final SelenideElement openSite = $(byText("iv-market.ru"));


    @Step("Открытие сайта iv-market.ru из результатов поиска")
    public YandexResultPage openSiteIvMarket() {
        openSite.click();
        return this;
    }

    @Step("Переключение на новую вкладку и переход на главную страницу iv-market")
    public MainIvMarketPage goToMainPage() {
        switchTo().window(1);
        return new MainIvMarketPage();
    }
}
