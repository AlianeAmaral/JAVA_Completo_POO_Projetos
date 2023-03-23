import java.util.Scanner;

public class exercicio_2_par_impar { 

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite um número: ");
	int numero = sc.nextInt();
	
	if (numero % 2 == 0) {
		System.out.println("O número digitado foi " + numero + ", um número que é PAR.");
	}
	
	else {
		System.out.println("O número digitado foi " + numero + " um número que é ÍMPAR.");
	}
	
	sc.close();
	}

}
