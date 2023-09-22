package com.blog.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class TypeController {
	
	
	public String types() {
		
		
		return "types";
	}

}
