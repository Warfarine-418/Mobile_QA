package ru.gb.test.tests.main;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.test.base.BaseTest;
import ru.gb.test.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckFailScreenshotTest extends BaseTest {

    @Test
    @Description("Проверяем поведение теста при неудачной проверки UI главной страницы с помощью скриншота.")
    public void CheckFailMainPageScreenshot() {
        openApp()
                .checkFailScreenshot();
    }
}

