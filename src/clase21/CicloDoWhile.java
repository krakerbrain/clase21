package clase21;

import java.util.Scanner;

public class CicloDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int numero = 2;
//		
//		do {
//			System.out.print(numero + " ");
//			numero++;
//		} while (numero < 10);
		
		int numeroLimite = 20;
		int suma = 0;
		
		
		do {
			System.out.println("Ingrese un numero 1");
			int numero1 = scanner.nextInt();
			System.out.println("Ingrese un numero 2");
			int numero2 = scanner.nextInt();
			suma = numero1 + numero2;
			if(suma <= numeroLimite) {				
				System.out.println("La suma de " + numero1 + " y " + numero2 + " no supera el limite de: " + numeroLimite);
			}
			
		} while (suma <= numeroLimite);
		
		System.out.println("Limite superado = " + suma);
		scanner.close();
	}

}
