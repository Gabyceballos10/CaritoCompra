package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/carrito")
    public String carrito(Model model) {
        model.addAttribute("message", "Welcome to our website!");
        return "index"; // Refers to index.html in templates folder
    }
}
