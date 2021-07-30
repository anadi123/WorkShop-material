package com.mphasis.springboot.entpapp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @RequestMapping("/hello")
    public String greet(){
        return "Welcome";
    }
}
