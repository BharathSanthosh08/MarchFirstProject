package amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bharath {
	public static void main(String[] args)   throws Exception  { 
		System.setProperty("webdriver.edge.driver", "C:\\Users\\BHARATH V\\eclipse-workspace\\amazon\\target\\driver\\msedgedriver.exe");

		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // up casting interface to child


		String s = ("https://www.facebook.com/");
//		String s1 = ("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver89");
		String s2 = ("vv");
		//driver.get(s);
		
		
		

			driver.navigate().to(s);


			driver.manage().window().maximize();

			
			//Implicit wait			
			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			driver.findElement(By.id("email")).sendKeys("selinum");
	
			
			///Explicit wait
			
			//WebDriverWait wait =new 
			
			
			
			
//			driver.findElement(By.xpath("//p[contains(text(),'I have work exp')]")).click();
//			driver.findElement(By.xpath("//button[text()-'Upload Resume']")).click();
//			
//			Runtime.getRuntime().exec("C:\\Users\\BHARATH V\\Desktop\\bharath.exe");
//			
			
			
			
//			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Redmi",Keys.ENTER);
//
//			driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
//			driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[2]")).click();
//			driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[3]")).click();
//			
//			
//			
//			String parent = driver.getWindowHandle();
//			//System.out.println(parent);
//			
//			
//			Set<String> s3 = driver.getWindowHandles();
//			List<String> s4 = new ArrayList<String>(s3);
//			driver.switchTo().window(s4.get(3));
//			
			
			
		//	System.out.println(child);
//			
//			for(String x:s3){   {
//				if(!parent.equals(x)) {
//				driver.switchTo().window(x);
//				String text=driver.findElement(By.xpath("//span[@class=\"B_NuCI\"]")).getText();
//				System.out.println(text);
//				
//				}
				
			
			
			
			
			
			
			
			
			
			
			
			
			
//			WebElement drop = driver.findElement(By.xpath("//select[@id=\"first\"]"));
//			Select s = new Select(drop);
//			s.selectByIndex(2);
//			s.selectByValue("Microsoft") ;
//			s.selectByVisibleText("Yahoo");
//			boolean multiple = s.isMultiple();
//			System.out.println(multiple);
//			
//			List<WebElement> options = s.getOptions();
			
//			print of values-----------------------------------------------
//	
//			for (int i=0;i<options.size();i++) {
//			 WebElement values = options.get(i);
//			String text = values.getText();
//	
//			System.out.println(text);
//		//reverse	print of values-----------------------------------------------
//			
//			for (int j=options.size()-1;j>=0;j--) {
//				 WebElement values1 = options.get(j);
//			String text1 = values1.getText();
//			System.out.println(text1);
//			}
		
//			WebElement down = driver.findElement(By.xpath("//select[@id=\"second\"]"));
//			Select b = new Select(down);
//			b.selectByIndex(0);
//			b.selectByIndex(1);
//			b.selectByIndex(2);
//			b.deselectByIndex(2);
//			b.deselectByIndex(1);
//			b.deselectAll();
//	WebElement sd = b.getFirstSelectedOption();
//		String tt =sd.getText();
//			System.out.println(tt);
//			
			
			
		//get the all values------------------------------------------
//			
//		List<WebElement> options2 = b.getAllSelectedOptions();
//		for(int i=0;i<options2.size();i++) {
//		WebElement se	=options2.get(i);
//		String w= se.getText();
//		System.out.println(w);
//		//get reverse the all values------------------------------------------
		
		
		
		
		
		
		
			
			
			
//		WebElement user = 		driver.findElement(By.id("email"));
//		WebElement password =	driver.findElement(By.id("pass"));
////		WebElement log =	driver.findElement(By.xpath("//button[@name='login']"));
//		WebElement scrool =	driver.findElement(By.xpath("//a[text()='careers']"));
//		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setArtibute('value','selenium')",user,password);
//		js.executeScript("arguments[1].setArtibute('value','123455')", user,password);
//		
//		js.executeScript("argument[1].setAtribute('style','background:pink;border:2px solid green')", user,password);
//	
//		js.executeScript("arguments[0].('value').click()",log);
		
//		
//		Object executeScript = js.executeScript("return arguments[0].getArtibute('value')", user);
//		
//		System.out.println(executeScript);
//		js.executeScript("arguments[0].scroolIntoView(true)", scrool);
//		Thread.sleep(2000);
//		js.executeScript("argumets[0].scroolIntoView(false)",user);
////---------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
//		
//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("bharath");
//WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"a077aaSe\"]"));
//driver.switchTo().frame(frame);
//driver.findElement(By.xpath("//img[@src-'Jmeter720.png']")).click();
//
//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//System.out.println(frames.size());
//for(int i=0;i<frames.size();i++) {
//	try {
//		driver.switchTo().frame(i);
//		driver.findElement(By.xpath("//img[@src-'Jmeter720.png']")).click();
//		
//	}
//	catch(Exception c) {
//		System.out.println("not matched");
//		driver.switchTo().parentFrame();
//	}
//}
	}}
