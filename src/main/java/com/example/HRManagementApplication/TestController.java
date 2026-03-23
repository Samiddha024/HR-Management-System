package com.example.HRManagementApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/greet")
    public String sayHello(){
        return "hey lets build hr management system";
    }


    @GetMapping("/viewAll")
    public String viewAll(){
        return "Our Application is under progress";
    }
}
