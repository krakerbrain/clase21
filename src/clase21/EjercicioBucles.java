package clase21;

import java.util.Scanner;

public class EjercicioBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Seleccione un numero para elegir el bucle:");
		System.out.println("1. While");
		System.out.println("2. Do While");
		System.out.println("3. For");
		int bucleSecleccionado = scanner.nextInt();
		int suma = 0;
		int i = 1;
		switch (bucleSecleccionado) {
		case 1:
			System.out.println("Ciclo While");
			System.out.println("-------------");
			while (i <= 10) {
				suma += i;
				System.out.println(suma + " + " + i + " = " + (suma + i));
				i++;
			}
			break;
		case 2:
			System.out.println("Ciclo Do While");
			System.out.println("-------------");
			do {
				suma += i;
				System.out.println(suma + " + " + i + " = " + (suma + i));
				i++;
			} while (i <= 10);

			break;
		case 3:
			System.out.println("Ciclo For");
			System.out.println("-------------");
			for (i = 1; i <= 10; i++) {
				System.out.println(suma + " + " + i + " = " + (suma + i));
				suma += i;
			}
			break;
		default:
			break;
		}

	}

}
