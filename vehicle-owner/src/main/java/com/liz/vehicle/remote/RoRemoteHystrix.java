package com.liz.vehicle.remote;

import org.springframework.stereotype.Component;

@Component
public class RoRemoteHystrix implements RoRemote {

    @Override
    public String openDoor() {
        return "can't open, go to Hystrix";
    }
}
