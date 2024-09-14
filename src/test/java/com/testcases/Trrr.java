package com.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Trrr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().deleteCookieNamed("zenler_session");
		System.out.println();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		//driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.quit();

	}

}
