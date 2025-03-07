package com.example.openclass;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.openclass.service.BusinessService;

@SpringBootTest
class OpenclassApplicationTests {

	@Autowired
    private BusinessService bs;

    @Test
    void contextLoads() {
    }

    @Test
    public void testGetHelloWorld() {

        String expected = "Hello World!";

        String result = bs.getHelloWolrd().toString();

        assertEquals(expected, result);
    }

}
