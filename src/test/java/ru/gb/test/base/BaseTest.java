package ru.gb.test.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import ru.gb.test.pages.MainPage;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.close;

public class BaseTest {
    public MainPage openApp() {
        WebDriver driver = null;
        try {
            driver = getDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Opps, we have problems with URL for driver!");
        }
        WebDriverRunner.setWebDriver(driver);
        return new MainPage();
    }

    private WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        switch (System.getProperty("platform")){
            case "Android":
                capabilities.setCapability("deviceName", "Pixel");
                capabilities.setCapability("udid", "emulator-5554");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("platformVersion", "10");
                capabilities.setCapability("automationName", "UiAutomator2");
                capabilities.setCapability("app", "/Users/Warfarin/Downloads/Android-NativeDemoApp-0.2.1.apk");
                break;
            case "iOS":
                capabilities.setCapability("deviceName", "iPhone");
                capabilities.setCapability("udid", "testUdid");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("platformVersion", "15");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("app", "/Users/Warfarin/Downloads/Android-NativeDemoApp-0.2.1.apk");
                break;
        }

        Configuration.reportsFolder = "screenshots/actual";

        return new AppiumDriver<>(new URL("http:localhost:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void setDown(){
        close();
    }
}
