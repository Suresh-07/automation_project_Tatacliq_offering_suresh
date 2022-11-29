package Definition;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import TATA_CLIQ.java_script_util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Defn_test {
	public static String url="https://www.tatacliq.com";
    WebDriver driver;
    
    
    @Given("user should go to the Home page of tatacliq")
    public void user_should_go_to_the_home_page_of_tatacliq() {
      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get(url);
    }
    @When("click on the SITEMAP")
    public void click_on_the_sitemap() throws InterruptedException {
    	WebElement map=driver.findElement(By.linkText("Sitemap"));
		map.click();
		java_script_util.scrollIntoView(map, driver);
		Thread.sleep(5000);
        
    }
    @Then("close the browser")
    public void close_the_browser() {
    	driver.quit(); 
    	}
}