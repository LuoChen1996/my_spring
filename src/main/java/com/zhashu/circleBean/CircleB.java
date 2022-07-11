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
public class CircleB {

    @Autowired
    public CircleA circleA;

    public String title = "TITLE CIRCLEB";

    static {
        System.out.println("I am CircleB");
    }

    @Override
    public String toString() {
        return "CircleB{}";
    }
}
