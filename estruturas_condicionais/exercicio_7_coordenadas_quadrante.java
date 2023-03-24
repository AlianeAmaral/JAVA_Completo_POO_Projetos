import java.util.Locale;
import java.util.Scanner;

public class exercicio_7_coordenadas_quadrante {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite o valor de X no plano cartesiano: ");
	double x = sc.nextDouble();
	
	System.out.println("Digite o valor de Y no plano cartesiano: ");
	double y = sc.nextDouble();
	
	if (x > 0 && y > 0) {
		System.out.println("O número está no quadrante Q1.");
	}
	
	else if (x < 0 && y > 0) {
		System.out.println("O número está no quadrante Q2.");	
	}
	
	else if (x < 0 && y < 0) {
		System.out.println("O número está no quadrante Q3.");
	}
	
	else if (x > 0 && y < 0) {
		System.out.println("O número está no quadrante Q4.");
	}
	
	else if (x == 0 && y == 0) {
		System.out.println("O número está na origem central: 0.");
	}
	
	else if (x == 0) {
		System.out.println("O número está no Eixo Y.");
	}
	
	else if (y == 0) {
		System.out.println("O número está no Eixo X.");
	}
	
	sc.close();
	}
}
