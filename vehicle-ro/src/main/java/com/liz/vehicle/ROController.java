package com.liz.vehicle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ROController {
    @PostMapping("/door")
    String openDoor(){
        System.out.println("Door is open!");
        return "Door is open!";
    }
}
