package ru.ivmarket.page;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$$;

public class BucketIvMarketPage {
    private final ElementsCollection qtyInputs = $$("input.qty");

    @Step("Проверка количества товаров в корзине: ожидаемо - 3")
    public BucketIvMarketPage checkItemsCount(int expected) {
        qtyInputs.shouldHave(size(expected));
        return this;
    }
}

