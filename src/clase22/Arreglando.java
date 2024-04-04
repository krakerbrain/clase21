package clase22;

import java.util.Scanner;

public class Arreglando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer[] numeros = new Integer[3];
		int numeroMayor = 0;
		
		System.out.println("Ingrese  3 numeros");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero " + (i+1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("Los números seleccionados fueron: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		System.out.print("Y el número mayor es: ");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];
			}
		}
		System.out.println(numeroMayor);
		scanner.close();	
	}

}
