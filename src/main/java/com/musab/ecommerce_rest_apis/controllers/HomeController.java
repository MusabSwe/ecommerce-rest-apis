package com.musab.ecommerce_rest_apis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Server-side-rendering
    // the return the HTML page
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", " Musab");
        return "index";
    }
}
