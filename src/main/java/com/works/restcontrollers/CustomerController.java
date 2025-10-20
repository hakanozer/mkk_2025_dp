package com.works.restcontrollers;

import com.works.services.Service1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    final Service1 service1;


}
