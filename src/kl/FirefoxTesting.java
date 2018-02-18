package kl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FirefoxTesting {
	  WebDriver driver;
		@Test(priority=0)
			public void f4() throws InterruptedException
			{
				 System.setProperty("webdriver.gecko.driver","E:\\Testingproject\\geckodriver.exe");
					driver=new FirefoxDriver();
						driver.get("https://loan.icicibank.com");
				driver.manage().window().maximize();
				Thread.sleep(5000);
			
				
			}
			
			@Test(priority=1)
			public void f7() throws InterruptedException{
				System.out.println("test3");
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				driver.findElement(By.xpath("(//*[text()='Apply Now'])[1]")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("window.scrollTo(0,document.body.ScrollHeight)");
				driver.findElement(By.xpath("//*[text()='Skip & Continue as Guest']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@id='city-map-icon'])[1]/img")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@id='city-map-icon'])[2]/img")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div[1]/form/div[2]/div[2]/div/ul/li[1]/div/table/thead/tr/th[3]/button")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@type='button'])[15]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@ type='button'])[9]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@type='button'])[12]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='step1-firstname']")).sendKeys("userid");
				driver.findElement(By.xpath("//*[@id='step1-lastname']")).sendKeys("Lastname");
				driver.findElement(By.xpath("//*[@id='step1-mobile']")).sendKeys("9989898989");
				
				
				
			}
			
			public void f9()
			{
				driver.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div[1]/form/div[4]/div[2]/div/div/button")).click();
			}
			@AfterClass
			public void f8()
			{
				System.out.println("test3");
			}

}
