package vista;

import java.util.Scanner;

public class Numeros {
	public static double sumaNumeros(double n, double n2) {
		return n+n2;
	}
	
	public  static double productos(double n3, double n4) {
		return n3*n4;
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Suma 4 numero ");
		System.out.println("ingresa un numero: ");
		double n = s.nextDouble();
		System.out.println("ingresa un numero: ");
		double n2 = s.nextDouble();
		System.out.println("ingresa un numero: ");
		double n3 = s.nextDouble();
		System.out.println("ingresa un numero: ");
		double n4 = s.nextDouble();
		double suma=sumaNumeros(n, n2);
		double producto=productos(n3, n4);
		System.out.println("la suma de los dos primeros numeros es: "+suma);
		System.out.println("El producto de los dos ultimos numeros es: "+producto);

	}

}
