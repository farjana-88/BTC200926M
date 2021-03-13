package abc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/Oni-Tani/Documents/workspace/BDD_200926M/login.feature"}, tags= {"@smoke"},
plugin= {"pretty","html:report"})


public class Runner {

	
	
	
	
}
