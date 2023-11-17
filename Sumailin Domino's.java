package My;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SumailinProject {
	WebDriver driver;
	@Test
	public void launchBrowser() {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Sele\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://pizzaonline.dominos.co.in");
		driver.manage().window().maximize();
	}
	@Test
	public void location() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Enter your delivery address']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Chennai");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
	    WebElement city = driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	    city.click();
	    
	    city.sendKeys("CHENNAI");
	    Thread.sleep(2000);
	    city.click();
	    driver.findElement(By.xpath("//span[text()='CHENNAI']")).click();
	    Thread.sleep(2000);
	    
	    WebElement sel = driver.findElement(By.xpath("//input[@placeholder='Select Store']"));
	    sel.click();
	    Thread.sleep(2000);
	    
	    sel.sendKeys("THIRUVANMIYUR");
	    sel.click();
	    
	    driver.findElement(By.xpath("//span[text()='THIRUVANMIYUR']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='btn--grn']")).click();
            Thread.sleep(4000);
        
	    driver.findElement(By.xpath("(//button[@data-label='addTocart'])[1]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@data-label='miniCartCheckout']")).click();
	    WebElement cheesy = driver.findElement(By.xpath("//button[@onclick='moeRemoveBanner()']"));
	    cheesy.click();
	  
	

}
}
