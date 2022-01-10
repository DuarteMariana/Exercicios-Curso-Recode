package exercicios;

import java.util.Scanner;

public class A2Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa onde o usuario digite três numeros e o programa deverá verificar quais numeros são iguais.
//(podem ser iguais dois numeros ou três.)Exibir a mensagem de quais numeros são iguais.
		
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		
		System.out.println ("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		
		System.out.println ("Digite o terceiro numero: ");
		num3 = entrada.nextInt();
		
		if (num1 == num2) {
			System.out.println ("O primeiro e o segundo numero digitado são iguais");
		} else if (num1 == num3){
			System.out.println ("O primeiro e o teceiro numero digitado são iguais");	
		} else if (num2 == num3) {
			System.out.println ("O segundo e o terceiro numero digitado são iguais");
		}else if (num1 == num2 || num1 == num3 || num2 == num3){
			System.out.println ("Todos os numeros digitados são iguais");
		} else {
			System.out.println("Os numeros digitados são diferentes");
		}
		
		entrada.close();
		
	}

}
