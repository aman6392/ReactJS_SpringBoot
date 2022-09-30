package com.spring.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Suburb {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id; 
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	public Suburb(long id, long postcode, String suburb) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public Suburb() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public long getPostcode() {
//		return postcode;
//	}
//
//	public void setPostcode(long postcode) {
//		this.postcode = postcode;
//	}
//
//	public String getSuburb() {
//		return suburb;
//	}
//
//	public void setSuburb(String suburb) {
//		this.suburb = suburb;
//	}
	
	@Override
	public String toString() {
		return "Suburb [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}
