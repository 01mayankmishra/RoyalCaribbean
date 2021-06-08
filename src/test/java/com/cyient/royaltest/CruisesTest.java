package com.cyient.royaltest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.ParentTest;

@Test(priority = 2)

public class CruisesTest extends ParentTest {

	public void invalidtest() throws InterruptedException {
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='email-capture__body']//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//div[@class='headerMainToolbar__menu__icon']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Find a Cruise']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2021-2022 Cruises']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("rciFirstName")).sendKeys("Mak");
		driver.findElement(By.xpath("//input[@id='rciEmailAddress']")).sendKeys("Mak@jack.com");
		driver.findElement(By.xpath("//select[@class='md-input']")).click();
		driver.findElement(By.xpath("//option[@value='IND']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		Thread.sleep(1000);
		String actalValue= driver.findElement(By.id("rciLastNameMissing")).getText();
		Assert.assertEquals( actalValue,"Missing Last Name");
		Thread.sleep(1000);
	}
}
