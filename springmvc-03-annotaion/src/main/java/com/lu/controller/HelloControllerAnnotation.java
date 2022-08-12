package com.lu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerAnnotation {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","helloannotation");
        return "hello";
    }
}
