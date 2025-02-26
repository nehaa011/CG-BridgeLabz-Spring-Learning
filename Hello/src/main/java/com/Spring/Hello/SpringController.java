package com.Spring.Hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpringController {

    //UC1:
    @GetMapping
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
