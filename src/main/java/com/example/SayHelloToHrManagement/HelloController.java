package com.example.SayHelloToHrManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/greet")
    public String sayHello(){
        return "hey lets build hr management system";
    }
}
