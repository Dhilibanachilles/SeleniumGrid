package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void testChrome() throws MalformedURLException {
		
		ChromeOptions options = new ChromeOptions();
		
		URL url = new URL("http://13.233.230.49:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, options);
		System.out.println("Connection established with chrome");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("www.netflix.com");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Title of the page :" + driver.getTitle());
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}

}
