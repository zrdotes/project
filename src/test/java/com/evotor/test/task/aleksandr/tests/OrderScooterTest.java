package com.evotor.test.task.aleksandr.tests;

import com.evotor.test.task.aleksandr.utils.BaseTest;
import org.junit.jupiter.api.Test;


public class OrderScooterTest extends BaseTest {

    @Test
    void orderScooterPageTest(){
        orderScooterPage
                .orderScooter()
                .aboutRent();
    }
}
