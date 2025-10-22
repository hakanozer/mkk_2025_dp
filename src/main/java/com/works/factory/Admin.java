package com.works.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("admin")
public class Admin implements ILogin {
    @Override
    public boolean login(String email, String password) {
        System.out.println("Admin Login");
        return false;
    }

    @Override
    public boolean register(String email, String password) {
        System.out.println("Admin Register");
        return false;
    }

    @Override
    public boolean forgotPassword(String email) {
        System.out.println("Admin Forgot Password");
        return false;
    }
}
