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
	
	@Column(name = "townhallName")
	private String townhallName;

	public int getTownhallId() {
		return townhallid;
	}

	public void setTownhallId(int townhallid) {
		this.townhallid = townhallid;
	}

	public String getTownhallName() {
		return townhallName;
	}

	public void setTownhallName(String townhallName) {
		this.townhallName = townhallName;
	}

	@Override
	public String toString() {
		return "TownHall [townhallId=" + townhallid + ", townhallName=" + townhallName + "]";
	}
	
	
}
