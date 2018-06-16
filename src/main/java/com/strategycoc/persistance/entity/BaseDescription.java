package com.strategycoc.persistance.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="basedescription")
public class BaseDescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="townhallid")
	private int townHallId;
	
	@Column(name="typeid")
	private int typeId;
	
	@Column(name="url")
	private String url;
	
	@Column(name="description")
	private String description;
	
	@Column(name="favouritecount")
	private int favouriteCount;
	
	@Column(name="istrending")
	private Boolean isTrending;
	
	@Column(name="createddate")
	private Date createdDate;
	
	@Column(name="updateddate")
	private Date updatedDate;

	public int getId() {
		return id;
	}

	public int getTownHallId() {
		return townHallId;
	}

	public int getTypeId() {
		return typeId;
	}

	public String getUrl() {
		return url;
	}

	public String getDescription() {
		return description;
	}

	public int getFavouriteCount() {
		return favouriteCount;
	}

	public Boolean getIsTrending() {
		return isTrending;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTownHallId(int townHallId) {
		this.townHallId = townHallId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFavouriteCount(int favouriteCount) {
		this.favouriteCount = favouriteCount;
	}

	public void setIsTrending(Boolean isTrending) {
		this.isTrending = isTrending;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}

