package com.nit.Bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean implements Serializable {

	private String userName;
	private String password;
	private String address;
	private String mailId;
	private String phNo;
	private String state;
	private String country;

	public UserBean() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
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
		return "UserBean [userName=" + userName + ", password=" + password + ", address=" + address + ", mailId="
				+ mailId + ", phNo=" + phNo + ", state=" + state + ", country=" + country + "]";
	}

}
