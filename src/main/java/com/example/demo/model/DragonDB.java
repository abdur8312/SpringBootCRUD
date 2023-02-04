package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dragon")
public class DragonDB {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dragonid;
	private String dragname;
	
	public DragonDB(Integer dragonid, String dragname) {
		this.dragonid = dragonid;
		this.dragname = dragname;
	}
	
	public DragonDB() {
		
	}
	
	public Integer getDragonid() {
		return dragonid;
	}

	public void setDragonid(Integer dragonid) {
		this.dragonid = dragonid;
	}

	public String getDragname() {
		return dragname;
	}

	public void setDragname(String dragname) {
		this.dragname = dragname;
	}
}
