package com.evotor.test.task.aleksandr.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    // Elements
    private SelenideElement

            howMuchIsItDDList = $x("//*[@id ='accordion__heading-0']"),
            howMuchIsItText = $x("//*[contains(text(),'Сутки')]"),
            wannaSeveralScooterDDList = $x("//*[@id ='accordion__heading-1']"),
            wannaSeveralScooterText = $x("//*[contains(text(),'покататься')]"),
            rentalTimeCalculatedDDList = $x("//*[@id ='accordion__heading-2']"),
            rentalTimeCalculatedText = $x("//*[contains(text(),'на 8 мая')]"),
            orderScooterTodayDDList = $x("//*[@id ='accordion__heading-3']"),
            orderScooterTodayText = $x("//*[contains(text(),'с завтрашнего')]"),
            extendOrReturnScooterEarlierDDList = $x("//*[@id ='accordion__heading-4']"),
            extendOrReturnScooterEarlierText = $x("//*[contains(text(),'номеру 1010.')]"),
            bringChargersWithTheScooterDDList = $x("//*[@id ='accordion__heading-5']"),
            bringChargersWithTheScooterText = $x("//*[contains(text(),'на восемь суток')]"),
            cancelAnOrderDDList = $x("//*[@id ='accordion__heading-6']"),
            cancelAnOrderText = $x("//*[contains(text(),'Штрафа не')]"),
            outsideTheMoscowRingRoadDDList = $x("//*[@id ='accordion__heading-7']"),
            outsideTheMoscowRingRoadText = $x("//*[contains(text(),'Всем самокатов!')]");

    // Actions
    @Step("Проверка выпадающего текста")
    public MainPage checkDropdownTextMatches() {
        howMuchIsItDDList.scrollTo().click();
        howMuchIsItText.shouldHave(text("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        wannaSeveralScooterDDList.click();
        wannaSeveralScooterText.shouldHave(text("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, " +
                "можете просто сделать несколько заказов — один за другим."));
        rentalTimeCalculatedDDList.click();
        rentalTimeCalculatedText.shouldHave(text("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды " +
                "начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
        orderScooterTodayDDList.click();
        orderScooterTodayText.shouldHave(text("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
        extendOrReturnScooterEarlierDDList.click();
        extendOrReturnScooterEarlierText.shouldHave(text("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
        bringChargersWithTheScooterDDList.click();
        bringChargersWithTheScooterText.shouldHave(text("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь " +
                "суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
        cancelAnOrderDDList.click();
        cancelAnOrderText.shouldHave(text("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
        outsideTheMoscowRingRoadDDList.click();
        outsideTheMoscowRingRoadText.shouldHave(text("Да, обязательно. Всем самокатов! И Москве, и Московской области."));

        return this;
    }
}
