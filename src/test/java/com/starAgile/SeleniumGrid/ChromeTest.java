package com.starAgile.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void testChrome() throws MalformedURLException {
		
		ChromeOptions options = new ChromeOptions();
		
		URL url = new URL("http://3.110.159.229:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("www.netflix.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Title of the page : " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}

}
