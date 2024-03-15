package amazon;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import javax.annotation.concurrent.ThreadSafe;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.page.model.ScreencastFrame;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args)   throws Exception  {
		// System.setProperty("webdriver.edge.driver", "C:\\Users\\BHARATH
		// V\\eclipse-workspace\\amazon\\target\\driver\\msedgedriver.exe");

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // up casting interface to child


//		String s = ("https://demo.guru99.com/test/drag_drop.html ");
		String s1 = ("https://demo.automationtesting.in/Alerts.html ");

		driver.get(s1);
		
		
		

		//driver.navigate().to(s1);
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		      
		 Alert a = driver.switchTo().alert();
		
		a.accept();
		
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(2000);
		a.dismiss();
		

		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	
		
		
	
		a.sendKeys("bharath");
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
		
		
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().refresh();
		// driver.switchTo().newWindow(WindowType.TAB);

//	  String currentUrl = driver.getCurrentUrl();
//	  System.out.println(currentUrl);
//	  if (s.equals(currentUrl)) {
//		  System.out.println("the url is matching");
//	  }
//	  else 
//	  {
//		 System.err.println("not matching");
//	  }

		// String title = driver.getTitle();

		// System.out.println(title);
		// String pageSource = driver.getPageSource();
		// System.out.println();
//	driver.close();
//	driver.quit();

	//WebElement user = driver.findElement(By.id("email"));
		//user.sendKeys("9677514916");
		//String attribute = user.getAttribute("value");
		//System.out.println(attribute);
//		WebElement pass = driver.findElement(By.name("pass"));
//		pass.sendKeys("98y88");
//		  	
//		WebElement linktext = driver.findElement(By.partialLinkText("Forgotten pass"));
//		linktext.click();
		
//	List<WebElement> list = driver.findElements(By.tagName("a"));
//	
//	for(int i=0;i<=list.size();i++) {
//		
//		WebElement text = list.get(i);
//		String text2 = text.getText();
//		System.out.println(text2);
//		
//		
//	WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
	
	//element.sendKeys("bharath");
	//WebElement element = driver.findElement(By.xpath("//button[text()='Log in']"));
	//element.click();
		
	//WebElement a1 = driver.findElement(By.xpath("//input[contains(@placeholder,\"Pass\")]"));
		
		
//a1.sendKeys("bharath");
	
	 //driver.findElement(By.xpath("//*[contains(text(),'Forgot')]")).click();	 
	
		
		//WebElement user = driver.findElement(By.xpath("//span[text()='Laptops']"));
		
		
		
	//	a.moveToElement(user).click().build().perform();
		
	//	WebElement user = driver.findElement(By.id("email"));
		
//		WebElement drag = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
//		
//		WebElement drop = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
//		
//		
//		WebElement drag1 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
//		
//		WebElement drop1 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
//		
//		
//		
//		WebElement drag2 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[6]"));
//		
//		WebElement drop2 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[3]"));
//		
//		
//		WebElement drag3 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
//		
//		WebElement drop3 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
//		
//		
//		Actions a =  new Actions(driver);
//		
//		
//		a.dragAndDrop(drag, drop).build().perform();
//		a.dragAndDrop(drag1, drop1).build().perform();
//		a.dragAndDrop(drag2, drop2).build().perform();
//		a.dragAndDrop(drag3, drop3).build().perform();
//		
//		
//		TakesScreenshot n = (TakesScreenshot)driver;
//		
//	File src = n.getScreenshotAs(OutputType.FILE);
//	File des = new File("C:\\Users\\BHARATH V\\eclipse-workspace\\org.facebook\\target\\bharath.png");
//	FileUtils.copyFile(src, des);
//	
	
	
		
		
		
		
		
		
		//a.sendKeys(user, "bharahsan").build().perform();
		
		//a.doubleClick(user).build().perform();
	//	a.contextClick(user).build().perform();
		 
		
		//Robot b = new Robot();
		
//		b.keyPress((KeyEvent.VK_DOWN));
//		b.keyRelease((KeyEvent.VK_DOWN));
//		
//		b.keyPress((KeyEvent.VK_DOWN));
//		b.keyRelease((KeyEvent.VK_DOWN));
//	
//		b.keyPress((KeyEvent.VK_ENTER));
//		b.keyRelease((KeyEvent.VK_ENTER));
//	
//		b.keyPress((KeyEvent.VK_TAB));
//		b.keyRelease((KeyEvent.VK_TAB));
//		
//		b.keyPress((KeyEvent.VK_CONTROL));
//		b.keyPress((KeyEvent.VK_V));
//		
//		b.keyRelease((KeyEvent.VK_CONTROL));
//		b.keyRelease((KeyEvent.VK_V));
		
		
		
	}
		
		
		
		
		
//	
	}

	
