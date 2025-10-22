package com.works.restcontrollers;

import com.works.services.TrackingService;
import com.works.utils.ETrack;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrackingRestController {

    private final TrackingService trackingService;

    @GetMapping("track")
    public String track(@RequestParam String trackingNumber, @RequestParam ETrack type){
        return trackingService.track(trackingNumber,type);
    }
}
