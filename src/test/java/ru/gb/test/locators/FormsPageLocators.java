package ru.gb.test.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormsPageLocators {

    public By InputField(){
        return MobileBy.AccessibilityId("text-input");
    }

    public By InputResultField(){
        return MobileBy.AccessibilityId("input-text-result");
    }

    public By ActiveButton(){
        return MobileBy.AccessibilityId("button-Active");
    }

    public By ActiveButtonAlert(){
        return MobileBy.AccessibilityId("android:id/alertTitle");
    }
    public By FormsScreen() {
        return By.xpath("//android.widget.ScrollView[@content-desc=\"Forms-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");}

}
