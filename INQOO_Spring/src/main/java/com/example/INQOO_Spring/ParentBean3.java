package com.example.INQOO_Spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ParentBean3 {
    ChildBean childBean;

    public ParentBean3 (ChildBean childBean) {
        this.childBean = childBean;
    }
}
