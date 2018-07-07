package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GymPass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver m = new ChromeDriver();
		
		m.get("https://www.24hourfitness.com/");
		
		m.findElement(By.xpath("//*[@id='page-content']/article[1]/div/a")).click();
		m.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Xiri");
		//m.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Xiri");
		m.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Bokey");
		//m.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bokey");
		m.findElement(By.xpath("//*[@id='email']")).sendKeys("xiri@Bokey.com");
		//m.findElement(By.xpath("//input[@id='email']")).sendKeys("xiri@Bokey.com");
		m.findElement(By.xpath("//*[@id='phone']")).sendKeys("5849785495");
		//m.findElement(By.xpath("//input[@id='phone']")).sendKeys("5849785495");
		m.findElement(By.xpath("//*[@id='birthdate']")).sendKeys("10101989");
		//m.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("10/10/1989");
		m.findElement(By.xpath("//*[@id='location']")).sendKeys("92121");
		//m.findElement(By.xpath("//input[@id='location']")).sendKeys("92121");
		m.findElement(By.xpath("//*[@id='next']")).click();
		//m.findElement(By.xpath("//button[@id='next']")).click();
		Thread.sleep(2000);
		
		m.findElement(By.xpath("//*[@id='2']")).click();
		//m.findElement(By.xpath("//div[@id='2']")).click();
		//m.findElement(By.xpath("//*[@id='next']")).click();
		//m.findElement(By.xpath("//button[@id='next']")).click();
		Thread.sleep(6000);
		
		
		Thread.sleep(3000);
		m.close();
		

	}

}
