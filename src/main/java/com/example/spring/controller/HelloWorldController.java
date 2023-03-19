package com.example.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Welcome to Thymleaf");
        model.addAttribute("currentDate", new Date().toLocaleString());
        return "helloworld";
    }
    @GetMapping("/cssjsdemo")
    public String demoCssJs(Model model) {
        model.addAttribute("message", "DesignPage");
        return "add-css-js-demo";
    }
}