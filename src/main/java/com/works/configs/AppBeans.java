package com.works.configs;

import com.works.utils.Action;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppBeans {

    //@Bean
    public Action bean1(){
        return new Action();
    }

    //@Bean
    public String sessionId(HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        return sessionId;
    }


}
