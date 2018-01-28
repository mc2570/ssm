package com.zking.test;

import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        RepositoryService repositoryService = (RepositoryService) applicationContext.getBean("repositoryService");
        System.out.println(repositoryService);
    }



}
