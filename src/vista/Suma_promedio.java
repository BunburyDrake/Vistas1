package vista;

import java.util.Scanner;

public class Suma_promedio {
public static double promedio(double n1, double n2, double n3, double n4) {
	return n1+ n2+ n3+ n4;
}
public static double promedio1(double n1, double n2, double n3, double n4) {
	return (n1+ n2+ n3+ n4)/4;
}
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	System.out.println("ingresa 4 numeros");
	double n1=s.nextDouble();
	double n2=s.nextDouble();
	double n3=s.nextDouble();
	double n4=s.nextDouble();
	double suma=promedio(n1, n2, n3, n4);
	double promedio=promedio1(n1, n2, n3, n4);
	System.out.println("La suma es: "+suma);
	System.out.println("El promedio es: "+promedio);

}
}

