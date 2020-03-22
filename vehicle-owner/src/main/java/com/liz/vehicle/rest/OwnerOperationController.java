package com.liz.vehicle.rest;

import com.liz.vehicle.remote.RoRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerOperationController {

    @Autowired
    RoRemote roRemote;
    @Value("${test:erro}")
    private String profile;
 //
    @GetMapping("/info")
    public  String getInfo() {
        return profile;
    }
    @PostMapping("/door")
    public  String openDoor() {
        System.out.println("trying to open door");
        return roRemote.openDoor();
    }
}
