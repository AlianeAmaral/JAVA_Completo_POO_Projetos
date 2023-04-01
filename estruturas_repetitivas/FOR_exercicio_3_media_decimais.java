package estudos_programacao;
import java.util.Scanner;

public class FOR_exercicio_3_media_decimais {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int repeticoes = 0;
	double x, y, z;
	
	System.out.println("Quantas vezes deseja repetir? ");
	repeticoes = sc.nextInt();
	
	for (int i=0; i < repeticoes; i++) {
		System.out.println("Digite o primeiro número decimal: ");
			x = sc.nextDouble();
	
		System.out.println("Digite o segundo número decimal: ");
			y = sc.nextDouble();
	
		System.out.println("Digite o terceiro número decimal: ");
			z = sc.nextDouble();
		
		double mediaDecimais = ((x * 2) + (y * 3) + (z * 5)) / 10;
		System.out.printf("A média dos decimais informados é: %.1f%n", mediaDecimais);
	}
	sc.close();
	}
}
