package com.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        model.addAttribute("success", "登入成功ogin"); // （變數名稱，變數值)
        return "redirect:/admin/blogs";
    }
    
    @GetMapping("/bloginput")
    public String bloginput(Model model) {
        model.addAttribute("hello", "Hello World!!!"); // （變數名稱，變數值)
        return "admin/blogs-input";
    }
    
    @GetMapping("/hello")
    public String Hello(Model model) {
        model.addAttribute("hello", "Hello World!!!"); // （變數名稱，變數值)
        return "hello";
    }
    
    @GetMapping("/login")
    public String login(Model model) {
    	return "admin/loginrain";
    }
    
}
