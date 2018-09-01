import java.util.Scanner;

public class Professor {
	public String name = "";
	public String lastName="";
	public int studentNumber= 0;
	public String CourseName = "";
	public double salary = 0;
	public Scanner input = new Scanner(System.in);
	
	
	public String  fijarName() {
		String name;
		System.out.println("entra nombre del Profesor es  :");
		name = input.nextLine();
		return name;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
}
