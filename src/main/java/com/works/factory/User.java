package com.works.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("user")
public class User implements ILogin{

    @Override
    public boolean login(String email, String password) {
        System.out.println("User Login");
        return false;
    }

    @Override
    public boolean register(String email, String password) {
        System.out.println("User Register");
        return false;
    }

    @Override
    public boolean forgotPassword(String email) {
        System.out.println("User Forgot Password");
        return false;
    }

}
