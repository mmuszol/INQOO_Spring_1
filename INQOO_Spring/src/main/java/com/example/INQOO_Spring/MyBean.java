package com.example.INQOO_Spring;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Component
@Service
public class MyBean implements  BeanListInterface{
        @Bean
        public MyBean getCollectionsBean() {
            return new MyBean();
        }

        @Bean
        public List<Integer> BeanList() {
            return Arrays.asList(1,3,4);
        }

    @Override
    public void add(Integer number) {

    }
}