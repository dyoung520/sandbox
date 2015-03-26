package com.dyoung.springapp;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
@Table(name="USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID", unique=true, nullable=false)
	private int userId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_ADDED", nullable=false)
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_PASSWORD_SET", nullable=false)
	private Date datePasswordSet;

	@Column(name="FIRST_NAME", nullable=false, length=45)
	private String firstName;

	@Column(name="LAST_NAME", nullable=false, length=45)
	private String lastName;

	@Column(nullable=false, length=45)
	private String password;

	@Column(nullable=false, length=45)
	private String username;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDatePasswordSet() {
		return this.datePasswordSet;
	}

	public void setDatePasswordSet(Date datePasswordSet) {
		this.datePasswordSet = datePasswordSet;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}