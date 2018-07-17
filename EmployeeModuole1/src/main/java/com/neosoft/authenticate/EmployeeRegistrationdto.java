package com.neosoft.authenticate;

public class EmployeeRegistrationdto {
	
	private int sno;
	private String username;
	
	private String password;
	private String repassword;
	private String email;
	
	public EmployeeRegistrationdto() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeRegistrationdto(int sno, String username, String password, String repassword, String email) {
	
		this.sno = sno;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
		this.email = email;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getSno() {
		return sno;
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
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
