package exercicios;

import java.util.Scanner;

public class A2Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa onde o usuario vai digitar um numero inteiro e exiba se o numero � par ou impar 
		// se for par o numero dever� ser multiplicado por 4 e a informa��o dever� ser exibida.
		
		Scanner entrada= new Scanner (System.in);
		
		int num;
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		
		if (num %2 == 0) {
			System.out.println ("O numero que voc� digitou � par e o valor dele multiplicado por 4 � de: " + num *4);
		}
		else {
			System.out.println("O numero digitado � impar.");
		}
		
		entrada.close();
	}

}
