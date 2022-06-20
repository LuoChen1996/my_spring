package com.zhashu.test;

import com.zhashu.service.UserService;
import com.zhashu.xmlBean.autowireBean.VideoOrder;
import com.zhashu.xmlBean.factoryBean.Apple;
import com.zhashu.xmlBean.initDestoryBean.InitDestoryBean;
import com.zhashu.xmlBean.lazyBean.LazyBean;
import com.zhashu.xmlBean.mergeBean.Son;
import com.zhashu.xmlBean.ordinaryBean.Person;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    
    @org.junit.Test
    public void test1() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        
        Son son = (Son) applicationContext.getBean("son");
        System.out.println(son);

        VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");
        System.out.println(videoOrder);

        System.out.println("lazyBean即将开始实例化...");
        LazyBean lazyBean = (LazyBean) applicationContext.getBean("lazy");
        System.out.println(lazyBean);
        
        Apple staticApple = (Apple) applicationContext.getBean("staticApple");
        System.out.println(staticApple);
        
        Apple instanceApple = (Apple) applicationContext.getBean("instanceApple");
        System.out.println(instanceApple);
        
        Apple myApple = (Apple) applicationContext.getBean("myApple");
        System.out.println(myApple);
        
        InitDestoryBean initDestoryBean = (InitDestoryBean) applicationContext.getBean("initDestoryBean");
        applicationContext.getBeanFactory().destroyBean("initDestoryBean", initDestoryBean);
        
    }
    
    @org.junit.Test
    public void test2() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(Son.class);
        beanDefinition.getPropertyValues().add("name", "渣叔");
        
        applicationContext.registerBeanDefinition("bean1", beanDefinition);
        
    }
    
    @org.junit.Test
    public void test3() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }
    
    @org.junit.Test
    public void test4() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.zhashu");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        userService.test();
    }
    
}
