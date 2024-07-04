package com.saurabh.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Controller Invoked...");
        model.addAttribute("name", "Saurabh Mishra");
        model.addAttribute("githubLink", "https://github.com/samdevlops");
        return "home";
    }
}
