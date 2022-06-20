package com.zhashu.xmlBean.lazyBean;

import lombok.Data;

@Data
public class LazyBean {
    
    private String name;

    public LazyBean() {
        System.out.println("init lazy-bean...");
    }
}
