package com.akion.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/menu")
    public String menu(Model model) {
        return "menu";
    }
	@GetMapping("/index")
    public String index(Model model) {
        return "index";
    }
	
}
