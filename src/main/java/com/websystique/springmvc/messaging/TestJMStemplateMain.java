package com.websystique.springmvc.messaging;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.websystique.springmvc.configuration.AppConfig;
import com.websystique.springmvc.configuration.AppConfigTest1;


public class TestJMStemplateMain {

	public static void main(String[] args) throws JMSException {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfigTest1.class);
		TestJMSTemplateSenderReciever sendRecieve = (TestJMSTemplateSenderReciever) appContext.getBean("testJMSTemplateSenderReciever");
		
		sendRecieve.sendMessage("Testing");
		
		System.out.println(sendRecieve.recieveMessage());;
	}

}
