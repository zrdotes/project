package com.evotor.test.task.aleksandr.utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.evotor.test.task.aleksandr.config.WebDriverProvider;
import com.evotor.test.task.aleksandr.pageobject.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


import static com.codeborne.selenide.Selenide.$x;
import static com.evotor.test.task.aleksandr.config.ConfigSingle.config;

public class BaseTest extends WebDriverProvider {

    protected OrderScooter orderScooter = new OrderScooter();
    protected MainPage mainPage = new MainPage();
    protected OrderStatus orderStatus = new OrderStatus();

    @BeforeAll
    public static void beforeClass() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        createDriver();
        Selenide.open(config.getBaseUriProperties());

    }
    @BeforeAll
    public static void acceptCookies(){
        SelenideElement acceptAllCookiesButton = $x("//*[contains(text(),'да все привыкли')]");
        acceptAllCookiesButton.click();
    }

    @AfterEach
    public void afterTest(){
        Selenide.open(config.getBaseUriProperties());
    }
}
