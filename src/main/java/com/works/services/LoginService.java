package com.works.services;

import com.works.factory.Admin;
import com.works.factory.ILogin;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final ApplicationContext applicationContext;

    public boolean login(String email, String password, String type){
        ILogin iLogin = (ILogin) applicationContext.getBean(type);
        return iLogin.login(email,password);
    }
}
