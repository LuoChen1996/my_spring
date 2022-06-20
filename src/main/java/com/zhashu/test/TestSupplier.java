package com.zhashu.test;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description Spring使用外部拓展获取实例
 * @Author Luo Chen
 * @Date 2022/6/20 09:52
 */
public class TestSupplier {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(User.class);
        beanDefinition.setInstanceSupplier(TestSupplier::createUser);
        applicationContext.registerBeanDefinition(User.class.getSimpleName(), beanDefinition);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean(User.class).getName());
    }
    
    private static User createUser() {
        return User.builder().name("渣叔").build();
    }
    
    @Data
    @Builder
    static class User {
        private String name;
    }
    
}
