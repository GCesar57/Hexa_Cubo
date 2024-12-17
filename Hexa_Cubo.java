package com.ejercicio5;

import java.util.Scanner;

public class Hexa_Cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Construya el algoritmo tal que, dado como dato el lado de un hexaedro o
		//cubo, calcule el área de la base, el área lateral, el área total y el volumen.
		Scanner entrada = new Scanner(System.in);
		double lado, aBase, aLado, aTotal, volumen;
		//
		System.out.println("Ingrese el valor del lado del Hexaedro o Cubo:");
		lado = entrada.nextDouble();
		aBase = lado*lado;
		aLado = 4*(lado*lado);
		aTotal = 6*lado*lado;
		volumen = lado*lado*lado;
		//
		System.out.println("El Area de la Base es: " + aBase);
		System.out.println("El Area Lateral es: " + aLado);
		System.out.println("El Area Total es: " + aTotal);
		System.out.println("El Volumen es: " + volumen);
	}

}
