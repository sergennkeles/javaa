package odev3;

public class Student extends User{

	private	String School;
	private String StudentNumber;
	

	
	public Student(int Id, String FirstName,String LastName,String school, String studentNumber) {
		super(Id,FirstName,LastName);
		School = school;
		StudentNumber = studentNumber;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
	public String getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		StudentNumber = studentNumber;
	}
}
