package com.example.INQOO_Spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ParentBean2 {
    ChildBean childBean;

    public ParentBean2 (ChildBean childBean) {
        this.childBean = childBean;
    }
}
