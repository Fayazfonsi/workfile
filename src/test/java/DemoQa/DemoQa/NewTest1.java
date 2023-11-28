package DemoQa.DemoQa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void dragebble() throws InterruptedException, AWTException {
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"dragBox\"]")), 200, 0).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"draggableExample-tab-axisRestriction\"]")).click();
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"restrictedX\"]")), 100, 0).perform();
		Thread.sleep(3000);
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"restrictedY\"]")), 0, 70).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"draggableExample-tab-containerRestriction\"]")).click();
		Thread.sleep(3000);
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"containmentWrapper\"]/div")), 200, 70).perform();
		Thread.sleep(3000);
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350, 250)");
		Thread.sleep(3000);
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"draggableExample-tabpane-containerRestriction\"]/div[2]/span")), 0, 30).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"draggableExample-tab-cursorStyle\"]")).click();
		Thread.sleep(3000);
		
		
		
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"cursorCenter\"]")), 250, 210).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"cursorTopLeft\"]")), -70, -180).build().perform();
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350, 250)");
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"cursorBottom\"]")), 0, 200).build().perform();
		Thread.sleep(2000);

		
		
		
		}

	

	@BeforeSuite
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\eclips\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();

	}

}
