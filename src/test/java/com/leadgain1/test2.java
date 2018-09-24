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
@SpringBootTest(classes =test2.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(value="classpath:application.properties")
@Configuration
@ComponentScan
@EnableAutoConfiguration

public class test2 {

	
	@Autowired
    private WebDriver webDriver;
	
	 @Value("#{'${exitintent.url}'}")
		private String exitIntenetUrl;
	 
	 @Test
	 
	 public void testNew() throws AWTException, InterruptedException, IOException {
		
		 assertTrue(true);
	 } 
	 
@Test
	 
	 public void testOld() throws AWTException, InterruptedException, IOException {
	 assertTrue(true);
	 } 
	 
	
	
}
