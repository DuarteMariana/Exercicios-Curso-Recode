package exercicios;

import java.util.Scanner;

public class A1Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa para calculo de um salario liquido do professor. Serão fornecidos valor da 
//hora aula, numero de aulas dadas e o % de desconto do INSS.
		//salario = valor da hora/aula * numero de aulas dadas.
		//desconto = salario *inss/100
		//salario liquido= salario - desconto
		Scanner entrada = new Scanner (System.in);
		
		double valorHa, inss, desconto, salario, salario_liquido;
		int horaAula;
		
		System.out.println ("Qual o valor que você recebe por cada hora de aula dada: ");
		valorHa = entrada.nextDouble();
		
		System.out.println ("Qual a porcentagem de desconto do INSS: ");
		inss = entrada.nextDouble();
		
		System.out.println ("Qual foi o numero de aulas dadas: ");
		horaAula = entrada.nextInt();
		
		salario = valorHa*horaAula;
		desconto = salario * inss/100;
		salario_liquido = salario - desconto;
		
		System.out.println("Seu salario liquido sera de: " + salario_liquido);
		
		entrada.close();
		
	}

}
