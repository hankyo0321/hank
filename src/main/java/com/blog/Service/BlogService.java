package com.blog.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.blog.Repository.BlogRepository;
import com.blog.bean.BlogRequest;
import com.blog.pojo.Blog;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class BlogService  {
	
	@Autowired
	private BlogRepository blogRepository;
	
	public void saveBlog(BlogRequest blogreq) {
		
		Blog blog = new Blog();
		BeanUtils.copyProperties(blogreq, blog);
		
		blogRepository.save(blog);
	}

}
