package com.example.openclass.service;


import org.springframework.stereotype.Component;

import com.example.openclass.model.HelloWolrd;

@Component
public class BusinessService {
    
    public HelloWolrd getHelloWolrd(){
        HelloWolrd helloWolrd = new HelloWolrd();
        return helloWolrd;
    }
}
