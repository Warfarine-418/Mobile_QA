package ru.gb.test.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
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
            driver = getAndroidDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Opps, we have problems with URL for driver!");
        }
        WebDriverRunner.setWebDriver(driver);
        return new MainPage();
    }

    private WebDriver getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "/Users/Warfarin/Downloads/Android-NativeDemoApp-0.2.1.apk");

        Configuration.reportsFolder = "screenshots/actual";

        return new AndroidDriver(new URL("http:localhost:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void setDown(){
        close();
    }
}
