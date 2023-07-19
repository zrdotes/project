package com.evotor.test.task.aleksandr.tests;

import com.evotor.test.task.aleksandr.utils.BaseTest;
import org.junit.jupiter.api.Test;


public class MainPageTest extends BaseTest {

    @Test
    public void checkDropdownText() {
        mainPage.checkDropdownTextMatches();
    }
}