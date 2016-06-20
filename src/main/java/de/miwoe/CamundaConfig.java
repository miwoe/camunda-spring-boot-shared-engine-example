package de.miwoe;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.ProcessEngineService;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.engine.*;
import org.camunda.bpm.engine.spring.application.SpringServletProcessApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Grauschleier on 20.06.2016.
 */
@Configuration
public class CamundaConfig {

    @Bean
    ProcessEngineService processEngineService() {
        return BpmPlatform.getProcessEngineService();
    }

    @Bean
    ProcessEngine processEngine() {
        return processEngineService().getDefaultProcessEngine();
    }

    @Bean
    RepositoryService repositoryService() {
        return processEngine().getRepositoryService();
    }
    @Bean
    RuntimeService runtimeService() {
        return processEngine().getRuntimeService();
    }
    @Bean
    TaskService taskService() {
        return processEngine().getTaskService();
    }
    @Bean
    HistoryService historyService() {
        return processEngine().getHistoryService();
    }
    @Bean
    ManagementService managementService() {
        return processEngine().getManagementService();
    }

    @Bean
    SpringServletProcessApplication processApplication() {
        return new SpringServletProcessApplication();
    }
//    !-- bind the process engine service as Spring Bean -->
//    <bean name="processEngineService" class="org.camunda.bpm.BpmPlatform" factory-method="getProcessEngineService" />
//
//    <!-- bind the default process engine as Spring Bean -->
//    <bean name="processEngine" factory-bean="processEngineService" factory-method="getDefaultProcessEngine" />
//
//    <bean id="repositoryService" factory-bean="processEngine" factory-method="getRepositoryService"/>
//    <bean id="runtimeService" factory-bean="processEngine" factory-method="getRuntimeService"/>
//    <bean id="taskService" factory-bean="processEngine" factory-method="getTaskService"/>
//    <bean id="historyService" factory-bean="processEngine" factory-method="getHistoryService"/>
//    <bean id="managementService" factory-bean="processEngine" factory-method="getManagementService"/>
//
//    <!-- bootstrap the process application -->
//    <bean id="processApplication" class="org.camunda.bpm.engine.spring.application.SpringServletProcessApplication" />

}
