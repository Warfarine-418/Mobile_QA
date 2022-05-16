package ru.gb.test.tests.forms;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.test.base.BaseTest;
import ru.gb.test.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckScreenshotFormTest extends BaseTest {
    @Test
    @Description("Проверяем получение оповещения с помощью скриншота")
    public void CheckAlertScreenshot() {
        openApp()
                .clickFormsMenuButton()
                .checkFormsScreenshot();
    }
}
