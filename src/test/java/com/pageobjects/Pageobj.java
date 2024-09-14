package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pageobj {
public static WebDriver driver;

public Pageobj(WebDriver rdriver) {
	driver=rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(xpath="//input[@id='bmwradio']")
WebElement BMW;

@FindBy(xpath="//input[@id='benzcheck']")
WebElement Benz;

@FindBy(xpath="//button[@id='openwindow']")
WebElement Openwindow;

@FindBy(xpath="//a[@id='opentab']")
WebElement opentab;

@FindBy(xpath="//select[@id='carselect']")
WebElement selectcars;

@FindBy(xpath="//select[@id='multiple-select-example']")
WebElement selectfruits;

@FindBy(xpath="//input[@id='autosuggest']")
WebElement typingtext;

@FindBy(xpath="//input[@id='enabled-button']")
WebElement enablebutton;

@FindBy(xpath="//input[@id='enabled-example-input']")
WebElement enablebuttonintext;

@FindBy(xpath="//input[@id='disabled-button']")
WebElement disablebutton;

@FindBy(xpath="//input[@id='show-textbox']")
WebElement showbutton;

@FindBy(xpath="//input[@id='displayed-text']")
WebElement showbuttonintext;

@FindBy(xpath="//input[@id='hide-textbox']")
WebElement hidebutton;

@FindBy(xpath="//div[@id='alert-example-div']//input[@id='name']")
WebElement textboxinalert;

@FindBy(xpath="//input[@id='alertbtn']")
WebElement alertbutton;

@FindBy(xpath="//input[@id='confirmbtn']")
WebElement confirmalertbutton;

@FindBy(xpath="//button[@id='mousehover']")
WebElement mousehoverbutton;

public void getbmw() {
	BMW.click();
}

public void getbenz() {
	Benz.click();
}

public void getopenwindow() {
	Openwindow.click();
	driver.close();
}

public void getopentab() {
	opentab.click();
	driver.close();
}

public void getselectcars() {
	Select se = new Select(selectcars);
	se.selectByIndex(1);
}

public void getselectfruits() {
	Select se = new Select(selectfruits);
	se.selectByVisibleText("Orange");
}

public void gettypetext(String val) {
	typingtext.sendKeys(val);
}

public void getenable() {
	enablebutton.click();
}

public void getenablebuttonintext(String val) {
	enablebuttonintext.sendKeys(val);
}

public void getdisablebutton() {
	disablebutton.click();
}

public void getshowbutton() {
	showbutton.click();
}

public void getshowbuttonintext(String val) {
	showbuttonintext.sendKeys(val);
}

public void gethidebutton() {
	hidebutton.click();
}

public void gettextboxinalert(String val) {
	textboxinalert.sendKeys(val);
}

public void getalertbutton() {
	alertbutton.click();
driver.switchTo().alert().accept();
}

public void getconfirmalertbutton() {
	confirmalertbutton.click();
driver.switchTo().alert().accept();
confirmalertbutton.click();
driver.switchTo().alert().dismiss();
}

public void getmousehoverbutton() {
	Actions ac = new Actions(driver);
	ac.moveToElement(mousehoverbutton).click().perform();
}

public void getstatictable() {
	int rows=driver.findElements(By.xpath("//table[@id='product']//tr")).size();
	int cols=driver.findElements(By.xpath("//table[@id='product']//tr/th")).size();
	for(int i=2;i<=rows;i++) {
		for(int j=1;j<=cols;j++) {
			String val=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
			System.out.print(val);
		}
		System.out.println();
	}
}













}
