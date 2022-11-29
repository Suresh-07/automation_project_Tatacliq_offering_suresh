package TATA_CLIQ;
	import java.awt.Window;
	import java.util.ArrayList;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Tatacliq  {
	public static String url="https://www.tatacliq.com";
		
		WebDriver driver;
		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;
		ExtentTest test;
		
		
		
		@BeforeTest
		public void beforetest() throws InterruptedException
		{
			htmlReporter = new ExtentHtmlReporter("extent.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			WebDriverManager.edgedriver().setup();	
			driver=new EdgeDriver();	
			driver.get(url);	
			driver.manage().window().maximize();	
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
			
		@Test(enabled = true,priority = 0) //product type -digitl anf anglog type
		public void TC1() throws InterruptedException {
			test=extent.createTest("My first test");
			WebElement Watch = driver.findElement(By.linkText("Watches for Men"));
			Watch.click();
//			java_script_util.scrollIntoView(Watch, driver);
			Thread.sleep(5000);
			ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
			int v=tab.size();
			System.out.println(v);
		    driver.switchTo().window(tab.get(1));
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			test.pass("user get as per thier choice - digitl and anglog type watches");
					
		}
		
		

		@Test(enabled = true ,priority = 1)
		public void TC2() throws InterruptedException {
			test=extent.createTest("My first test 2");
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]")).click();
			driver.navigate().to("https://www.tatacliq.com/watches-men/c-msh1500?sessionId=438651f7-77c4-4184-837b-d16efd517a8b.f4a0f803-3a53-4a6b-9cc3-33f53e173f7d");
			test.pass("user get as per thier choice in different brands in watches");
		}

		@Test(enabled = true ,priority = 2)
		public void TC3() throws InterruptedException {
			test=extent.createTest("My first test 3 ");
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]")).click();
			
			driver.navigate().to("https://www.tatacliq.com/watches-men/c-msh1500?sessionId=438651f7-77c4-4184-837b-d16efd517a8b.f4a0f803-3a53-4a6b-9cc3-33f53e173f7d");
			test.pass("user get as per thier choice in different type of watches as per thier priceamount");
	}
		@Test(enabled = true ,priority = 3)
		public void TC4() throws InterruptedException {
			test=extent.createTest("My first test  4");
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
			
			driver.navigate().to("https://www.tatacliq.com/watches-men/c-msh1500?sessionId=438651f7-77c4-4184-837b-d16efd517a8b.f4a0f803-3a53-4a6b-9cc3-33f53e173f7d");
			test.pass("user get as per thier choice in different type dail shape of watches");
	}
		

		@Test(enabled =  true ,priority = 4)
		public void TC5() throws InterruptedException {
			test=extent.createTest("My first test 5");
		    
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]")).click();
			
			driver.navigate().to("https://www.tatacliq.com/watches-men/c-msh1500?sessionId=438651f7-77c4-4184-837b-d16efd517a8b.f4a0f803-3a53-4a6b-9cc3-33f53e173f7d");
			test.pass("user get as per thier choice in different type features in watches ");
		
		}
//		price in select all option
		@Test(enabled = true ,priority = 5)
		public void TC6() throws InterruptedException {
			test=extent.createTest("My first test 6");
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			
			driver.navigate().to("https://www.tatacliq.com/watches-men/c-msh1500?sessionId=438651f7-77c4-4184-837b-d16efd517a8b.f4a0f803-3a53-4a6b-9cc3-33f53e173f7d");
			test.pass("user get as per thier choice in price");
		
	}
		@Test(enabled = true,priority = 6)
		public void TC7() throws InterruptedException {
			test=extent.createTest("My first test 7 ");
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10000");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("50089");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]")).click();
			Thread.sleep(20000);
			
			driver.navigate().to("https://www.tatacliq.com/watches-men/c-msh1500?sessionId=438651f7-77c4-4184-837b-d16efd517a8b.f4a0f803-3a53-4a6b-9cc3-33f53e173f7d");
			test.pass("user get as per thier choice in min and mx price in watches");
		}
		
		@Test(enabled = true ,priority = 7) //all discount
		public void TC8() throws InterruptedException {
			test=extent.createTest("My first test 8 ");
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(5000);
//			test.pass("user can see mutiple option" );
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
//			test.pass("user get particular iteams as per there choose");
			Thread.sleep(20000);
			
			driver.navigate().to("https://www.tatacliq.com/watches-men/c-msh1500?sessionId=438651f7-77c4-4184-837b-d16efd517a8b.f4a0f803-3a53-4a6b-9cc3-33f53e173f7d");
			test.pass("user get as per thier choice in the all discount");
			
	}
		
	@Test(enabled =true ,priority = 8)  // Availability
		
		public void TC9() throws InterruptedException {
		test=extent.createTest("My first test 9");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		
		Thread.sleep(20000);
		
		test.pass("user get as per thier choice in the Availability");
		driver.quit();
		
	    extent.flush();
	}

	}


