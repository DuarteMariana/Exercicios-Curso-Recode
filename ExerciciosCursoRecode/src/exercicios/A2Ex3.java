package exercicios;

import java.util.Scanner;

public class A2Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para que o ususario digite um numero e o programa verifique se os numeros 
		// est�o entre o intervalo de valores de 10 a 20. Exibir a mensagem se esta ou n�o entre o intervalo de valores.
		
		Scanner entrada = new Scanner (System.in);
		
		int num;
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		
		if (num >= 10 && num <= 20) {
			System.out.println ("O numero digitado est� entre o intervalo de valores de 10 a 20.");
		} else {
			System.out.println("O numero digitado n�o est� dentro do intervalo de valores de 10 a 20.");
		}
		
		entrada.close();
		
	}

}
