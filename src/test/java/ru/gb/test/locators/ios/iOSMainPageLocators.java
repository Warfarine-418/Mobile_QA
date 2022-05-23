package ru.gb.test.locators.ios;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.test.locators.interfaces.MainPageLocators;

public class iOSMainPageLocators implements MainPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    @Override
    public By formsButton() {
        return MobileBy.AccessibilityId("Forms");
    }
}
