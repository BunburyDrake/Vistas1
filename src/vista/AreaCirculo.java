package vista;

import java.util.Scanner;

public class AreaCirculo {
	public static double perimetroc(double r) {
		return Math.PI*(r*2);
	
	}
	public static double areac(double r2) {
		return Math.PI*Math.pow(r2,2);
	
	}

	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ingresa el radio del circulo.");
		double r=s.nextDouble();
		double perimetro=perimetroc(r);
		System.out.println("EL perimetro es: "+perimetro);
		double r2=r;
		double area=areac(r2);
		System.out.println("EL area es: "+area);
	}

}
