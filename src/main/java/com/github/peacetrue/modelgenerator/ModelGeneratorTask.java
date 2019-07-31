package com.github.peacetrue.modelgenerator;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class ModelGeneratorTask extends DefaultTask {

    private ModelGeneratorClient client = new ModelGeneratorClient();

    @TaskAction
    public void generate() {
        client.generate();
    }

    public void setPropertiesPath(String propertiesPath) {
        client.setPropertiesPath(propertiesPath);
    }

    public void setProjectPath(String projectPath) {
        client.setProjectPath(projectPath);
    }
}