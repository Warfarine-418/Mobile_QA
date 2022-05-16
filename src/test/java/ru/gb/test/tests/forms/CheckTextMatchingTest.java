package ru.gb.test.tests.forms;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.test.base.BaseTest;
import ru.gb.test.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckTextMatchingTest extends BaseTest {
    public static final String INPUT_TEXT = "Test Test";

    @Test
    @Description("Проверяем соответствие текста в поле ввода и вывода.")
    public void CheckTextMatching() {
        openApp()
                .clickFormsMenuButton()
                .clickInputField()
                .sendKeysToInputField(INPUT_TEXT)
                .checkInputResultField(INPUT_TEXT);

    }
}
