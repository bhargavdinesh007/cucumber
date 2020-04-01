package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)



@CucumberOptions(features="C:\\Users\\bharg\\Downloads\\eclipse\\dinesh\\ctest\\webshop.feature", glue="stepdefs")

public class runwebshop {

}
