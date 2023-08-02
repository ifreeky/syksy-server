package site.syksy.workflow.service.impl;

import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.repository.Deployment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import site.syksy.workflow.service.DeployService;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

/**
 * @author ifreeky
 */
@Service
public class DeployServiceImpl implements DeployService {

    private final RepositoryService repositoryService;

    public DeployServiceImpl(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }

    @Override
    public Deployment deploy(String processName, InputStream bpmnStream) {
        return repositoryService.createDeployment()
                .addInputStream(processName, bpmnStream)
                .deploy();
    }

    @Override
    public Deployment deploy(String processName, String bpmnXmlSrt) {
        return repositoryService.createDeployment()
                .addString(processName, bpmnXmlSrt)
                .deploy();
    }

    @Override
    public Deployment deploy(ZipInputStream zipInputStream) {
        return repositoryService.createDeployment()
                .addZipInputStream(zipInputStream)
                .deploy();
    }
}
