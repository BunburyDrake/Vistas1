package vista;
import java.util.Arrays;
import java.util.Scanner;

public class Cinco_numeros {
public static void ordenar(int []array) {
		 Arrays.sort(array);
	}
	public static void main(String[]args) {
		Scanner s =new Scanner(System.in);
		int[]numeros=new int[5];
		for(int n=0; n<5;n++ ) {
			System.out.println("ingresa el numero "+(n+1));
			numeros[n]=s.nextInt();
		}
		ordenar(numeros);
		System.out.println("Numeros ordenados: ");
		for(int num : numeros) {
			System.out.print(num+", ");

		}

	}

	
}
