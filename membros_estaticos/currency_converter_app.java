package cotacao_dolar_real;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.CurrencyConverter;

public class currency_converter_app {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("What is the dollar price? ");
	double dollar = sc.nextDouble();
	
	System.out.print("How many dollars will be bought? ");
	double amount = sc.nextDouble();
	
	double result = CurrencyConverter.calc(dollar, amount);
	
	System.out.printf("Amout to be paid in reais: R$ %.2f%n", result);
	
	sc.close();
	
	}

}
