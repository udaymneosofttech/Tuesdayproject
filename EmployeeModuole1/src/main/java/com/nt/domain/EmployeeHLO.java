package com.nt.domain;



public class EmployeeHLO {
	
	private String fname;
	private String lname;
	private String useranme;
	private String pwd;
	private String Rpwd;
	private String mobilenumber;
	private String dob;
	private String email;
	private String gender;
	private String address;
	private String state;
	private String  country;
	public EmployeeHLO(String fname, String lname, String useranme, String pwd, String rpwd, String mobilenumber,
			String dob, String email, String gender, String address, String state, String country) {
		
		this.fname = fname;
		this.lname = lname;
		this.useranme = useranme;
		this.pwd = pwd;
		Rpwd = rpwd;
		this.mobilenumber = mobilenumber;
		this.dob = dob;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.state = state;
		this.country = country;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUseranme() {
		return useranme;
	}
	public void setUseranme(String useranme) {
		this.useranme = useranme;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRpwd() {
		return Rpwd;
	}
	public void setRpwd(String rpwd) {
		Rpwd = rpwd;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "EmployeeModel [fname=" + fname + ", lname=" + lname + ", useranme=" + useranme + ", pwd=" + pwd
				+ ", Rpwd=" + Rpwd + ", mobilenumber=" + mobilenumber + ", dob=" + dob + ", email=" + email
				+ ", gender=" + gender + ", address=" + address + ", state=" + state + ", country=" + country + "]";
	}
	
	
	

}
