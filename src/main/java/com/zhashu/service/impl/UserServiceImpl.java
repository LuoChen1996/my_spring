package com.zhashu.service.impl;

import com.zhashu.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, InitializingBean {
    
    @Override
    public void test() {
        System.out.println("test");    
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserServiceImpl.afterPropertiesSet()");
    }
}
