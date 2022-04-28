package ru.gb.test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MyFirstTest {

    @Test
    public void CheckEmptyEmail() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","Pixel");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("app","/Users/Warfarin/Downloads/Android-NativeDemoApp-0.2.1.apk");

        MobileDriver driver = new AndroidDriver(new URL("http:localhost:4723/wd/hub"), capabilities);

        Thread.sleep(2000);
        MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
        loginMenuButton.click();
        Thread.sleep(2000);
        MobileElement loginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
        loginButton.click();

        Thread.sleep(2000);
        MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]\n");
        Assert.assertEquals(errorText.getText(),"Please enter a valid email address");

        driver.quit();
    }
}
