package com.cyient.royaltest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.cyient.base.ParentTest;

import org.openqa.selenium.support.ui.Select;


@Test(priority = 1)

public class SignupTest extends ParentTest {

	
	public void test() throws InterruptedException {
		
	
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Create an account']")).click();
		
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Mak");
		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Jack");

		driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.findElement(By.xpath("//span[text()=' April ']")).click();
		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//span[text()=' 1 ']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("1997");

		driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
		driver.findElement(By.xpath("//span[text()=' India ']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("mkm@gmail.com");
		driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("mkm456789");

		driver.findElement(By.xpath("(//span[text()='Select one security question'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='What elementary school did you go to?']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("progressive");

		Actions mouse = new Actions(driver);
		mouse.clickAndHold();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox'] /..")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Done ']")).click();
	

	}

}
