package ru.gb.test.pages;

import com.codeborne.selenide.Condition;
import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;
import ru.gb.test.locators.LocatorService;
import ru.gb.test.locators.interfaces.FormsPageLocators;

import java.awt.image.BufferedImage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class FormsPage {
    private FormsPageLocators locator() {
        return LocatorService.FORMS_PAGE_LOCATORS;
    }

    @Step("Кликаем по полю 'input field'")
    public FormsPage clickInputField() {
        $(locator().inputField()).click();
        return new FormsPage();
    }

    @Step("Вводим текст в поле 'input field'")
    public FormsPage sendKeysToInputField(String text) {
        $(locator().inputField()).sendKeys(text);
        return new FormsPage();
    }

    @Step("Проверяем текст в окне вывода")
    public FormsPage checkInputResultField(String text) {
        $(locator().inputResultField()).shouldHave(Condition.text(text));
        return new FormsPage();
    }

    @Step("Кликаем по кнопке 'актив' в форме")
    public FormsPage clickActiveButton() {
        $(locator().activeButton()).click();
        return new FormsPage();
    }

    @Step("Проверяем текст оповещения кнопки")
    public FormsPage checkAlertText(String text) {
        $(locator().activeButtonAlert()).shouldHave(Condition.text(text));
        return new FormsPage();
    }

    @Step("Делаем скриншот оповещения и сравниваем с требованием.")
    public FormsPage checkFormsScreenshot() {
        // Загружаем ожидаемое изображения для сравнения.
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/formsPage.png");
        // Делаем актуальный скриншот, используя элемент и игнорируя другие части экрана.
        File actualScreenshot = $(locator().formsScreen()).screenshot();
        // Загружаем актуальный скриншот.
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        // Где будем хранить скриншот с различиями в случае падения теста.
        File resultDestination = new File("diff/diff_CheckAlertPageScreenshot.png");

        // Сравниваем.
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }
}