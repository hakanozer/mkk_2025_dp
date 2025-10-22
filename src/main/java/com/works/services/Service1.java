package com.works.services;

import com.works.models.Customer;
import com.works.utils.Action;
import com.works.utils.Util;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Service1 {

    int a = 10;
    Action  a1 = new Action();
    public Service1() {
        a1.hashCode();
    }

    public void call1() {
        System.out.println("Service1 :" + a);
    }

    public void call2() {
        this.a = 25;
        System.out.println("Service2 :" + a);
    }

    public void call3() {
        int sum = a + a;
        System.out.println("Service3 :" + sum);
        System.gc();

        Customer customer = new Customer();
        customer.setEmail("a@mail.com");
        customer.setPassword("12345");

        Customer customer1 = customer;
        customer1.setEmail("b@mail.com");
    }

}
