package exercicios;

import java.util.Scanner;

public class A2Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa onde o usuario digite tr�s numeros e o programa dever� verificar quais numeros s�o iguais.
//(podem ser iguais dois numeros ou tr�s.)Exibir a mensagem de quais numeros s�o iguais.
		
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		
		System.out.println ("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		
		System.out.println ("Digite o terceiro numero: ");
		num3 = entrada.nextInt();
		
		if (num1 == num2) {
			System.out.println ("O primeiro e o segundo numero digitado s�o iguais");
		} else if (num1 == num3){
			System.out.println ("O primeiro e o teceiro numero digitado s�o iguais");	
		} else if (num2 == num3) {
			System.out.println ("O segundo e o terceiro numero digitado s�o iguais");
		}else if (num1 == num2 || num1 == num3 || num2 == num3){
			System.out.println ("Todos os numeros digitados s�o iguais");
		} else {
			System.out.println("Os numeros digitados s�o diferentes");
		}
		
		entrada.close();
		
	}

}
