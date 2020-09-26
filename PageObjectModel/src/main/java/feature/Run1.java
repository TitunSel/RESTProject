package feature;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions

(features = "src/main/java/feature/Delete.feature", glue = "pages", monochrome = true)

public class Run1 extends AbstractTestNGCucumberTests {

}