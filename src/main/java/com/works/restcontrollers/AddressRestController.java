package com.works.restcontrollers;

import com.works.bidge.NotificationService;
import com.works.composite.FileSystemComponent;
import com.works.prototype.Address;
import com.works.services.AddressService;
import com.works.services.FileSystemService;
import com.works.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AddressRestController {

    final AddressService addressService;
    final NotificationService notificationService;
    final FileSystemService fileSystemService;

    @GetMapping("prototype")
    public List<Address> login(){
       return addressService.getAddress();
    }

    @GetMapping("bridge")
    public void bridge(){
        notificationService.send("mnew Message", "push");
    }

    @GetMapping("composite")
    public long composite(){
        return fileSystemService.getAllSize();
    }
}
