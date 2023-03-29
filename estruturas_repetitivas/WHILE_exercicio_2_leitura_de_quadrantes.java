package estudos_programacao;
import java.util.Scanner;
import java.util.Locale;

public class WHILE_exercicio_2_leitura_de_quadrantes {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite o valor de X no plano cartesiano: ");
		double x = sc.nextDouble();
	
		System.out.println("Digite o valor de Y no plano cartesiano: ");
		double y = sc.nextDouble();
	
		while (x != 0 && y != 0) {
		
			if (x > 0 && y > 0) {
				System.out.println("O número está no quadrante Q1.");
			}	
		
			else if (x < 0 && y > 0) {
				System.out.println("O número está no quadrante Q2.");	
			}
		
			else if (x < 0 && y < 0) {
				System.out.println("O número está no quadrante Q3.");
			}
		
			else {
				System.out.println("O número está no quadrante Q4.");
			}	
		
			System.out.println("Digite o valor de X no plano cartesiano: ");
			x = sc.nextDouble();
			
			System.out.println("Digite o valor de Y no plano cartesiano: ");
			y = sc.nextDouble();
		
		}
	
		sc.close();
	
	}

}
