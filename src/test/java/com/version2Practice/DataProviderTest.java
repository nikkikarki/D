package com.version2Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider(name="loginData")
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="user1";
		data[0][1]="pwd1";
		data[1][0]="8883359464";
		data[1][1]="CJ4494@c";
		return data;
		
	}
	@Test(dataProvider="loginData")
	public void login(String un,String pwd)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
