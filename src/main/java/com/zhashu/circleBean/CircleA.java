package com.zhashu.circleBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CircleA {

    @Autowired
    public CircleB circleB;

    public String title = "TITLE CIRCLEA";

    static {
        System.out.println("I am CircleA");
    }

    @Override
    public String toString() {
        return "CircleA{}";
    }
}
