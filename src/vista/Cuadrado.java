package vista;

import java.util.Scanner;

public class Cuadrado {
	public static  double perimetro(double l,double p) {
		
		return l*4;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("perimetro cuadrado ");
		System.out.println("ingresa un lado: ");
		double l=s.nextDouble();
	    double p =perimetro(l, l);
		System.out.println("EL perimetro es: "+p+" u");
	

	}

}
