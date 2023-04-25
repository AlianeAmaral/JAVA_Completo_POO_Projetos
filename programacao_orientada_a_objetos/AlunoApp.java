package avaliacao_aluno;
import java.util.Locale;
import java.util.Scanner;

public class AlunoApp {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	Aluno aluno = new Aluno();
	
	System.out.print("Name: ");
	aluno.name = sc.nextLine();
	
	System.out.print("Insert 1: ");
	aluno.grade1 = sc.nextDouble();
	System.out.print("Insert 2: ");
	aluno.grade2 = sc.nextDouble();
	System.out.print("Insert 3: ");
	aluno.grade3 = sc.nextDouble();
	
	System.out.println();
	System.out.printf("FINAL GRADE: %.2f", aluno.finalGrade());

	System.out.println();
	if (aluno.finalGrade() < 60) {
		System.out.println("FAILED!");
		System.out.printf("MISSING %.2f POINTS.%n", aluno.missingPoints());
	}
	else {
		System.out.println("PASS!");
	}
	
	sc.close();
	}
}
