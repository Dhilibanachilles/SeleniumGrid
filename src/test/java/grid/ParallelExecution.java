package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	WebDriver driver;
	@Parameters({"bname"})
	@Test
	public void browserTest(String bname) throws MalformedURLException, InterruptedException {
		if(bname.equalsIgnoreCase("chrome")) {
			System.out.println("Connection established with chrome ongoing");
			ChromeOptions options = new ChromeOptions();
		//	options.addArguments("--headless");
		//	options.addArguments("--no-sandbox");
	    //    options.addArguments("--disable-dev-shm-usage");
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
			System.out.println("Connection established with chrome");
		}
		if(bname.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
		//	options.addArguments("--headless");
		//	options.addArguments("--no-sandbox");
	    //  options.addArguments("--disable-dev-shm-usage");
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
			System.out.println("Connection established with firefox");
		}
		if(bname.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
		//	options.addArguments("--headless");
		//	options.addArguments("--no-sandbox");
	    //  options.addArguments("--disable-dev-shm-usage");
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
			System.out.println("Connection established with edge");
		}
		Thread.sleep(20000);
		driver.get("https://www.amazon.in");
		Thread.sleep(20000);
		System.out.println("Application is being executed");
		driver.quit();
	}
	
}
