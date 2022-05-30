package ru.gb.test.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void prepareData(){
        System.out.println("привет");
    }

    @After
    public void clearData(){
        System.out.println("пока");
    }
}
