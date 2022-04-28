package ru.gb.test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class HomeWorkTest {

    @Test
    public void InputResultFieldCheck() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("app","/Users/Warfarin/Downloads/Android-NativeDemoApp-0.2.1.apk");

        MobileDriver driver = new AndroidDriver(new URL("http:localhost:4723/wd/hub"), capabilities);

        Thread.sleep(2000);
        MobileElement formsMenuButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
        formsMenuButton.click();

        Thread.sleep(2000);
        MobileElement inputField = (MobileElement) driver.findElementByAccessibilityId("text-input");
        inputField.sendKeys("DogDog");

        Thread.sleep(2000);
        MobileElement inputFieldResult = (MobileElement) driver.findElementByAccessibilityId("input-text-result");
        Assert.assertEquals(inputFieldResult.getText(),"DogDog");

        driver.quit();
    }
}
