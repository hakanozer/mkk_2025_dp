package com.works.services;

import com.works.adapter.ITrackingService;
import com.works.utils.ETrack;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TrackingService {

    // final List<ITrackingService> trackingServices;
    final Map<String, ITrackingService> trackingServiceMap;

    public String track(String trackingNumber, ETrack type){
        return trackingServiceMap.get(type.label).track(trackingNumber);
    }

}
