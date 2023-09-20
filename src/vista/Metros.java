package vista;

import java.util.Scanner;

public class Metros {
	public static double kilometro(double m) {
		return m/1000;
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ingresa los metros: ");
		double m=s.nextDouble();
		double k=kilometro(m);
		System.out.println("los kilometro son: "+k+"km");



}
}
