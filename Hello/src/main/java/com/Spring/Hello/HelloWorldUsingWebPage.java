package com.Spring.Hello;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldUsingWebPage {

    @GetMapping("/web")
    public String sayHello(Model model){
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello";
    }
}
