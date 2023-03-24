package estudos_programacao;
import java.util.Scanner;

public class exercicio_3_while_preferencia_combustivel {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int alcool = 0;
	int gasolina = 0;
	int diesel = 0;
	
	System.out.println("Qual a sua preferência de combustível?");
	System.out.println("Escolha: Álcool [1], Gasolina [2], Diesel [3], Sair [Qualquer Outro Número]");
	int resposta = sc.nextInt();
	
	while (resposta > 0 && resposta <= 3) {
		
		if (resposta == 1) {
			alcool = alcool + 1;
		}
		else if (resposta == 2) {
			gasolina = gasolina + 1;
		}
		else if (resposta == 3) {
			diesel = diesel + 1;
		}
		
		resposta = sc.nextInt();

	}
	
			System.out.println("Obrigado(a)!");
			System.out.println("TOTAL DE VOTOS: ");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);		
	
	sc.close();

	}

}
