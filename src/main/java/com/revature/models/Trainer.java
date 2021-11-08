package com.revature.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Trainer {
	@Id
	@SequenceGenerator(name = "trainer_seq", sequenceName = "trainer_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trainer_seq")
	private int tId;
	private String name;
//	@JsonIgnore
//	//@OneToMany(mappedBy = "trainer")
//	private List<Pokemon> party;
	public Trainer(int tId, String name) {
		super();
		this.tId = tId;
		this.name = name;
		
	}
	public Trainer(String name) {
		super();
		this.name = name;
		
	}
	public Trainer() {
		super();
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Trainer [tId=" + tId + ", name=" + name + "]";
	}
	
	
}
