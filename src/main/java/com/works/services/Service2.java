package com.works.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Service2 {

    int b = 20;
    public void call2() {
        System.out.println("Service2 : " + b);
    }

    public void call3(Random r) {
        int a = 100;
        System.out.println("Service2 : " + b);
    }
}
