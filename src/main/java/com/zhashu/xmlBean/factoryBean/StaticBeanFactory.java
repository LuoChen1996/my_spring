package com.zhashu.xmlBean.factoryBean;

/**
 * @Description 静态工厂
 * @Author Luo Chen
 * @Date 2022/6/14 15:20
 */
public class StaticBeanFactory {
    
    static Apple createApple() {
        Apple apple = new Apple();
        apple.setColor("red");
        return apple;
    }
    
}
