package com.strategycoc.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "townhalls")
public class TownHall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="townhallid")
	private int townhallid;
	
	@Column(name = "townhallname")
	private String townhallname;

	public int getTownhallId() {
		return townhallid;
	}

	public void setTownhallId(int townhallid) {
		this.townhallid = townhallid;
	}

	public String getTownhallName() {
		return townhallname;
	}

	public void setTownhallName(String townhallName) {
		this.townhallname = townhallName;
	}

	@Override
	public String toString() {
		return "TownHall [townhallId=" + townhallid + ", townhallName=" + townhallname + "]";
	}
	
	
}
