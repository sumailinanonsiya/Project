package My;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Proj {

	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("Webdriver.gecko.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	     
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://adactinhotelapp.com/");
	     driver.manage().window().maximize();
	     
	     WebElement userName = driver.findElement(By.id("username"));
	     userName.sendKeys("Anonsiya");
	     
	     WebElement passWord = driver.findElement(By.name("password"));
	     passWord.sendKeys("sumailin06");
	     
	     WebElement login = driver.findElement(By.id("login"));
	     login.click();
	     
	     WebElement location = driver.findElement(By.name("location"));
	     Select s=new Select( location);
	     s.selectByIndex(3);
	     
	     WebElement hotel = driver.findElement(By.name("hotels"));
	     Select s1=new Select(hotel);
	     s1.selectByValue("Hotel Cornice");
	     
	     WebElement hotelType = driver.findElement(By.id("room_type"));
	     Select s2=new Select(hotelType);
	     s2.selectByVisibleText("Deluxe");
	     
	     WebElement number = driver.findElement(By.name("room_nos"));
	     Select s3=new Select(number);
	     s3.selectByIndex(2);
	     
	     WebElement dateIn = driver.findElement(By.id("datepick_in"));
	     dateIn.clear();
	     dateIn.sendKeys("26/6/2023");
	     
	     WebElement dateOut = driver.findElement(By.name("datepick_out"));
	     dateOut.clear();
	     dateOut.sendKeys("29/6/2023");
	     
	     WebElement adult = driver.findElement(By.id("adult_room"));
	     Select s4=new Select(adult);
	     s4.selectByIndex(2);
	     
	     WebElement children = driver.findElement(By.name("child_room"));
	     Select s5=new Select(children);
	     s5.selectByValue("2");
	     
	     
	     WebElement search = driver.findElement(By.id("Submit"));
	     search.click();
	     
	     WebElement select = driver.findElement(By.name("radiobutton_0"));
	     select.click();
	     
	      driver.findElement(By.id("continue")).click();
	      
	      WebElement firstName = driver.findElement(By.name("first_name"));
	      firstName.sendKeys("Sumailin");
	      
	      WebElement lastName = driver.findElement(By.id("last_name"));
	      lastName.sendKeys("Anonsiya");
	      
	      WebElement address = driver.findElement(By.name("address"));
	      address.sendKeys("Saveriyarpattinam,Karambakudi,Pudukkottai");
	      
	      WebElement ccNum = driver.findElement(By.id("cc_num"));
	      ccNum.sendKeys("6785438956973696");
	      
	      WebElement ccType = driver.findElement(By.name("cc_type"));
	      Select s6=new Select(ccType);
	      s6.selectByVisibleText("VISA");
	      
	      WebElement ccExMonth = driver.findElement(By.id("cc_exp_month"));
	      Select s7=new Select(ccExMonth);
	      s7.selectByVisibleText("March");
	      
	      WebElement ccExYr = driver.findElement(By.name("cc_exp_year"));
	      Select s8=new Select(ccExYr);
	      s8.selectByIndex(16);
	      
	      WebElement cvv = driver.findElement(By.id("cc_cvv"));
	      cvv.sendKeys("598");
	      Thread.sleep(1000);
	     
	      TakesScreenshot tk=(TakesScreenshot)driver;
	      File srs = tk.getScreenshotAs(OutputType.FILE);
	      File des=new File("C:\\Users\\HP\\eclipse-workspace\\Sele\\screenshot\\adactin.png");
	      FileHandler.copy(srs, des);
	      
	      WebElement book = driver.findElement(By.name("book_now"));
	      book.click();
	      Thread.sleep(8000);
	            
	      WebElement scroolDown = driver.findElement(By.name("search_hotel"));
	      JavascriptExecutor js=( JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView(true)", scroolDown);
	      WebElement orderNo = driver.findElement(By.name("order_no"));
	      String atb = orderNo.getAttribute("value");
	      System.out.println("Order no:"+ atb);
		}

	}
