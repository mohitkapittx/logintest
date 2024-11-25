import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src//test//resources//features", 
    glue = {"com.kapittx.logintest.stepDeination"}, 
    dryRun = false, 
    monochrome = true,
    tags = "@logtest")
public class Runner {

}
