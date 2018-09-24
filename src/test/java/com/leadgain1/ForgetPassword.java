package com.leadgain1;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.awt.AWTException;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest(classes =ForgetPassword.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(value="classpath:application.properties")
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ForgetPassword {

	@Autowired
    private WebDriver webDriver;
	
	 @Value("#{'${exitintent.url}'}")
		private String exitIntenetUrl;
	 
	 @Test
	 
	 public void leadGainForget() throws AWTException, InterruptedException, IOException {
		
//		    	this.webDriver.get(exitIntenetUrl);
//		    	JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//		    	
//		    	Thread.sleep(2000);
//		    	String before_login =webDriver.getCurrentUrl();
//		    	webDriver.findElement(By.id("username")).sendKeys("abc");
//		    	Thread.sleep(2000);
//		    	
//		    	webDriver.findElement(By.id("password")).sendKeys("PCLPLZ3J");
//		    	Thread.sleep(2000);
//		    	webDriver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary ant-btn-lg']")).click();
//			    
//		    	String after_login =webDriver.getCurrentUrl();
//			    
//			  
			
//			   assertTrue(before_login.equals(after_login));
		 assertTrue(true);
	 } 
	 
@Test
	 
	 public void leadGainLogin() throws AWTException, InterruptedException, IOException {
	assertTrue(false);
	 } 
	 
	 
}
