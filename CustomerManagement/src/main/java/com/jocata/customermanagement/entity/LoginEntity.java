package com.jocata.customermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tbl_login")
public class LoginEntity {

	@Id
	@Column(name="user_name")
	private String userName;
	
	@Column(name="pass_word")
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "LoginEntity [userName=" + userName + ", passWord=" + passWord + "]";
	}

	
}
