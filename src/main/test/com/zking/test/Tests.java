package com.zking.test;

import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Tests {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        RepositoryService repositoryService = (RepositoryService) applicationContext.getBean("repositoryService");
        System.out.println(repositoryService);

    }


    public static void main(String[] args) {
            List list = new ArrayList();
            list.add("aabbcc");
            list.add("aabbcc");
            list.add("ccbbaa");
            list.add("ccbbaa");
            list.add("fcd");
            list.add("knm");
            list.add("lpl");
            System.out.println(11);

            Predicate p =new  MyPro();

            Stream stream = list.stream();
            //stream.forEach(s-> System.out.println(s));
            stream.sorted(Comparator.reverseOrder());
            //list.stream().forEach(s-> System.out.println(s));
    }
    class Bxc extends Thread{

        @Override
        public void run() {
            System.out.println(11);
        }

    }
}
