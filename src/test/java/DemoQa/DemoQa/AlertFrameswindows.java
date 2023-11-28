package DemoQa.DemoQa;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class AlertFrameswindows {

	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void elements() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//div)[21]")).click();
		Thread.sleep(7000L);

	}

	@Test(priority = 1)
	public void alertFramesandWindows() throws InterruptedException {

		driver.findElement(By.xpath("(//span)[17]")).click();

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void broweserWindows() throws InterruptedException, AWTException {

		driver.findElement(By.xpath("(//span)[18]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#tabButton")).click();
		Thread.sleep(5000);
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		Thread.sleep(5000);
		// driver.findElement(By.cssSelector("#sampleHeading")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");

		driver.close();

		driver.switchTo().window(a.get(0));
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("#windowButton")).click();
		Thread.sleep(5000);

		ArrayList<String> b = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(b.get(1));
		Thread.sleep(4000);
		// driver.findElement(By.cssSelector("#sampleHeading")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");
		driver.close();
		Thread.sleep(5000);

		driver.switchTo().window(b.get(0));

		driver.findElement(By.cssSelector("#messageWindowButton")).click();

		Thread.sleep(4000);

		ArrayList<String> c = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(c.get(1));
		Thread.sleep(4000);

		Robot r = new Robot();

		r.mouseMove(482, 17);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);

		driver.switchTo().window(c.get(0));

		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void alerts() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");

		driver.findElement(By.xpath("(//span)[19]")).click();

		driver.findElement(By.cssSelector("#alertButton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("#timerAlertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("#confirmButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		// System.out.println(driver.findElement(By.cssSelector("#confirmResult")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("#confirmResult")).getText(), "You selected " + "Ok");

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Top-G");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#promptResult")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("#promptResult")).getText(), "You entered " + "Top-G");

	}

	@Test(priority = 4)
	public void frames() throws InterruptedException, AWTException {

		driver.findElement(By.xpath("(//span)[20]")).click();
		Thread.sleep(2000);
		// List<WebElement> a=(driver.findElements(By.tagName("iframe")));
		// System.out.println(a.size());
		driver.switchTo().frame(3);

		Thread.sleep(3000);

		// driver.findElement(By.cssSelector("#sampleHeading")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.switchTo().frame(4);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");

	}

	@Test(priority = 5)
	public void nestedFrames() throws InterruptedException, AWTException {

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span)[21]")).click();

		Thread.sleep(4000);

		// method 1
		// driver.switchTo().frame("frame1").switchTo().frame(0);
		// we are use id in frame field

		// method 2
		// patent frame
		// driver.switchTo().frame(4);
		driver.switchTo().frame("frame1");
		Thread.sleep(4000);

		// child frame
		driver.switchTo().frame(0);
		// to come back from this frame we have to use default content twice cause we
		// are using two frames(one is parent and another one is child fame.
		// default content example: driver.switchTo().defaultContent();

		Thread.sleep(4000);
		String Cname = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Child Iframe");
		System.out.println(Cname);
		Thread.sleep(3000);
//		driver.close();
		driver.switchTo().defaultContent();

	}

	@Test(priority = 6)
	public void modalDialogs() throws InterruptedException, AWTException {
		
		js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span)[22]")).click();

		driver.findElement(By.cssSelector("#showSmallModal")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#closeSmallModal")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#showLargeModal")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#closeLargeModal")).click();

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
