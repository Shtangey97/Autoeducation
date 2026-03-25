package ru.ivmarket.bucket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.ivmarket.page.YandexPageSearch;

import static com.codeborne.selenide.Selenide.open;

public class HomeWork2 {
    @Test
    @DisplayName("Добавление 3 товаров в корзину")
    void addThreeItemsToBucket() {
        open("https://ya.ru/", YandexPageSearch.class)
                .search("iv-market")
                .clickSearch()
                .goToResultPage()
                .openSiteIvMarket()
                .goToMainPage()
                .acceptCookies()
                .adThreeElements()
                .clickIcon()
                .goToBucketPage()
                .checkItemsCount(3);
    }
}

//Тест-кейс
//Открыть яндекс
// Написать в посике iv-market.ru
//Нажать поиск
//Открыть сслыку в выдаче
// В новинках перейти по любому товару
//На главной в новинках выбрать 3 товара по очереди
//Перейти в корзину
// Проверить что добаили 3 товара
// Проверить что каждый товар по одной штуке
