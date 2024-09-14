package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.utilities.Filedata;

public class Baseclass {
	
	Filedata fi = new Filedata();
	String ur=fi.geturl();
	String vali=fi.getvalue();
	
	
	 WebDriver driver;
	@Parameters({"os","browser"})
	@BeforeClass
	
	public void setup(String o, String br) throws MalformedURLException {
		String gridurl="http://192.168.48.140:4444";
		DesiredCapabilities ca = new DesiredCapabilities();
		if(fi.s.equalsIgnoreCase("remote"))
		 {
		switch(o) {
		case "win11" :ca.setPlatform(Platform.WIN11);break;
		case "Mac": ca.setPlatform(Platform.MAC);break;
		default: System.out.println("Invalid platform");return;
		}
		switch(br) {
		case "chrome": ca.setBrowserName("chrome");break;
		case "edge": ca.setBrowserName("MicrosoftEdge");break;
		default: System.out.println("Invalid browser");return;
		}
		driver=new RemoteWebDriver(new URL(gridurl),ca);
	}
		else if(fi.s.equalsIgnoreCase("local")) {
			switch(br) {
			case "chrome": driver= new ChromeDriver();break;
			case "edge": driver= new EdgeDriver();break;
			default: System.out.println("Invalid browser in local");return;
			}
		}
		
		//driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
