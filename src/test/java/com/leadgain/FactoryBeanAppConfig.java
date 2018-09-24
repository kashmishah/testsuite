package com.leadgain;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanAppConfig {
  
	@Value(value = "${browser.type}") 
	public String browserType;
	
    @Bean(name = "driverFactory")
    public DriverFactory driverFactory() {
    	DriverFactory driverFactory = new DriverFactory(browserType);
        return driverFactory;
    }
 
	@Autowired
    private DriverFactory driverFactory;
	
    @Bean(name="webDriver")
    public WebDriver webDriver() throws Exception {
		return driverFactory.getObject();
	}
}