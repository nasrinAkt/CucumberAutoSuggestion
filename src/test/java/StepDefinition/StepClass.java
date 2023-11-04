package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;
	
	@Given("^Open google application$")
	public void open_google_application() throws Throwable {
	 System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe") ;
		ChromeOptions run = new ChromeOptions();
		run.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		
	}

	@Then("^search for bangalore$")
	public void search_for_bangalore() throws Throwable {
	   
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("bangalore");
		Thread.sleep(3000);
		
     List<WebElement> auto = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
     
   /*  int count = auto.size();
     System.out.println(count);
     
     auto.get(count-1).click();  */
     
    System.out.println("Total auto suggestion are "+auto.size());
    auto.get(auto.size()-2).click(); 
     
    Thread.sleep(2000);
    driver.close();
	}


}
