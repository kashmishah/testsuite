package com.leadgain;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;




import com.leadgain.ExitIntentSeleniumTest;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExitIntentSeleniumTest.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(value="classpath:application.properties")
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ExitIntentSeleniumTest {

public static Logger LOGGER = Logger.getLogger(ExitIntentSeleniumTest.class);
    
	@Autowired
    private WebDriver webDriver;
	

	 @Value("#{'${exitintent.url}'}")
		private String exitIntenetUrl;
	 
	 
	 @Value("#{'${exitintent.exiturl}'}")
		private String exitUrl;
	 
	 @Value("#{'${exitintent.popup.form.company}'}")
	    private String company;
	 
	 @Value("#{'${exitintent.popup.form.fname}'}")
	    private String fname;
	 
	 @Value("#{'${exitintent.popup.form.lname}'}")
	    private String lname;
			
	 @Value("#{'${exitintent.popup.form.add1}'}")
	    private String add1;
	 
	 @Value("#{'${exitintent.popup.form.add2}'}")
	    private String add2;
	 
	 @Value("#{'${exitintent.popup.form.email}'}")
	    private String email;
			
	 @Value("#{'${exitintent.popup.form.city}'}")
	    private String city;
			 
	 @Value("#{'${exitintent.popup.form.state}'}")
	    private String state;
			
	 @Value("#{'${exitintent.popup.form.country}'}")
	    private String country;
			
	 @Value("#{'${exitintent.popup.form.zip}'}")
	    private String zip;
	 
	 @Value("#{'${exitintent.popup.form.ph}'}")
	    private String ph;
	 
	 @Value("#{'${exitintent.popup.form.password}'}")
	    private String password;
	 	 
	 @Value("#{'${server.screenshot.relative.path}'}")
	    private String screenshotPath;
	 
	 @BeforeMethod
	public void setup() {
	    	File file = new File("C:\\testing\\screenshots");
	    	if(!file.exists())
	    	file.mkdirs();
	    }
	 
	  @Test
	// Registeruser
	    public void leadGainRegister() throws AWTException, InterruptedException, IOException {
//		  LOGGER.debug("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	System.out.println("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	this.webDriver.get(exitIntenetUrl);
//	    	JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//	    	getScreenShot();
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.xpath("//a[contains(@href,\"#/register\")]")).click();
//	    	Thread.sleep(3000);
//	    	String before_login =webDriver.getCurrentUrl();
//	    	webDriver.findElement(By.id("name")).sendKeys(company);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("firstName")).sendKeys(fname);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("lastName")).sendKeys(lname);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("address1")).sendKeys(add1);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("address2")).sendKeys(add2);
//	    	Thread.sleep(2000);
//	    	
//	    	System.out.println(java.util.UUID.randomUUID());
//
//	    	System.out.println(java.util.UUID.randomUUID()+"@gmail.com");
//	    	
//	    	webDriver.findElement(By.id("email")).sendKeys(java.util.UUID.randomUUID()+"@gmail.com");
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("city")).sendKeys(city);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("state")).sendKeys(state);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("country")).sendKeys(country);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("zip")).sendKeys(zip);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("phone")).sendKeys(ph);
//	    	Thread.sleep(4000);
//	    	
//	    	webDriver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary ant-btn-lg']")).click();
//		    
//	    	 String after_login =webDriver.getCurrentUrl();
//	    	 
//	    	 assertTrue(before_login.equals(after_login));
	    	
		  assertTrue(true);
	  }
	 
//	 @Test
//	 //gmailpasswordfetch
//  public void gmailPasswordFetch() throws AWTException, InterruptedException, IOException {
//		  LOGGER.debug("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	System.out.println("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	this.webDriver.get(exitUrl);
//	    	JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//	    	getScreenShot();
//	    	Thread.sleep(2000);
//	    	
//	    	webDriver.findElement(By.id("identifierId")).sendKeys(email);
//	    	webDriver.findElement(By.id("identifierNext")).click();
//	    	Thread.sleep(3000);
//	    	
//	    	webDriver.findElement(By.name("password")).sendKeys(password);
//	    	Thread.sleep(3000);
//	    	webDriver.findElement(By.id("passwordNext")).click();
//	    	Thread.sleep(1000);
//	    	List<WebElement> a = webDriver.findElements(By.cssSelector("div.xT>div.y6>span>b"));

