package com.example.INQOO_Spring;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BeanListInterface {
 void add (Integer number);

 default List<Integer> getAll() {
     return null;
 }


}
