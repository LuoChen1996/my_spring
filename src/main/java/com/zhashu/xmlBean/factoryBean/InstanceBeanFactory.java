package com.zhashu.xmlBean.factoryBean;

/**
 * @Description 实例工厂
 * @Author Luo Chen
 * @Date 2022/6/14 15:24
 */
public class InstanceBeanFactory {
    
    private String color;

    public InstanceBeanFactory(String color) {
        this.color = color;
    }

    public Apple createApple() {
        Apple apple = new Apple();
        apple.setColor(color);
        return apple;
    }
    
}
