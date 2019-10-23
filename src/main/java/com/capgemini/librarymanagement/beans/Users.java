package com.capgemini.librarymanagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonPropertyOrder({"userId","name"})
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Users {
	@Id
	@Column(name="user_id")
	private String userId;
	@Column(name="user_name")	
	private String userName;
	@Column(name="email_id")
	private String emailId;
	@Column
	private String password;
	@Column
	private String type;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
