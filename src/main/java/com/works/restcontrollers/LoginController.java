package com.works.restcontrollers;

import com.works.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    final LoginService loginService;

    @GetMapping("login")
    public void login( @RequestParam String type){
        loginService.login("admin","admin",type);
    }
}
