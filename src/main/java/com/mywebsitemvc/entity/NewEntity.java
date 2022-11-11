package com.mywebsitemvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="new")
public class NewEntity extends AbstractEntity {

	
	
	@Column
	private String title;
	
	@Column(columnDefinition="TEXT")
	private String content;
	
	@Column(name = "shortdescription",columnDefinition="TEXT")
	private String shortDescription;
	
	@Column
	private String thumbnail;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	
	
}
