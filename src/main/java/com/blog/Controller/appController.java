package com.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class appController {
	
    @GetMapping("/index")
    public String hello(Model model) {
        model.addAttribute("hello", "Hello World!!!"); // （變數名稱，變數值)
        return "index";
    }
    
    
    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("hello", "Hello World!!!"); // （變數名稱，變數值)
        return "blog";
    }
    
    @GetMapping("/hello")
    public String Hello(Model model) {
        model.addAttribute("hello", "Hello World!!!"); // （變數名稱，變數值)
        return "hello";
    }
    
}