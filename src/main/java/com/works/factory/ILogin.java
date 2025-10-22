package com.works.factory;

public interface ILogin {

    boolean login(String email, String password);
    boolean register(String email, String password);
    boolean forgotPassword(String email);

}
