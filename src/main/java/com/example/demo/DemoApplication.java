package com.example.demo;

import com.azure.spring.autoconfigure.jms.AzureServiceBusJMSProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;

@SpringBootApplication

//@EnableAutoConfiguration(exclude = JmsAutoConfiguration.class)


public class DemoApplication {

	public static void main(String[] args) {
	   
				SpringApplication.run(DemoApplication.class, args);
			
		
	}

}
