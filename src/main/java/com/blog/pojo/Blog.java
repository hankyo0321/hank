package com.blog.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Blog {
	
	
	private Long id;
	
	/*
	 * 標題
	 */
	private String title;
	/*
	 * 文章內容
	 */
	private String content;
	/**
	 * 首圖
	 */
	private String firstPicture;
	/**
	 * 標記
	 */
	private String flag;
	/*
	 * 瀏覽次數
	 */
	private Integer views;
	/**
	 * 是否按讚
	 */
	private boolean isAppreciation;
	
	/*
	 * 是否分享
	 */
	private boolean isShareStatement;
	
	/**
	 * 是否留言
	 */
	private boolean isCommentabled;
	
	/*
	 * 是否發布
	 */
	private boolean isPublished;
	
	/*
	 * 是否推薦
	 */
	private boolean isRecomment;
	
	/**
	 * 創建時間
	 */
	private Date creatTime;
	
	/**
	 * 更新時間
	 */
	private Date updateTime;
	
	public Blog() {}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", content=" + content + ", firstPicture=" + firstPicture
				+ ", flag=" + flag + ", views=" + views + ", isAppreciation=" + isAppreciation + ", isShareStatement="
				+ isShareStatement + ", isCommentabled=" + isCommentabled + ", isPublished=" + isPublished
				+ ", isRecomment=" + isRecomment + ", creatTime=" + creatTime + ", updateTime=" + updateTime + "]";
	}
	
	
	
}
