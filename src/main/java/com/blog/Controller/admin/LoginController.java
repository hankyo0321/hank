package com.blog.Controller.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.blog.Service.UserService;
import com.blog.pojo.User;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/admin")
public class LoginController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String loginPage() {
		
		return "admin/loginrain";
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password ,HttpSession session ,RedirectAttributes attribute) {
		try {
			User user = userService.checkuser(username, password);
			if(user!=null) {
				user.setPassword(null);
				session.setAttribute("user", user);
			}else {
				attribute.addFlashAttribute("message", "帳號或密碼錯誤");
				return "redirect :admin/login";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "admin/index";
	}

}
