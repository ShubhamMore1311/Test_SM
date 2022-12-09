package com.Information;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.Utility.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
public class GetInfo_Pushpa extends Base {
	public void Method1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0zDIpNjc3z6gyYPRiKygtzihIBABNfQbp&q=pushpa&oq=pushpa&aqs=chrome.1.35i39i355j46i39j69i59l2j46i20i263i433i512j46i433i512j0i433i512j69i60.3091j0j4&sourceid=chrome&ie=UTF-8");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Z26q7c UK95Uc jGGQ5e']//a")).click();
		Thread.sleep(2000);
		String a= driver.findElement(By.xpath("//td[normalize-space()='India']")).getText();
		System.out.println(" Original Country  " + a);
		Thread.sleep(3000);
		String b =driver.findElement(By.xpath("//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")).getText();
		System.out.println(" Release Date "+ b);
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//h3[normalize-space()='Pushpa: The Rise - Part 1 (2021) - IMDb']")).click();
		Thread.sleep(2000);
		String c= driver.findElement(By.xpath("//a[normalize-space()='India']")).getText();
		System.out.println(" Original Country  " + c);
		String d=driver.findElement(By.xpath("//a[normalize-space()='December 17, 2021 (United States)']")).getText();
		System.out.println(" Original Country  " + d);
		
		Assert.assertEquals(b, d);
		
	}
}

