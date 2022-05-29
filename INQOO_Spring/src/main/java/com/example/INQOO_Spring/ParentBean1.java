package com.example.INQOO_Spring;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class ParentBean1 {
    ChildBean childBean;

    public ParentBean1 (ChildBean childBean){
        this.childBean =childBean;
    }
}
