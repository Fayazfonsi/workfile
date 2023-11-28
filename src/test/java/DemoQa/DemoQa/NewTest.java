package DemoQa.DemoQa;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.css.model.Value;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void elements() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//span)[3]")).click();
		Thread.sleep(7000L);

	}

	@Test(priority = 1)
	public void interaction() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//span)[35]")).click();
		Thread.sleep(4000);

	}

	@Test(priority = 2)
	public void droppable() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		
		driver.findElement(By.xpath("(//li)[28]")).click();
		
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")), driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-accept\"]")).click();
		Thread.sleep(4000);
		Robot r = new Robot();
		r.mouseMove(523, 520);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseMove(786, 520);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		Thread.sleep(4000);
		
		r.mouseMove(523, 590);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseMove(786, 590);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-preventPropogation\"]")).click();
		Thread.sleep(3000);
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"dragBox\"]")), driver.findElement(By.xpath("//*[@id=\"notGreedyDropBox\"]/p"))).build().perform();
		Thread.sleep(3000);
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"dragBox\"]")), driver.findElement(By.xpath("//*[@id=\"notGreedyInnerDropBox\"]/p"))).build().perform();
		Thread.sleep(3000);
		js=(JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		Thread.sleep(3000);
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"dragBox\"]")), driver.findElement(By.xpath("//*[@id=\"greedyDropBox\"]/p"))).build().perform();
		Thread.sleep(3000);
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"dragBox\"]")), driver.findElement(By.xpath("//*[@id=\"greedyDropBoxInner\"]/p"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-revertable\"]")).click();
		
		Thread.sleep(3000);
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"revertable\"]")), driver.findElement(By.xpath("(//div)[86]"))).build().perform();
		
		Thread.sleep(4000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"notRevertable\"]")), driver.findElement(By.xpath("(//div)[86]"))).build().perform();
		Thread.sleep(3000);
		
		}

	

	@BeforeSuite
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\eclips\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();

	}

}
