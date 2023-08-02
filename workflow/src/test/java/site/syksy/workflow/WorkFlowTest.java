package site.syksy.workflow;

import org.camunda.bpm.engine.spring.SpringProcessEngineServicesConfiguration;
import org.camunda.bpm.spring.boot.starter.property.CamundaBpmProperties;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import site.syksy.workflow.configuration.CamundaConfiguration;
import site.syksy.workflow.configuration.WorkFlowConfiguration;

/**
 * @author ifreeky
 */
@SpringBootTest
//@ComponentScan(basePackages = "site.syksy.workflow")
@SpringBootApplication
public class WorkFlowTest {
    @Test
    public void contextLoads() {
    }



//
//    @EnableAutoConfiguration
//    @ComponentScan(basePackages = "site.syksy.workflow")
//    // Any other applicable annotations e.g. @EntityScan
//    static class TestConfiguration {
//
//    }
}
