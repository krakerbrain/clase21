package clase21;
import java.util.Scanner;


public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scanner = new Scanner(System.in);
	     int num = 1;
	     
	     
	  while (num != 0) {
	        System.out.println("Ingrese una numero:");
	        num = scanner.nextInt();
	  }
	        
	  System.out.println("Numero " + num + " tecleado. Adios!!" );
	  scanner.close();
	}

}
	