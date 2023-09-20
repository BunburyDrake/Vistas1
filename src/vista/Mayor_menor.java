package vista;

import java.util.Scanner;

public class Mayor_menor {
	public static boolean num(int n) {
		
		return n%2==0;
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ingresa un numero.");
		int n=s.nextInt();
		boolean p=num(n);
		if(p==false) {
			System.out.println("impar.");

		}else {
			System.out.println("par");

		}


	}


}
