package site.syksy.workflow.service;

import org.camunda.bpm.engine.repository.Deployment;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

/**
 * @author ifreeky
 */
public interface DeployService {

    Deployment deploy(String processName, InputStream bpmnStream);
    Deployment deploy(String processName, String bpmnXmlSrt);
    Deployment deploy(ZipInputStream zipInputStream);
}
