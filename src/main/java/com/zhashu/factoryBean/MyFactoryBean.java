package com.zhashu.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new CutomerBean();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBean.class;
    }
}
