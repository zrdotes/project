package com.evotor.test.task.aleksandr.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class OrderStatusPage {
    private final SelenideElement
            orderStatusButton = $x("//*[contains(text(),'Статус заказа')]"),
            setNumberOrder = $x("//*[@placeholder='Введите номер заказа']"),
            goButton = $x("//*[contains(text(),'Go!')]"),
            viewButton = $x("//*[contains(text(),'Посмотреть')]");

    @Step("Проверить что при вводе некорректных данных статус 'Такого заказа нет'")
    public OrderStatusPage actionsInOrderStatus() {
        orderStatusButton.click();
        setNumberOrder.setValue("123");
        goButton.click();
        viewButton.shouldBe(Condition.visible);

        return this;
    }
}
