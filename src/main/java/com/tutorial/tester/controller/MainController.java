package com.tutorial.tester.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(path = "/")
    public String main() {
        return "This is Tester Controller";
    }
}
