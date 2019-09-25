package packnew1;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"json:src/test/java/packnew1/cucumber.json"})

public class runner {

}
