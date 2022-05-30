package ru.gb.test.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/"}, glue = {"ru/gb/test/cucumber/steps", "ru/gb/test/cucumber/hooks"})
public class RunnerTests extends AbstractTestNGCucumberTests {
}
