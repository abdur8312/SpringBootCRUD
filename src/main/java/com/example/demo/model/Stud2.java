package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud2")
public class Stud2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studid;
	private String studname;
	
	public Stud2(Integer studid, String studname) {
		super();
		this.studid = studid;
		this.studname = studname;
	}
	
	
	public Integer getStudid() {
		return studid;
	}
	public void setStudid(Integer studid) {
		this.studid = studid;
	}
	
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	
	@Override
	public String toString() {
		return "Stud2 [studid="  + ", studname=" + studname + "]";
	}
	
}
