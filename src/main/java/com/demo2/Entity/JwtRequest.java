package com.demo2.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JwtRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	private String username;
	private String password;
	public JwtRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwtRequest(Long userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
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
	@Override
	public String toString() {
		return "JwtRequest [userid=" + userid + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
