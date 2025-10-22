package com.works.adapter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service("aras")
//@Order(0)
public class ArasApi implements ITrackingService {

    @Override
    public String track(String trackingNumber) {
        return "Aras Api Track: " + trackingNumber;
    }

}
