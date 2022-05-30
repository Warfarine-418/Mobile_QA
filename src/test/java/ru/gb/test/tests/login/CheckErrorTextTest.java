package ru.gb.test.tests.login;

import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.test.base.BaseTest;
import ru.gb.test.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckErrorTextTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем сообщение об ошибке при невалидной email.")
    public void CheckEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}
