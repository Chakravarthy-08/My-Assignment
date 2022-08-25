package Week3.day1;

public class Students {
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student name is " + name + "and id is "+ id);
	}
	
	public void getStudentInfo(int id) {
		System.out.println("Student id is"+ id);
	}
	
	public void getStudentInfo(long phonenumber, String email) {
		System.out.println("Student phonenumber is" + phonenumber + "and email is"+ email);
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(989898);
		stud.getStudentInfo(989898, "Chakravarthy");
		stud.getStudentInfo(987654321, "gchakravarthy08@gmail.com");
	}
	
	


}
