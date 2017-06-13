package com.websystique.springmvc.messaging;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.print.attribute.TextSyntax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.websystique.springmvc.model.Order;

@Component
public class TestJMSTemplateSenderReciever {
	@Autowired
	JmsTemplate jmsTemplate;
	
	public void sendMessage(final String msg) {
		System.out.println("Sending Message =="+ msg);
		jmsTemplate.send(new MessageCreator(){
				@Override
				public Message createMessage(Session session) throws JMSException{
					
					TextMessage textMessage = session.createTextMessage(msg);
					return textMessage;
					
				}
			});	
	}
	
	public String recieveMessage() throws JMSException{
		TextMessage textMessage = (TextMessage) jmsTemplate.receive();
		return textMessage.getText();

	}
}
