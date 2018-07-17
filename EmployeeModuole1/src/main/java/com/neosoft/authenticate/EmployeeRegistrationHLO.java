package com.neosoft.authenticate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Registration")
public class EmployeeRegistrationHLO {
	@Id
	@GenericGenerator(name = "gen1", strategy = "increment")
	@GeneratedValue(generator="gen1")
	private int sno;
	
    private String username;
	
	private String password;
	
	private String email;
	public EmployeeRegistrationHLO() {
		
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
