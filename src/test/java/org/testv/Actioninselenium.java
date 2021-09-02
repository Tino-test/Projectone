package org.testv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Actioninselenium {
	WebDriver driver;
	
@Test
private void testactions() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement email = driver.findElement(By.id("email"));
WebElement password = driver.findElement(By.id("pass"));
Actions a = new Actions(driver);
a.click(email).perform();
a.doubleClick(password).perform();
a.contextClick(password).perform();
driver.get("https://www.amazon.in/");
WebElement newreleases = driver.findElement(By.xpath("//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45']"));
WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
Actions ab = new Actions(driver);
ab.moveToElement(newreleases).perform();
ab.click(search).keyDown(Keys.SHIFT).sendKeys("samsungmseries").keyUp(Keys.SHIFT).perform();
driver.get("https://www.instagram.com/accounts/login/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement instapassword = driver.findElement(By.xpath("//input[@name='username']"));
Actions aa = new Actions(driver);
aa.clickAndHold(instapassword).release(instapassword).perform();


}
@Test
private void testcalenders() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Calendar.html");
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	WebElement search = driver.findElement(By.id("datepicker"));
	search.click();
	WebElement next = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	next.click();
	Thread.sleep(3000);
	WebElement tenthjuly = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[7]/a"));
	tenthjuly.click();

}
@Test
private void tableselenium() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	// no.of columns
	List<WebElement> columns = driver.findElements(By.tagName("th"));
	int totalcolumns= columns.size();
	System.out.println(totalcolumns);
	//no.of rows
	List<WebElement>rows=driver.findElements(By.tagName("tr"));
	int totalrows=rows.size();
	System.out.println(totalrows);
	///////getpercent
	WebElement getpercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	String percentage = getpercent.getText();
	System.out.println(percentage);
}

@Test(enabled=false)
private void alertsselenium() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Alert.html");
driver.manage().window().maximize();
WebElement buttonone = driver.findElement(By.xpath("//*[@onclick='normalAlert()']"));
buttonone.click();
Alert alert = driver.switchTo().alert();
alert.accept();
WebElement buttontwo = driver.findElement(By.xpath("//*[@onclick='confirmAlert()']"));
buttontwo.click();
Alert confirmbox = driver.switchTo().alert();
confirmbox.dismiss();
WebElement promptbox = driver.findElement(By.xpath("//*[@onclick='confirmPrompt()']"));
promptbox.click();
Alert promptalert = driver.switchTo().alert();
promptalert.sendKeys("sony");
promptalert.accept();
}

@Test
private void navigateelement() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.navigate().to("https://ads.twitter.com/login");
	driver.navigate().to("https://www.indiaistore.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("https://www.hp.com/us-en/home.html");
	driver.navigate().refresh();
	driver.quit();

}

@Test(enabled=false)
private void downloads() throws AWTException, InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/download.html");
	WebElement downloadpdf = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/a[2]"));
	downloadpdf.click();
	Thread.sleep(3000);
	WebElement downloadbutton = driver.findElement(By.xpath("/html/body/pdf-viewer//viewer-pdf-toolbar-new//div/div[3]/viewer-download-controls//cr-icon-button//div/iron-icon"));
	downloadbutton.click();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	File filelocation= new File("C:\\Users\\DELL\\Desktop");
	File[] totalfiles = filelocation.listFiles();
	for (File files : totalfiles) {
		if(files.getName().equals("testleaf.pdf")) {
			System.out.println("file has downloaded");
			break;
		}
		
		
		
		
	}
}

@Test
private void uploadings() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/upload/");
	Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\DELL\\Downloads\\testleaf.xlsx");
	
}
@Test
private void scrollings() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("https://www.mi.com/in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//scroll down
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("window.scroll(0,450)", "");
	//scroll up
	JavascriptExecutor jc=(JavascriptExecutor)driver;
	jc.executeScript("window.scroll(0,-450)", "");
	//scroll to extreme top of the page
	JavascriptExecutor jj=(JavascriptExecutor)driver;
	jj.executeScript("window.scroll(0,0)", "");
	//scroll extreme bottom of the  page 
	JavascriptExecutor jl=(JavascriptExecutor)driver;
	jl.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	WebElement musicstore = driver.findElement(By.xpath("//li[@class='on']"));
	JavascriptExecutor jo=(JavascriptExecutor)driver;
	jo.executeScript("arguments[0].scrollIntoView(true)", musicstore);
}
@Test
private void webbrowsecommands() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Groupalerts\\chromedriver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("https://www.apple.com/in/iphone/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	String currentUrl = driver.getCurrentUrl();
	System.out.println(title);
	System.out.println(currentUrl);
	driver.quit();
}
@Test
private void screenshotone() throws IOException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Testscreeenshot\\chrome92\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://www,leafground.com");
    driver.manage().window().maximize();
    TakesScreenshot tk=(TakesScreenshot)driver;
    File src = tk.getScreenshotAs(OutputType.FILE);
    File des =new File("C:\\Users\\DELL\\eclipse-workspace\\Testscreeenshot\\screenshots\\facebook.png");
    FileUtils.copyFile(src, des);
    driver.close();
}
@Test
private void screenshottwo() throws IOException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Testscreeenshot\\chrome92\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://www,leafground.com");
    driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    TakesScreenshot tk=(TakesScreenshot)driver;
    File src = tk.getScreenshotAs(OutputType.FILE);
    File des =new File("C:\\Users\\DELL\\eclipse-workspace\\Testscreeenshot\\screenshots\\moto.png");
    FileHandler.copy(src, des);
    driver.close();
}
@Test
private void brokenimage() {
	// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Seleinterview\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Image.html");
	WebElement brokenimg =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
	if(brokenimg.getAttribute("naturalWidth").equals("0")) {
		System.out.println("is a brokenimage");
	}else {
		System.out.println("not a broken image");
	}
}
@Test
private void iframesselenium() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/frame.html");
	driver.switchTo().frame(0);
	WebElement button1= driver.findElement(By.id("Click"));
	button1.click();
	String textString=driver.findElement(By.id("Click")).getText();
	driver.switchTo().defaultContent();
driver.switchTo().frame(1);
driver.switchTo().frame("frame2");
WebElement button2=driver.findElement(By.id( "Click1"));
button2.click();
String texttwoString=driver.findElement(By.id( "Click1")).getText();
driver.switchTo().defaultContent();
List<WebElement> totalframesElements=driver.findElements(By.tagName("iframe"));
int   numberofframes= totalframesElements.size();
System.out.println(numberofframes);
}
private void windowhandleselenium() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Seleinterview\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	driver.get("http://www.leafground.com/pages/Window.html");
	String oldwindow =driver.getWindowHandle();
	WebElement firstbutton =driver.findElement(By.id("home"));
	firstbutton.click();
	Set<String> handle = driver.getWindowHandles();
	for (String newwindow : handle) {
		driver.switchTo().window(newwindow);
	
	}
 WebElement editbox = driver.findElement(By.xpath("//img[@class=\"wp-categories-icon svg-image\"]"));
 editbox.click();
 driver.close();
 driver.switchTo().defaultContent();
 Thread.sleep(4000);
 WebElement multiplewindows =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
 multiplewindows.click();
 int numberofwindows=driver.getWindowHandles().size();
 System.out.println("no of windows opened"+numberofwindows);
}
@Test
private void withoutsendkeys() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement search= driver.findElement(By.xpath("//input[@name=\"q\"]"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguements[0].value=dollar",search);
}
}
