package ru.gb.test.locators.android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.test.locators.interfaces.FormsPageLocators;

public class AndroidFormsPageLocators implements FormsPageLocators {
    @Override
    public By inputField() {
        return MobileBy.AccessibilityId("text-input");
    }

    @Override
    public By inputResultField() {
        return MobileBy.AccessibilityId("input-text-result");
    }

    @Override
    public By activeButton() {
        return MobileBy.AccessibilityId("button-Active");
    }

    @Override
    public By activeButtonAlert() {
        return MobileBy.AccessibilityId("android:id/alertTitle");
    }

    @Override
    public By formsScreen() {
        return By.xpath("//android.widget.ScrollView[@content-desc=\"Forms-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
    }
}
