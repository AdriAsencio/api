package com.adrianaasenciofullstrack.app.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{
	
	
	private static final long serialVersionUID = 3817750875136419234L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id; 
	
	@Column(name="nombre",length = 50)
	private String name;
	
	@Column(name="contrasena", nullable=false, length = 50)
	private String pass;
	
	@Column(name="mail", nullable=false, length = 50, unique = true)
	private String email;
	
	@Column(name="estado",length = 50)
	private Boolean enabled;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
