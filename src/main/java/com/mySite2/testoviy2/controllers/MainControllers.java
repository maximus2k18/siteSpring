package com.mySite2.testoviy2.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainControllers {
    @GetMapping("/")
    public String controler(Model model){

        return "blog-main";
    }
}
