package com.capgemini.librarymanagement.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonPropertyOrder({"restrationId"})
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BooksRegistration {
	@Id
	@Column(name="registration_id")
	private String registrationId;
	@Column(name="book_id")
	private String bookId;
	@Column(name="user_id")
	private String userid;
	@Column(name="registration_date")
	private Date registrationDate;

	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
