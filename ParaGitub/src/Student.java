import java.util.Scanner;

public class Student {
	public Scanner input = new Scanner(System.in);
public String name = "";
/**
 * @param name
 * @param lastName
 * @param studentNumber
 */
public Student(String name, String lastName, int studentNumber) {
	super();
	this.name = name;
	this.lastName = lastName;
	this.studentNumber = studentNumber;
}



public Student() {
	super();
	this.name = name;
	this.lastName = lastName;
	this.studentNumber = studentNumber;
}
public String lastName="";
public int studentNumber= 0;
public String getName() {
	return name;
}

public String  fijarName() {
	String name;
	System.out.println("entra nombre del estudiante :");
	name = input.nextLine();
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

}
