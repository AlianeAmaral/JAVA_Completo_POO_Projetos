import java.util.Scanner;

public class exercicio_4_duracao_jogo {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Qual o horário do início do jogo, em número inteiro?");
		int horaInicial = sc.nextInt();
	
	System.out.println("Qual o horário do fim do jogo, em número inteiro?");
		int horaFinal = sc.nextInt();
	
	int duracaoJogo = 24;
	
	if (horaInicial > horaFinal) {
		duracaoJogo = (24 - horaInicial + horaFinal);
	}
		
	else if (horaInicial < horaFinal) {
		duracaoJogo = (horaFinal - horaInicial);
	}
			
	System.out.println("O jogo durou " + duracaoJogo + " hora(s).");
	
	sc.close();
	}
}
