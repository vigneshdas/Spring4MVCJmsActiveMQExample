package com.websystique.springmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.websystique.springmvc.messaging.TestJMSTemplateSenderReciever;

@Configuration
@ComponentScan(basePackages = "com.websystique.springmvc.messaging")
@Import({MessagingConfiguration.class,MessagingListnerConfiguration.class})
public class AppConfigTest1 {
	
	@Bean(name="testJMSTemplateSenderReciever")
    public TestJMSTemplateSenderReciever testJMSTemplateSenderReciever() {
        return new TestJMSTemplateSenderReciever();
    }
}
