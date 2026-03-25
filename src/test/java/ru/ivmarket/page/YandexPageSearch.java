package ru.ivmarket.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class YandexPageSearch {
    private final SelenideElement searchInput = $("textarea.search3__input");
    private final SelenideElement submitButton = $("button.search3__button");

    @Step("Ввод поискового запроса")
    public YandexPageSearch search(String query) {
        searchInput.setValue(query);
        return this;
    }

    @Step("Нажатие кнопки поиска")
    public YandexPageSearch clickSearch() {
        submitButton.click();
        return this;
    }

    @Step("Переход на страницу результатов поиска")
    public YandexResultPage goToResultPage() {
        return new YandexResultPage();
    }
}
