package com.works.adapter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service("fedex")
//@Order(1)
public class FedexApi implements ITrackingService {

    @Override
    public String track(String trackingNumber) {
        fedexKdv();
        return "Fedex Api Track: " + trackingNumber + "";
    }

    private void fedexKdv() {
        System.out.println( "Fedex Kdv" );
    }
}
