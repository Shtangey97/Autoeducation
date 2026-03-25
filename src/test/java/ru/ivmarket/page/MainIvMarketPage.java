package ru.ivmarket.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainIvMarketPage {
    private final SelenideElement cookieAccept = $(".js-lwpcngAccept");
    private final ElementsCollection adToBucket = $$("button");
    private final ElementsCollection bucketIcon = $$("i.icon-cart");

    @Step("Принятие cookies")
    public MainIvMarketPage acceptCookies() {
        cookieAccept.click();
        return this;
    }

    @Step("Добавление трёх товаров в корзину")
    public MainIvMarketPage adThreeElements() {
        adToBucket.get(0).click();
        adToBucket.get(1).click();
        adToBucket.get(2).click();
        return this;
    }

    @Step("Нажатие на иконку корзины")
    public MainIvMarketPage clickIcon() {
        bucketIcon.get(0).click();
        return this;
    }

    @Step("Переход на страницу корзины")
    public BucketIvMarketPage goToBucketPage() {
        return new BucketIvMarketPage();
    }
}
