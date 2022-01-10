package exercicios;

import java.util.Scanner;

public class A2Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa onde o usuario vai digitar um numero inteiro e exiba se o numero é par ou impar 
		// se for par o numero deverá ser multiplicado por 4 e a informação deverá ser exibida.
		
		Scanner entrada= new Scanner (System.in);
		
		int num;
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		
		if (num %2 == 0) {
			System.out.println ("O numero que você digitou é par e o valor dele multiplicado por 4 é de: " + num *4);
		}
		else {
			System.out.println("O numero digitado é impar.");
		}
		
		entrada.close();
	}

}
