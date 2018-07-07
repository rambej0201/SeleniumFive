package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneGm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver g = new ChromeDriver();
		
		g.get("http://www.gmail.com");
		Thread.sleep(1000);
		g.findElement(By.xpath("//*[@id=\"view_container\"]/div/div[2]/div/div[2]/div[2]/div/div/content/span")).click();
		//g.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(1000);
		g.findElement(By.xpath("//*[@id='firstName']")).sendKeys("xavyasachi");
		//g.findElement(By.xpath("//input[@name='firstName']")).sendKeys("xavyasachi");
		Thread.sleep(1000);
		g.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("rgv");
		//g.findElement(By.xpath("//input[@name='lastName']")).sendKeys("rgv");
		Thread.sleep(1000);
		g.findElement(By.xpath("//*[@id='username']")).sendKeys("xavyasachirgv");
		//g.findElement(By.xpath("//input[@id='username']")).sendKeys("xavyasachirgv");
		Thread.sleep(1000);
		g.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Tyson@123");
		//g.findElement(By.xpath("//*[@id=\'passwd\']/div[1]/div/div[1]/input")).sendKeys("Tyson@123");
		Thread.sleep(1000);
		g.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Tyson@123");
		//g.findElement(By.xpath("//*[@id=\'confirm-passwd']/div[1]/div/div[1]/input")).sendKeys("Tyson@123");
		Thread.sleep(1000);
		g.findElement(By.xpath("//*[@id='accountDetailsNext']/content/span")).click();
		Thread.sleep(5000);
		
		g.close();

	}

}
