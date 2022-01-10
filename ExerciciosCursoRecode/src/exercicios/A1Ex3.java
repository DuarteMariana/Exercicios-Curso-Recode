package exercicios;

import java.util.Scanner;

public class A1Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa para que o usuario informe uma temperatura em graus celcius e transforme
//em graus fahrenheit. Exibir o resultado da conversão. formula F=(9*C+160)/5
		
		Scanner entrada = new Scanner (System.in);
		
		double c;
		double f;
		
		System.out.println ("Digite a temperatura atual em graus celcius:");
		c = entrada.nextDouble();
		
		f = (9*c+160)/ 5;
		
		System.out.println("Transformando a temperatura em graus fahrenheit fica: " + f);
		
		entrada.close();

	}

}