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

public class Interactions {
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
	public void sortable() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		
		driver.findElement(By.xpath("(//li)[25]")).click();
		
		Thread.sleep(3000);
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		
		
		Thread.sleep(4000);
		
		Actions a= new Actions(driver);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[6]")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[5]")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[4]")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[3]")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[2]")));
		a.build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"demo-tab-grid\"]")).click();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[9]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[8]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[7]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[6]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[5]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[4]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[3]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[2]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		
		
		}
	
	@Test(priority = 3)
	public void selectable() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		
		driver.findElement(By.xpath("(//li)[26]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//li)[34]")).click();
		driver.findElement(By.xpath("(//li)[35]")).click();
		
		js=(JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		driver.findElement(By.xpath("(//li)[36]")).click();
		driver.findElement(By.xpath("(//li)[37]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a)[4]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//li)[38]")).click();
		driver.findElement(By.xpath("(//li)[39]")).click();
		driver.findElement(By.xpath("(//li)[40]")).click();
		driver.findElement(By.xpath("(//li)[41]")).click();
		driver.findElement(By.xpath("(//li)[42]")).click();
		driver.findElement(By.xpath("(//li)[43]")).click();
		driver.findElement(By.xpath("(//li)[44]")).click();
		driver.findElement(By.xpath("(//li)[45]")).click();
		driver.findElement(By.xpath("(//li)[46]")).click();
		

		
		Thread.sleep(4000);
		
		
		
		}
	
	
	@Test(priority = 4)
	public void resizable() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		
		driver.findElement(By.xpath("(//li)[27]")).click();
		
		Thread.sleep(3000);
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		Thread.sleep(4000);
		
		Actions a= new Actions(driver);
		
		
		
		
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span")), 300, 100).perform();
		
		Thread.sleep(4000);
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		Thread.sleep(3000);
		
		a.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"resizable\"]/span")), 300, 100).perform();
		
		
		
		}
	
	@Test(priority = 5)
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
		Thread.sleep(1000);
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350, 250)");
		
		}
	
	@Test(priority = 6)
	public void dragebble() throws InterruptedException, AWTException {
		
		driver.findElement(By.xpath("(//li)[29]")).click();
		
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
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();

	}

}
