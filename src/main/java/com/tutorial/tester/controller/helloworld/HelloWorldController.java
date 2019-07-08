package com.tutorial.tester.controller.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello-world")
public class HelloWorldController {
    @GetMapping(path = "/get")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping(path = "/get/{name}")
    public String helloName(@PathVariable(name = "name") String name){
        return "Hello "+name+" !!!!";
    }
}
