package examplecapstone.common;


import examplecapstone.OrderNotificationApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderNotificationApplication.class })
public class CucumberSpingConfiguration {
    
}
