package com.testCase;

import pages.HomeScreen;
import pages.LoginScreen;
import config.BaseTest;
import io.qameta.allure.*;

import org.testng.annotations.Test;

/**
 * Created by Supreet Singh on 22.08.2018.
 */

@Epic("Regression Tests")
@Feature("News")


public class JustATest extends BaseTest {



        @Test
        @Severity(SeverityLevel.BLOCKER)
        @Description("Test Description: This is a test")
        @Story("SplashScreenPageObjects")
        public void chargerTest() throws InterruptedException {

            HomeScreen menu = new HomeScreen(driver);
            LoginScreen storingScreen = new LoginScreen(driver);

            storingScreen.tabStoringenTab();
        }

}
