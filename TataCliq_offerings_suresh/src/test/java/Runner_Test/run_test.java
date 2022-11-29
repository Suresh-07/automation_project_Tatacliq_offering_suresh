package Runner_Test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions (features = {"src/test/resources/Tatacliq/Tatacliq.feature"},glue = {"Definition"},plugin= {"html:Tatacliqofferings/Tatacliq.html"})
	public class run_test {

}
