package com.zhashu.xmlBean.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory implements FactoryBean<Apple> {
    
    @Override
    public Apple getObject() {
        Apple apple = new Apple();
        apple.setColor("yellow");
        return apple;
    }

    @Override
    public Class<?> getObjectType() {
        return Apple.class;
    }
}