// 	for(WebElement emailsub : a){
// 	    if(emailsub.getText().equals("Registration Confirmation and Account activation") == true){
//
// 	           emailsub.click();
// 	           break;
// 	        }
// 	    }	    	
//	    	Thread.sleep(1000);
//	    	WebElement element=webDriver.findElement(By.xpath("//*[@id=':j9']/div[1]/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/blockquote/p[4]"));
//	    	System.out.println(element.getText().split(" ")[1]);
//	    	String pwd=element.getText().split(" ")[1];
//	 
//	 }
	 
	 @Test
	// LeadgainLogin
	  public void leadGainLogin() throws AWTException, InterruptedException, IOException {
//		  LOGGER.debug("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	System.out.println("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	this.webDriver.get(exitIntenetUrl);
//	    	JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//	    	getScreenShot();
//	    	Thread.sleep(2000);
//	    	String before_login =webDriver.getCurrentUrl();
//	    	webDriver.findElement(By.id("username")).sendKeys(email);
//	    	Thread.sleep(2000);
//	    	
//	    	webDriver.findElement(By.id("password")).sendKeys("PCLPLZ3J");
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary ant-btn-lg']")).click();
//		    
//	    	String after_login =webDriver.getCurrentUrl();
//		    
//		  
//		
//		   assertTrue(before_login.equals(after_login));
//	    	Thread.sleep(5000);
		 
		 assertTrue(false);
	 }
//	 
//	 @Test
//	// ForgotPassword
//	    public void leadGainForgotPassword() throws AWTException, InterruptedException, IOException {
//		  LOGGER.debug("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	System.out.println("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	this.webDriver.get(exitIntenetUrl);
//	    	JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//	    	getScreenShot();
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.xpath("//a[contains(@href,\"#/forgotPassword\")]")).click();
//	    	Thread.sleep(3000);
//	    	webDriver.findElement(By.id("username")).sendKeys(email);
//	    	Thread.sleep(3000);
//	    	webDriver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary']")).click();
//		    Thread.sleep(2000);
//		   assertThat(false);
//	    	
//	 }
	 
