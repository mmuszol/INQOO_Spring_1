package com.example.INQOO_Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class ChildBean {

    @PostConstruct
    public void postConstruct(){
        System.out.println("child been crated");
    }

}
