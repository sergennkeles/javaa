package odev3;

public class StudentManager extends UserManager {


	public void Add(User student)
	{
		System.out.println(student.getFirstName()+" adl� ��renci eklendi");
		super.Add(student);
	}
}
