package vista;

import java.util.Scanner;

public class Numeros_Enteros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a verificar: ");
        int cantidadNumeros = input.nextInt();

        int[] numeros = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        int pares = contarPares(numeros);
        int impares = contarImpares(numeros);

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    public static int contarPares(int[] numeros) {
        int contadorPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }

    public static int contarImpares(int[] numeros) {
        int contadorImpares = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                contadorImpares++;
            }
        }
        return contadorImpares;
    }

		
}

