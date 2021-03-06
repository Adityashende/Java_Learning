package com.emp.login.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;

@Data
@Entity
@Table(name="EMP_AUTH_TBL")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String userName;
	private String password;
	private boolean active;
	private String roles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public User(int id, String userName, String password, boolean active, String roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", active=" + active
				+ ", roles=" + roles + "]";
	}
	
	

}
