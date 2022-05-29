package com.example.INQOO_Spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Component
@Service
@Profile("Dev")
public class MyBean2 implements BeanListInterface{
    @Bean
    public MyBean2 getCollectionsBean() {
        return new MyBean2();
    }

    @Bean
    public List<Integer> BeanList() {
        return Arrays.asList(1,3,4);
    }

    @Override
    public void add(Integer number) {

    }
}