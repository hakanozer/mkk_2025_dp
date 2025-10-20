package com.works.restcontrollers;

import com.works.services.Service1;
import com.works.utils.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserRestController {

    final Service1 service1;


    @GetMapping("call")
    public void call() {

        Runnable rn = () -> {
            Util util = Util.getInstance();
            System.out.println(util.hashCode());
        };
        try {
            Thread.sleep(2000);
            new Thread(rn).start();
        }catch (Exception e){}


        Runnable rn2 = () -> {
            Util util = Util.getInstance();
            System.out.println(util.hashCode());
        };
        try {
            Thread.sleep(5000);
            new Thread(rn2).start();
        }catch (Exception e){}

        service1.call1();
    }

    @GetMapping("call2")
    public void call2() {
        service1.call2();
    }

}
