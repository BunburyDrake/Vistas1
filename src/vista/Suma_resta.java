package vista;

import java.util.Scanner;
public class Suma_resta {
	public static double sumaresta(double a, double b) {
	return (a+b)*(a-b);
}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ingresa dos numeros");
		double a=s.nextDouble();
		double b=s.nextDouble();
		double r=sumaresta(a, b);
		System.out.println("resutado: "+r);


}
}