package exercicios;

import java.util.Scanner;

public class A2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Para doar sangue � necessario ter idade maior que 20. Fa�a um programa que pergunte a idade
//de uma pessoa e exiba a informa��o se ela pode doar sangue ou n�o.
	
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
		System.out.println ("Informe sua idade: ");
		idade = entrada.nextInt();
		
		if (idade < 20) {
			System.out.println ("Voc� n�o tem a idade permitida para doar sangue.");
		} 
		else {
			System.out.println ("Parab�ns, voc� tem a idade permitida para doar sangue.");
				
		}
		
		entrada.close();
		
	}

}