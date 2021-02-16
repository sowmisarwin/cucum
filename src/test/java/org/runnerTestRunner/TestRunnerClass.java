package org.runnerTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.stepDefintion",monochrome = true)
public class TestRunnerClass {

}// glue = "org.stepDefintion",
