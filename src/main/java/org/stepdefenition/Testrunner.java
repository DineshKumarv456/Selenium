package org.stepdefenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefenition",
monochrome = true,
dryRun = false,
tags = ("@inmakes, @infotech"),
plugin = {"html:Report", "junit:Report\\junitreport.xml", "json:Report//jsonreport.json"})

public class Testrunner {

}
