package clase22;

import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] listaPaises = new String[5];
		
        // Solicitar al usuario que ingrese los nombres de los países
        System.out.println("Ingrese el nombre de 5 países:");
        for (int i = 0; i < listaPaises.length; i++) {
            System.out.print("País " + (i+1) + ": ");
            listaPaises[i] = scanner.nextLine();
        }
        
        // Mostrar el contenido del arreglo por pantalla
        System.out.println("Contenido del arreglo de países:");
        for (int i = 0; i < listaPaises.length; i++) {
        	System.out.print(listaPaises[i] + ",");
			
		}

		
		
	}

}
