package com.example.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/echo")
    public String echo(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return " Hello Mr " + name;
    }
    
}
