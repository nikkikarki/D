package com.version2Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpeningBrowserTest {
	@Test
	public void open()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
	}

}
