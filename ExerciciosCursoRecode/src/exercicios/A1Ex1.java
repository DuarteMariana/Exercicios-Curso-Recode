package exercicios;

import java.util.Scanner;

public class A1Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		double altura, base, area;
		
		System.out.println ("Digite o tamanho da altura do retangulo: ");
		altura = entrada.nextDouble ();
		
		System.out.println ("Digite o tamanho da base do retangulo: ");
		base = entrada.nextDouble ();
		
		area = altura * base;
		
		System.out.println ("O valor da aréa do retangulo é de: " + area);
		
		entrada.close ();
	
			
	
	}
	
}
