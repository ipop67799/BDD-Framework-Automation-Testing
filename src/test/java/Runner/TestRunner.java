package Runner;
@org.junit.runner.RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src/test/java/features", glue={"stepDefinition","stepDefinitions"})
public class TestRunner {}