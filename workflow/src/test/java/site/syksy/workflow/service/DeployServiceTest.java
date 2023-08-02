package site.syksy.workflow.service;

import camundajar.impl.scala.App;
import org.camunda.bpm.engine.repository.Deployment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import site.syksy.workflow.WorkFlowTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * @author ifreeky
 */
@Component
public class DeployServiceTest extends WorkFlowTest {

//    @Autowired
    private DeployService deployService;


    @Test
    public void testDeployInputStream() throws IOException {

        try (InputStream inputStream = Objects.requireNonNull(App.class.getClassLoader().getResource("bpmn/singleNode.bpmn")).openStream()) {
            Deployment deploy = deployService.deploy("singleNode", inputStream);
            Assert.notNull(deploy, "测试部署失败");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
