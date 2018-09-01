import java.util.Scanner;



public class Launch {
public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	
		int choice=0 ;
		char answer ;
		
		do {
			System.out.println("please select one of the options :");
			
			System.out.println("1 for create a student :");
			System.out.println("2 for create a professor :");
			System.out.println("3 for exit te program :");
			
			choice = input.nextInt();
			
			
		
	} while (choice !=1 && choice !=2 && choice !=3);
switch (choice) {
case 1:
	Student st = new Student();

String nombre=	st.fijarName();
System.out.println("has creado a : " + nombre);

	
	
	break;
case 2:
	
	Professor pf = new Professor();
	String nombr=	pf.fijarName();
	System.out.println("el nuevo profe se llama : " + nombr
			);
	
	break;
case 3:
	
	System.out.println("Thanks for using our testing program!" );
	System.out.println("Merci pour avoir utiliser notre programme de test!" );
	System.out.println("gracias por utilizar nuestro programa de prueba!" );
	
	break;

default:
	break;
}











	}

}
