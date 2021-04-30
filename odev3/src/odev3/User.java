package odev3;

public class User {


	public User()
	{
		super();
	}
	
	public User(int id, String firstName, String lastName) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
	}

private	int Id;
private	String FirstName;
private	String LastName;


public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
	
}
