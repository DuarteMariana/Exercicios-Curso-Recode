package exercicios;

import java.util.Scanner;

public class A2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Para doar sangue é necessario ter idade maior que 20. Faça um programa que pergunte a idade
//de uma pessoa e exiba a informação se ela pode doar sangue ou não.
	
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
		System.out.println ("Informe sua idade: ");
		idade = entrada.nextInt();
		
		if (idade < 20) {
			System.out.println ("Você não tem a idade permitida para doar sangue.");
		} 
		else {
			System.out.println ("Parabéns, você tem a idade permitida para doar sangue.");
				
		}
		
		entrada.close();
		
	}

}