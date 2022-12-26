import java.util.Locale;
import java.util.Scanner;


public class exercicio_4_calculate_salary {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);	
		
	int registration;
	double hours, valuehour;
	
	System.out.println("What's your registration number?");
	registration = sc.nextInt();
	System.out.println("How many hours did you work?");
	hours = sc.nextDouble();
	System.out.println("How much do you earn per hour?");
	valuehour = sc.nextDouble();
	
	double salary = (hours * valuehour);
	
	System.out.println();
	System.out.println("Registration: " + registration);
	System.out.printf("Total Salary: U$ %.2f %n", salary);
	 
	sc.close();
	}
}
