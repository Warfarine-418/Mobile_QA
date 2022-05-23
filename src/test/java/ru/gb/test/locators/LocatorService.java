package ru.gb.test.locators;

import ru.gb.test.locators.android.AndroidFormsPageLocators;
import ru.gb.test.locators.android.AndroidLoginPageLocators;
import ru.gb.test.locators.android.AndroidMainPageLocators;
import ru.gb.test.locators.interfaces.FormsPageLocators;
import ru.gb.test.locators.interfaces.LoginPageLocators;
import ru.gb.test.locators.interfaces.MainPageLocators;
import ru.gb.test.locators.ios.iOSFormsPageLocators;
import ru.gb.test.locators.ios.iOSLoginPageLocators;
import ru.gb.test.locators.ios.iOSMainPageLocators;

public class LocatorService {
    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();

    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();

    public static final FormsPageLocators FORMS_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidFormsPageLocators() : new iOSFormsPageLocators();
}
