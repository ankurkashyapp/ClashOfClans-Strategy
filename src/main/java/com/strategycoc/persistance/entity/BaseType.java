package com.strategycoc.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="basetype")
public class BaseType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="typeid")
	private int typeId;
	
	@Column(name="typename")
	private int typeName;

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getTypeName() {
		return typeName;
	}

	public void setTypeName(int typeName) {
		this.typeName = typeName;
	}
}
