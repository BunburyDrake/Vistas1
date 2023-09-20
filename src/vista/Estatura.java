package vista;
import java.util.Scanner; 
public class Estatura { public static void main(String[] args) { 
	try (Scanner scanner = new Scanner(System.in)) {
	System.out.print("Ingrese la cantidad de alturas: "); 
	int n = scanner.nextInt();
	double[] alturas = new double[n]; for (int i = 0; i < n; i++) { 
		System.out.print("Ingrese la altura " + (i + 1) + ": ");
		alturas[i] = scanner.nextDouble();
		}
	double promedio = calcularAlturas(alturas);
	System.out.println("El promedio de las alturas es: " + promedio);
} }
public static double calcularAlturas(double[] alturas) {
	double suma = 0;
	for (double altura : alturas) { 
		suma += altura; 
	}
	return suma / alturas.length;
	} }