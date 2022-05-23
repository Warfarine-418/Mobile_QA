package ru.gb.test.locators.android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.test.locators.interfaces.MainPageLocators;

public class AndroidMainPageLocators implements MainPageLocators {
    @Override
    public By loginButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.widget.TextView");
    }

    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    @Override
    public By formsButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
    }
}
