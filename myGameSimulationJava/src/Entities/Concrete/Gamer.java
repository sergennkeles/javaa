package Entities.Concrete;

import java.sql.Date;

import Entities.Abstract.Entity;

public class Gamer implements Entity {

	private int id;
	private String nationalityId;
	private String firstName;
	private String lastName;
	private Date birthYear;
	
	public Gamer()
	{
		
	}
	public Gamer(int id, String nationalityId, String firstName, String lastName, Date birthYear) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}



}
