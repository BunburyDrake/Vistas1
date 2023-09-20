package vista;

import java.util.Scanner;

public class BuenaCalif {
	public static int calif(int num) {
		if(num>95 && num<=100) {
			System.out.println("sobresaliente.");

		}else if(num>=85 && num<=94) {
			System.out.println("muy buena.");

		}else if(num>=75 && num<=84) {
			System.out.println("buena.");

		}else if(num>=60 && num<=74) {
			System.out.println("regular.");

		}else if(num>=50) {
			System.out.println("insuficiente.");
			}
		return num;
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Ingresa la calificación.");
		int num=s.nextInt();
		int c=calif(num);
		
	}
}
