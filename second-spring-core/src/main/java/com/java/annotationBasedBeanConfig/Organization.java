package com.java.annotationBasedBeanConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("componentScan")
@Component
public class Organization {
    private String name;

    public Organization() {
        this.name =" Yogi Vemana University";
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                '}';
    }
}
