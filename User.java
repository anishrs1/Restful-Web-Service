package com.example.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {

	private Integer id;
	private String name;
	private Date birthDate;
	
	protected User() {
		
	}
	
	public User(Integer id, String name, Date birthdate)
	{
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;		
	}
		
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
		

}

	
