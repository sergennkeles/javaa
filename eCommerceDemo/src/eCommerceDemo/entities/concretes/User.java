package eCommerceDemo.entities.concretes;

import eCommerceDemo.entities.abstracts.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String passWord;
	private boolean isVerify;
	
	
	public User()
	{
		
	}
	 public User(String mail,String password){
	        this.email = mail;
	        this.passWord = password;
	    }

	public User(int id,String firstName, String lastName, String email, String passWord) {
		super();
		this.id = id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email = email;
		this.passWord = passWord;
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public boolean isVerify() {
		return isVerify;
	}
	
	public void setVerify(boolean isVerify) {
		this.isVerify = isVerify;
	}
	
}
