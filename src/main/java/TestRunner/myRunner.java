package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/iftakerahmed/IdeaProjects/ScenarioOutline/src/main/java/Features/hooks.feature"},
        glue = {"stepDefination"},
        format = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
        dryRun = false,
        monochrome = true

)

public class myRunner {

}

//tags ~@smoketest= to ignore all @smoketest
//tags "@smokeTest, @RegressionTest"= it will excute all the test are include with @smaokeTest or @Regressoin Test
//tags "smoketest" , "regressointest" = it will only excute that are listed both @smoketest and @regressointest
