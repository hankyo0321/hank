package com.blog.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BlogRequest {

	@JsonProperty("title")
	private String title;

	@JsonProperty("content")
	private String content;

	@JsonProperty("firstPicture")
	private String firstPicture;

	@JsonProperty("flag")
	private String flag;

	@JsonProperty("views")
	private Integer views;

	@JsonProperty("isAppreciation")
	private String isAppreciation;

	@JsonProperty("isShareStatment")
	private String isShareStatment;

	@JsonProperty("isCommentabled")
	private String isCommentabled;

	@JsonProperty("isPublished")
	private String isPublished;

	@JsonProperty("isRecomment")
	private String isRecomment;

	@JsonProperty("createdTime")
	private Date createdTime;

	@JsonProperty("updatedTime")
	private Date updatedTime;



}
