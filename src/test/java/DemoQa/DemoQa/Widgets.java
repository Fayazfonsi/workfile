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

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class Widgets {

	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void elements() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//div)[21]")).click();
		Thread.sleep(7000L);

	}

	@Test(priority = 1)
	public void widgets2() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span)[24]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void Accordian() throws InterruptedException, AWTException {

		driver.findElement(By.xpath("(//span)[25]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='card']//div[@id='section1Heading']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='accordion']//div[@id='section2Heading']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='card']//div[@id='section2Heading']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='accordianContainer']//div[@id='section3Heading']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='card']//div[@id='section3Heading']")).click();

		Thread.sleep(5000);

	}

	@Test(priority = 3)
	public void autoComplete() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		Thread.sleep(2000);

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		driver.findElement(By.xpath("(//span)[26]")).click();

		driver.findElement(By.xpath("(//input)[1]")).click();

		Thread.sleep(2000);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);

		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);

		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);

		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);

		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);

		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);

		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);

		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);

		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);

		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input)[2]")).click();

		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);

		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);

		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@Test(priority = 4)
	public void datePicker() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span)[27]")).click();

		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#datePickerMonthYearInput")).click();
		Thread.sleep(3000);

		WebElement staticDropdown = driver.findElement(By.xpath("(//select)[1]"));

		Select down = new Select(staticDropdown);
		down.selectByIndex(7);

		Thread.sleep(3000);

		WebElement staticDropdown1 = driver.findElement(By.xpath("(//select)[2]"));

		Select down1 = new Select(staticDropdown1);
		down1.selectByValue("2023");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@role='listbox']//div[@aria-label='Choose Wednesday, August 2nd, 2023']"))
				.click();
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.cssSelector("#datePickerMonthYearInput")).getAttribute("value"));

		driver.findElement(By.cssSelector("#dateAndTimePickerInput")).click();

		driver.findElement(By.xpath("(//div)[82]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div)[87]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div)[84]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div)[92]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@role='listbox']//div[@aria-label='Choose Monday, April 3rd, 2023']"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li)[40]")).click();

		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("#dateAndTimePickerInput")).getAttribute("value"));

		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void slider() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("jacascript:window.scrollBy(350,250)");

		js = (JavascriptExecutor) driver;
		js.executeScript("jacascript:window.scrollBy(350,250)");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span)[28]")).click();
		Thread.sleep(2000);

		WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		Actions a = new Actions(driver);

		// we should use x value only y value is not needed. if we use y value instead
		// of 0 will make the test fail
		// method 1
		// a.dragAndDropBy(slider, 595, 0).perform();

		// method 2
		// a.dragAndDropBy(slider, 595, 0).build().perform();

		// method 3
		a.dragAndDropBy(slider, 595, 0);
		a.perform();

		// method 4
		// a.dragAndDropBy(slider, 595, 0);
		// a.build().perform();

		driver.findElement(By.cssSelector("#sliderValue")).click();
		System.out.println(driver.findElement(By.cssSelector("#sliderValue")).getAttribute("value"));

	}

	@Test(priority = 6)
	public void progressBar() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("jacascript:window.scrollBy(350,250)");

		js = (JavascriptExecutor) driver;
		js.executeScript("jacascript:window.scrollBy(350,250)");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span)[29]")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#startStopButton")).click();

		WebElement progressbar = driver.findElement(By.xpath("//*[@id=\"progressBar\"]/div"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		boolean progressStatus = wait.until(ExpectedConditions.attributeToBe(progressbar, "aria-valuenow", "100"));
		if (progressStatus == true) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"resetButton\"]"))).click();
		}

	}

	@Test(priority = 7)
	public void tabs() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("jacascript:window.scrollBy(350,250)");

		js = (JavascriptExecutor) driver;
		js.executeScript("jacascript:window.scrollBy(350,250)");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li)[21]")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#demo-tab-origin")).click();

		String origin = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-origin\"]/p[1]")).getText();
		origin.contains("Contrary to popular belief, Lorem Ipsum is not simply random text");

		driver.findElement(By.cssSelector("#demo-tab-use")).click();

		String use = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-use\"]/p")).getText();
		use.contains(
				"It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.");

		driver.findElement(By.cssSelector("#demo-tab-what")).click();

		String what = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-what\"]/p")).getText();
		what.contains("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");

	}

	@Test(priority = 8)
	public void toolTips() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		driver.findElement(By.xpath("(//li)[22]")).click();

		Thread.sleep(5000);

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"toolTipButton\"]"))).build().perform();
		
		Thread.sleep(4000);

		// press ctrl + f and search "You hovered over the button"
		// driver.findElement(By.className("tooltio-inner")).getText();
		// System.out.println(driver.findElement(By.className("tooltip-inner")).getText());

		Assert.assertEquals(driver.findElement(By.className("tooltip-inner")).getText(), "You hovered over the Button");

		Thread.sleep(4000);
		a.moveToElement(driver.findElement(By.id("toolTipTextField"))).build().perform();

		Thread.sleep(4000);

		Assert.assertEquals(driver.findElement(By.className("tooltip-inner")).getText(),
				"You hovered over the text field");
		Thread.sleep(4000);

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		Thread.sleep(4000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"texToolTopContainer\"]/a[1]"))).build().perform();
		Thread.sleep(4000);

		Assert.assertEquals(driver.findElement(By.className("tooltip-inner")).getText(),
				"You hovered over the Contrary");
		Thread.sleep(3000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"texToolTopContainer\"]/a[2]"))).build().perform();
		Thread.sleep(4000);

		Assert.assertEquals(driver.findElement(By.className("tooltip-inner")).getText(),
				"You hovered over the 1.10.32");

		Thread.sleep(4000);

	}

	@Test(priority = 9)
	public void selectMenu() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		driver.findElement(By.xpath("(//li)[23]")).click();

		Thread.sleep(3000);

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"))).build().perform();

		Thread.sleep(3000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"))).build().perform();

		Thread.sleep(3000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[1]/a"))).build().perform();

		Thread.sleep(3000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[2]/a"))).build().perform();

		Thread.sleep(3000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"))).build().perform();

		Thread.sleep(3000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"))).build().perform();

		Thread.sleep(3000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]/a"))).build().perform();

		Thread.sleep(3000);

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a"))).build().perform();
		Thread.sleep(3000);

	}
	
	@Test(priority = 10)
	public void menu() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		driver.findElement(By.xpath("(//li)[24]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]")).click();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]/div[1]")).click();
		
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement Staticdropdown= driver.findElement(By.cssSelector("#oldSelectMenu"));
		
		Select down = new Select(Staticdropdown);
		
		down.selectByIndex(3);
		
		Thread.sleep(3000);
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		driver.findElement(By.xpath("(//div)[102]")).click();
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement staticDropsown1 = driver.findElement(By.cssSelector("#cars"));
		
		
		Select down1=new Select(staticDropsown1);
		
		down1.selectByIndex(0);
		down1.selectByIndex(1);
		down1.selectByIndex(2);
		
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
