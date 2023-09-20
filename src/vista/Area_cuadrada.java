package vista;
import java.util.Scanner;
public class Area_cuadrada {

	public static void main(String[] args) {
		double area;
		
		 try(Scanner scaner = new Scanner(System.in)) {
			System.out.println("Ingresa base y altura: ");
			double l2=scaner.nextDouble();
			double l=scaner.nextDouble();
			area=(l*l2/2);
		}
		System.out.println("Area: "+area);
		
		
	}

}
