package odev3;

public class Main {

	public static void main(String[] args) {

		User user=new User();
		user.setId(1);;
		user.setFirstName("Sergen");
		user.setLastName("Keleþ");;
		
		Instructor instructor=new Instructor();
		instructor.setId(2);;
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setCertificate("MCT,PMP,ITL");;
		
		Student student=new Student(3,"Simge Yaþa","Keleþ","Atatürk Ortaokulu","12345");

		
		UserManager userManager=new UserManager();
		userManager.Add(user);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.Add(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.Add(student);
		
		
	}

}
