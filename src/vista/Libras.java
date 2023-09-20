package vista;

import java.util.Scanner;

public class Libras {
	
		public static double libra(double pg) {
			return pg/453.59;
		}
		public static void main(String[]args) {
			Scanner s=new Scanner(System.in);
			System.out.println("ingresa los gramos: ");
			double pg=s.nextDouble();
			double l=libra(pg);
			System.out.println("las libras son: "+l+" libras ");

}
}