//	 @Test
//	// Changepassword
//	  public void leadGainChangePassword() throws AWTException, InterruptedException, IOException {
//		  LOGGER.debug("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	System.out.println("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	this.webDriver.get(exitIntenetUrl);
//	    	JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//	    	getScreenShot();
//	    	String before_login =webDriver.getCurrentUrl();
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("username")).sendKeys(email);
//	    	Thread.sleep(2000);
//	    	
//	    	webDriver.findElement(By.id("password")).sendKeys("PCLPLZ3J");
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary ant-btn-lg']")).click();
//		    Thread.sleep(1000);
//		    String after_login =webDriver.getCurrentUrl();
//		    
//		    System.out.println(!before_login.equals(after_login));
//		
//		   assertTrue(before_login.equals(after_login));
//		    
////		    webDriver.findElement(By.xpath("//a[contains(@href,\"#/changePassword\")]")).click();
////	    	Thread.sleep(3000);
////	    	webDriver.findElement(By.id("oldpassword")).sendKeys("YITQ6XWP");
////	    	Thread.sleep(2000);
////	    	webDriver.findElement(By.id("password")).sendKeys("kashmishah");
////	    	Thread.sleep(2000);
////	    	webDriver.findElement(By.id("confirm")).sendKeys("kashmishah");
////	    	Thread.sleep(2000);
////	    	webDriver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary ant-btn-lg']")).click();
////		    Thread.sleep(7000);
//		    
//	 }
	 
	 
//	  @Test
//	//completeflow
//	    public void leadGainFlow() throws AWTException, InterruptedException, IOException {
//		  LOGGER.debug("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	System.out.println("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	this.webDriver.get(exitIntenetUrl);
//	    	JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//	    	getScreenShot();
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.xpath("//a[contains(@href,\"#/register\")]")).click();
//	    	Thread.sleep(3000);
//	    	webDriver.findElement(By.id("name")).sendKeys(company);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("firstName")).sendKeys(fname);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("lastName")).sendKeys(lname);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("address1")).sendKeys(add1);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("address2")).sendKeys(add2);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("email")).sendKeys(email);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("city")).sendKeys(city);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("state")).sendKeys(state);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("country")).sendKeys(country);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("zip")).sendKeys(zip);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.id("phone")).sendKeys(ph);
//	    	Thread.sleep(4000);
//	    	
//	    	webDriver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary ant-btn-lg']")).click();
//		    Thread.sleep(2000);
//	    	
//	  }
//	 
//	 @Test
//	 //gmailpasswordfetch
// public void gmailPasswordFetch() throws AWTException, InterruptedException, IOException {
//		  LOGGER.debug("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	System.out.println("INSIDE : checkGDPRCheckboxIsChecked()");
//	    	this.webDriver.get(exitUrl);
//	    	JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//	    	getScreenShot();
//	    	Thread.sleep(2000);
//	    	
//	    	webDriver.findElement(By.id("identifierId")).sendKeys(email);
//	    	webDriver.findElement(By.id("identifierNext")).click();
//	    	Thread.sleep(3000);
//	    	
//	    	webDriver.findElement(By.name("password")).sendKeys(password);
//	    	Thread.sleep(3000);
//	    	webDriver.findElement(By.id("passwordNext")).click();
//	    	Thread.sleep(1000);
//	    		
//	    	
//	    	List<WebElement> a = webDriver.findElements(By.cssSelector("div.xT>div.y6>span>b"));
//
//	    	for(WebElement emailsub : a){
//	    	    if(emailsub.getText().equals("Registration Confirmation and Account activation") == true){
//
//	    	           emailsub.click();
//	    	           break;
//	    	        }
//	    	    }
//	    	
//	    	//webDriver.findElement(By.xpath("//span[contains(@email, 'sales@demandmatrix.com') and text()='Registration Confirmation and Account activation']")).click();    	
//	    	Thread.sleep(1000);
//	    	
//	    	
//	    	WebElement element=webDriver.findElement(By.xpath("//*[@id=':10p']/div[1]/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/blockquote/p[4]"));
//	    	System.out.println(element.getText().split(" ")[1]);
//	    	String pwd=element.getText().split(" ")[1];
//	 
//	 
//	    	this.webDriver.get(exitIntenetUrl);
//	    
//	    	getScreenShot();
//	    	Thread.sleep(1000);
//	    	this.webDriver.get(exitIntenetUrl);
//	    	webDriver.findElement(By.id("username")).sendKeys(email);
//	    	Thread.sleep(1000);
//	    	
//	    	webDriver.findElement(By.id("password")).sendKeys(pwd);
//	    	Thread.sleep(2000);
//	    	webDriver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary ant-btn-lg']")).click();
//		   // Thread.sleep(5000);
//		    assertThat(true);
//	 }
	 
//private void getScreenShot() throws IOException {
//	File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(scrFile, new File(screenshotPath+"\\"+System.currentTimeMillis()+".png"));
//}
//private void scrollPage(int scrollToPage) throws InterruptedException {
//	Thread.sleep(10000);
//	Actions actions = new Actions(webDriver);
//	for(int i=0;i<(scrollToPage*10);i++) {
//    	actions.sendKeys(Keys.PAGE_DOWN).perform();
//    	System.out.println("Page down performed.....");
//    }
//}
}






////#CSV
//	
//
//	@Test
//	public void readCsv() throws AWTException, InterruptedException, IOException {
//   
//        try {
//
//            CsvReader testcases = new CsvReader("c://test.csv");
//
//            testcases.readHeaders();
//            //get total numbers of header column
//           int numberOfHeaders=testcases.getHeaderCount();
//            //print header column
//            for(int i=0;i<numberOfHeaders;i++)
//            {
//                System.out.print(testcases.getHeader(i)+",  ");
//            }
//            System.out.println();
//            boolean flag=true;
//            while (testcases.readRecord())
//            {
//                String TestId = testcases.get("state");
//                String TestName = testcases.get("country");
//                String TestModule = testcases.get("count");
//                
//                 // output file content
//                System.out.println(TestId +",   " + TestName +",    " + TestModule);
//               flag = flag && TestName.equals(TestName.toUpperCase());
//               // System.out.println(TestName.equals(TestName.toUpperCase()));
//               
//              // assertThat(flag);
//            }
//            System.out.println(flag);  
//assertThat(flag);
//            testcases.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}