package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueReceiveController {

    
    private static final String QUEUE_NAME = "niel";  // move this into application properties using Spring varaibles
    
    private final Logger logger = LoggerFactory.getLogger(QueueReceiveController.class);
    
    @JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    public void receiveMessage(User user) {
            logger.info("Received message: {}", user.getName());
        
    }
}