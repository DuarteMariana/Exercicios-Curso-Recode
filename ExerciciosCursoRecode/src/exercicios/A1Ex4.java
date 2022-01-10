package exercicios;

import java.util.Scanner;

public class A1Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa para calcular o consumo de um veiculo conforme os dados informados
//no teclado: horas, velocidade média. formulas: distancia= horas*velmedia; consumo= distancia/2;
		
		Scanner entrada = new Scanner (System.in);
		
		double horas, velmedia, distancia, consumo;
		
		System.out.println ("Informe as horas percorridas: ");
		horas = entrada.nextDouble();
		System.out.println ("Qual a velocidade média percorrida: ");
		velmedia = entrada.nextDouble();
		
		distancia = horas*velmedia;
		consumo = distancia/2;
		
		System.out.println ("O consumo do seu veiculo foi de: " + consumo);
		
		entrada.close();
		
	}

}