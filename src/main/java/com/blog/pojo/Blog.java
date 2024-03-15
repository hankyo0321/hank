package com.blog.pojo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Blog")
public class Blog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	/*
	 * 標題
	 */
	@Column(name = "TITLE")
	private String title;
	/*
	 * 文章內容
	 */
	@Column(name = "CONTENT")
	private String content;
	/**
	 * 首圖
	 */
	@Column(name = "FIRST_PICTURE")
	private String firstPicture;
	/**
	 * 標記
	 */
	@Column(name = "FLAG")
	private String flag;
	/*
	 * 瀏覽次數
	 */
	@Column(name = "VIEWS")
	private Integer views;
	/**
	 * 是否按讚
	 */
	@Column(name = "IS_APPRECIATION")
	private String isAppreciation;
	
	/*
	 * 是否分享
	 */
	@Column(name = "IS_SHARESTATMENT")
	private String isShareStatment;
	
	/**
	 * 是否留言
	 */
	@Column(name = "IS_COMMENTABLED")
	private String isCommentabled;
	
	/*
	 * 是否發布
	 */
	@Column(name = "IS_PUBLISHED")
	private String isPublished;
	
	/*
	 * 是否推薦
	 */
	@Column(name = "IS_RECOMMENT")
	private String isRecomment;
	
	/**
	 * 創建時間
	 */
	@Column(name = "CREATED_TIME")
	private Date createdTime;
	
	/**
	 * 更新時間
	 */
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;
	
	public Blog() {}

	
	
	
}
