package com.works.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("customer")
public class Customer  implements ILogin{

    @Override
    public boolean login(String email, String password) {
        System.out.println("Customer Login");
        return false;
    }

    @Override
    public boolean register(String email, String password) {
        System.out.println("Customer Register");
        return false;
    }

    @Override
    public boolean forgotPassword(String email) {
        System.out.println("Customer Forgot Password");
        return false;
    }

}
