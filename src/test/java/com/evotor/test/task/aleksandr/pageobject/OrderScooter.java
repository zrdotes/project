package com.evotor.test.task.aleksandr.pageobject;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class OrderScooter {

    // Elements

    private SelenideElement
            orderSamokatButton = $x("//button[@class='Button_Button__ra12g']"),
            nameField = $x("//input[@type='text'][@placeholder='* Имя']"),
            surNameField = $x("//input[@type='text'][@placeholder='* Фамилия']"),
            addressField = $x("//input[@type='text'][@placeholder='* Адрес: куда привезти заказ']"),
            metroStationField = $x("//input[@placeholder='* Станция метро']"),
            cherkizovskayaStation = $x("//*[contains(text(),'Черкизовская')]"),
            numberField = $x("//input[@placeholder='* Телефон: на него позвонит курьер']"),
            nextButton = $x("//*[contains(text(),'Далее')]"),
            whenBringScooterField = $x("//*[@placeholder='* Когда привезти самокат']"),
            julyNineDate = $x("//div[@class='react-datepicker__day react-datepicker__day--009 react-datepicker__day--weekend']"),
            rentalPeriodField = $x("//*[contains(text(),'* Срок аренды')]"),
            rentalPeriodData = $x("//div[@class='Dropdown-menu']//div[last()-3]"),
            blackPearlColorField = $x("//*[contains(text(),'чёрный жемчуг')]"),
            commentForCourierField = $x("//*[@placeholder='Комментарий для курьера']"),
            verifyOrderButton = $x("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']"),
            yesOrderButton = $x("//*[contains(text(),'Да')]"),
            orderIsConfirmedText = $x("//div[contains(text(),'Заказ оформлен')]");

    @Step("Для кого самокат")
    public OrderScooter orderScooter() {
        orderSamokatButton.click();
        nameField.setValue("Иван");
        surNameField.setValue("Иванов");
        addressField.setValue("ул Иванова, дом 25");
        metroStationField.click();
        cherkizovskayaStation.click();
        numberField.setValue("+79999999999");
        nextButton.click();

        return this;
    }

    @Step("Про аренду")
    public OrderScooter aboutRent() {
        whenBringScooterField.click();
        julyNineDate.click();
        rentalPeriodField.click();
        rentalPeriodData.click();
        blackPearlColorField.click();
        commentForCourierField.setValue("Позвоните как привезёте.");
        verifyOrderButton.click();
        yesOrderButton.click();
        orderIsConfirmedText.shouldHave(text("Заказ оформлен"));

        return this;
    }
}
