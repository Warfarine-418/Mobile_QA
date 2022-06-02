package ru.gb.test.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainPageLocators {
    public By loginButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.widget.TextView");
//        return MobileBy.AccessibilityId("Login");
    }
    public By FormsButton(){
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

}
