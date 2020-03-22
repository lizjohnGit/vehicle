package com.liz.vehicle.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "vehicle-ro", fallback = RoRemoteHystrix.class)
public interface RoRemote {

    @PostMapping("/door")
    String openDoor();
}
