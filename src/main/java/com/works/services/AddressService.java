package com.works.services;

import com.works.prototype.Address;
import com.works.utils.Action;
import com.works.utils.Util;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    public List<Address> getAddress() {

        long start = System.currentTimeMillis();
        Action action = new Action();

        Address ad1 = new Address();
        ad1.setNo(01);
        ad1.setCity(action.getCity());
        ad1.setStreet("Kadıköy");
        ad1.setZipcode("34730");

        Address ad2 = ad1.addressClone();
        ad2.setNo(02);

        System.out.println(ad1.hashCode());
        System.out.println(ad2.hashCode());
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Duration: " + duration + " ms");
        return List.of(ad1,ad2);
    }

}
