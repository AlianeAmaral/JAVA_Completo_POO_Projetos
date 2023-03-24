import java.util.Locale;
import java.util.Scanner;

public class exercicio_6_numero_intervalo {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número qualquer para ser informado em qual intervalo o número está: ");
	
	double numero = sc.nextDouble();
	
	if (numero >= 0 && numero <= 25) {
		System.out.println("O número está no intervalo: [0 até 25].");
	}
	
	else if (numero > 25 && numero <= 50) {
		System.out.println("O número está no intervalo: [25 até 50].");
	}
	
	else if (numero > 50 && numero <= 75) {
		System.out.println("O número está no intervalo: [50 até 70].");
	}
	
	else if (numero > 70 && numero <= 100) {
		System.out.println("O número está no intervalo: [70 até 100].");
	}
	
	else {
		System.out.println("Fora de Intervalo. Digite um número de 0 até 100.");
	}
	
	sc.close();
	}
}
