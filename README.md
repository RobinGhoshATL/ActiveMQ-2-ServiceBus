## Migrating JMS code from Active Apache MQ to Azure Service Bus.

1) Add the spring jms service bus module into your project pom.xml

    <!-- Azure Service Bus -->
	<dependency>
    	<groupId>com.azure.spring</groupId>
    	<artifactId>azure-spring-boot-starter-servicebus-jms</artifactId>
    	<version>3.14.0</version>
	</dependency> 
    
2) Add 2 new parameters in your application.properties file

	spring.jms.servicebus.connection-string={Default=....connection string settings}

	spring.jms.servicebus.pricing-tier=Premium

3) Use spring.jms.servicebus.enabled=[true/false] 
if you plan to switch between Service Bus or Active Apache MQ at runtime.
	
	Customers requiring phased approach from On-Prem to Azure Cloud should use this technique.
	
	

## spring.jms.servicebus.enabled=true should switch to Azure Service Bus


<img src="images/Code-Connects-To-Service-Bus.png">



## spring.jms.servicebus.enabled=false should switch to Apache Active MQ


<img src="images/Code-Connects-To-Active-MQ.png">





