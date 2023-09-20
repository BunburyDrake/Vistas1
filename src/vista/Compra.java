package vista;

import java.util.Scanner;

public class Compra {
	public static double total(double presio, double cantidad) {
		return cantidad*presio;
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ingresa el precio: ");
		double presio=s.nextDouble();
		System.out.println("ingresa la cantidad a llevar de producto: ");
		double cantidad=s.nextDouble();
		double pago=total(cantidad, presio);
		System.out.println("El pago total: "+pago);



	}

}
