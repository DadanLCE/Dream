package com.attend.dream;


import com.prac.bean.person;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DreamApplicationTests {

    @Autowired(required = false)
    person persons;

    @Test
    public void contextLoads() {
        System.out.println(persons);
    }

}
