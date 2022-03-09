package com.example.demo;


import javax.jms.ConnectionFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableJms
public class MyActiveMQConfig {

    /*
    @Bean
    public JmsListenerContainerFactory<?> containerFactory(ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer) {

        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        return factory;
    }
    
   

    @Bean
    public ActiveMQConnectionFactory consumerActiveMQConnectionFactory(){
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL("");
        return activeMQConnectionFactory;
    }

    
    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(){

        DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
        defaultJmsListenerContainerFactory.setConnectionFactory(consumerActiveMQConnectionFactory());
        defaultJmsListenerContainerFactory.setPubSubDomain(true);
        return defaultJmsListenerContainerFactory;
    } 
*/
    //
    // Standard Jackson converter
    //
    @Bean
    public MessageConverter jacksonJmsMessageConverter(ObjectMapper objectMapper) {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setObjectMapper(objectMapper);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }



}
