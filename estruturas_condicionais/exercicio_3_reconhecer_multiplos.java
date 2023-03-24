import java.util.Scanner; 

public class exercicio_3_reconhecer_multiplos { 

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int A, B;
	
	System.out.println("Digite um número: ");
	A = sc.nextInt();
	
	System.out.println("Digite outro número: ");
	B = sc.nextInt();
	
	if (A % B == 0 || B % A == 0) {
		System.out.println("Sim, são números múltiplos.");
	}
	else {
		System.out.println("Não, não são números múltiplos.");
	}
	
	sc.close();
	}
}
 
