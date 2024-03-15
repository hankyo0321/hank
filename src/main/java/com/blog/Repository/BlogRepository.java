package com.blog.Repository;

import org.springframework.stereotype.Repository;

import com.blog.pojo.Blog;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BlogRepository   extends JpaRepository<Blog, Long> {

}
