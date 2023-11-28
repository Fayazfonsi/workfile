package DemoQa.DemoQa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class Forms {
	
	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority=0)
  public void elements() throws InterruptedException {
	  
	 
		  Thread.sleep(15000);
		  driver.findElement(By.xpath("(//div)[21]")).click();
		  Thread.sleep(2000L);
		  
	  
  }
  
  
  @Test(priority=1)
  public void forms() throws InterruptedException {
	  driver.findElement(By.xpath("(//div)[25]")).click();
	  Thread.sleep(5000);
	  
	  
	  
	  
  }
  
  @Test(priority=2)
  public void PracticeForm() throws InterruptedException, AWTException {
	  
	  driver.findElement(By.xpath("(//span)[15]")).click();
	  
	  driver.findElement(By.cssSelector("#firstName")).sendKeys("vanmamru");
	  driver.findElement(By.cssSelector("#lastName")).sendKeys("p");
	  driver.findElement(By.cssSelector("#userEmail")).sendKeys("vanmam@gmail.com");
	  driver.findElement(By.xpath("(//label)[3]")).click();
	  driver.findElement(By.cssSelector("#userNumber")).sendKeys("9876896758");
	  
	  /*js = (JavascriptExecutor)driver;
	  js.executeScript("javascript:window.scrollBy(250,350)");*/
	  
	  js = (JavascriptExecutor)driver;
	  js.executeScript("javascript:window.scrollBy(250,350)");
	  Thread.sleep(4000);
	  
	  driver.findElement(By.cssSelector("#dateOfBirthInput")).click();
	  Thread.sleep(2000);
	  
	  WebElement stadropdown=driver.findElement(By.cssSelector(".react-datepicker__month-select"));
	  
	  Select down=new Select(stadropdown);
	  down.selectByIndex(3);
	  Thread.sleep(2000);
	  
	  WebElement stadropdowm1=driver.findElement(By.cssSelector(".react-datepicker__year-select"));
	  
	  Select down1=new Select(stadropdowm1);
	  down1.selectByValue("1996");
	  Thread.sleep(2000);
	  
	  WebElement month = driver.findElement(By.className("react-datepicker__month"));
	  month.findElement(By.xpath("(//div)[117]")).click();
	  
	  
	  Thread.sleep(4000);
	  
	 
	  driver.findElement(By.cssSelector("#subjectsContainer")).click();
	  
	  Thread.sleep(3000);
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_E);
	  r.keyRelease(KeyEvent.VK_E);
	  r.keyPress(KeyEvent.VK_N);
	  r.keyRelease(KeyEvent.VK_N);
	  r.keyPress(KeyEvent.VK_G);
	  r.keyRelease(KeyEvent.VK_G);
	  r.keyPress(KeyEvent.VK_L);
	  r.keyRelease(KeyEvent.VK_L);
	  r.keyPress(KeyEvent.VK_I);
	  r.keyRelease(KeyEvent.VK_I);
	  r.keyPress(KeyEvent.VK_S);
	  r.keyRelease(KeyEvent.VK_S);
	  r.keyPress(KeyEvent.VK_H);
	  r.keyRelease(KeyEvent.VK_H);
	  Thread.sleep(3000);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  /*ArrayList<WebElement> a = new ArrayList<WebElement>(driver.findElements(By.className("subjects-auto-complete__menu")));
	  System.out.println(a.size());
	  driver.findElement(By.cssSelector("#subjectsContainer")).sendKeys("English");*/
	  
	  driver.findElement(By.xpath("(//label)[12]")).click();
	  String testdata="E:\\eclips work files\\DemoQa\\Test Data\\Test Data.jpg";
	  driver.findElement(By.cssSelector("#uploadPicture")).sendKeys(testdata);
	  Thread.sleep(4000);
	  
//	  js= (JavascriptExecutor)driver;
	  //js.executeScript("javascript:windows.scrollBy(250,350)");
	  
	  driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Dubai main road");
	  
	  Thread.sleep(5000);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_SUBTRACT);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  
	  
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("(//div)[115]")).click();
	  
	  r.keyPress(KeyEvent.VK_R);
	  r.keyRelease(KeyEvent.VK_R);
	  
	  r.keyPress(KeyEvent.VK_A);
	  r.keyRelease(KeyEvent.VK_A);
	  
	  r.keyPress(KeyEvent.VK_J);
	  r.keyRelease(KeyEvent.VK_J);
	  
	  Thread.sleep(3000);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("(//div)[125]")).click();
	  
	  r.keyPress(KeyEvent.VK_J);
	  r.keyRelease(KeyEvent.VK_J);
	  
	  r.keyPress(KeyEvent.VK_A);
	  r.keyRelease(KeyEvent.VK_A);
	  
	  r.keyPress(KeyEvent.VK_I);
	  r.keyRelease(KeyEvent.VK_I);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.cssSelector("#submit")).click();
	  
	  Thread.sleep(4000);	
	  
	  driver.findElement(By.cssSelector("#closeLargeModal")).click();
	  
	  Thread.sleep(4000);
	  
	  
  }
  
  
  
  
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\eclips\\chromedriver-win64\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://demoqa.com/elements");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	  //driver.close();
	  driver.quit();
  }

}
