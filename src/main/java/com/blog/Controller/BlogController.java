package com.blog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.Service.BlogService;
import com.blog.bean.BlogRequest;

@RestController
@RequestMapping(path = "/api/blog", produces = MediaType.APPLICATION_JSON_VALUE)
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	@PostMapping("/saveBlog")
	public ResponseEntity<String> saveBlog(@RequestBody BlogRequest req){
		blogService.saveBlog(req);
		return ResponseEntity.ok("儲存成功");
	}
	

}
