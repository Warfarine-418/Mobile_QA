package ru.gb.test.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import ru.gb.test.locators.LocatorService;
import ru.gb.test.locators.interfaces.LoginPageLocators;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    // Метод позволяет работать с локаторами для нужной нам страницы.
    private LoginPageLocators locator() {
        return LocatorService.LOGIN_PAGE_LOCATORS;
    }

    @Step("Кликаем по кнопке 'логин' в форме")
    public LoginPage clickLoginButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        $(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
}