package com.evotor.test.task.aleksandr.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class OrderStatus {
    private SelenideElement orderStatusButton = $x("//*[contains(text(),'Статус заказа')]"),
                            setNumberOrder = $x("//*[@placeholder='Введите номер заказа']"),
                            goButton = $x("//*[contains(text(),'Go!')]"),
                            viewButton = $x("//*[contains(text(),'Посмотреть')]");

    @Step("Для кого самокат")
    public OrderStatus actionsInOrderStatus() {
        orderStatusButton.click();
        setNumberOrder.setValue("123");
        goButton.click();
        viewButton.should(Condition.visible);

        return this;
    }
}
