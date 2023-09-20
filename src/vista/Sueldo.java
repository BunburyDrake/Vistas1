package vista;

import java.util.Scanner;

class Trabajador {
    private double sueldo;
    private int antiguedad;

    public Trabajador(double sueldo, int antiguedad) {
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public void calcularAumentoSueldo() {
        if (sueldo < 500) {
            if (antiguedad > 10) {
                sueldo += sueldo * 0.20; 
            } else {
                sueldo += sueldo * 0.05;
            }
        }
    }

    public double getSueldo() {
        return sueldo;
    }
}

public class Sueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = scanner.nextDouble();

        System.out.print("Ingrese los años de antigüedad del trabajador: ");
        int antiguedad = scanner.nextInt();

        Trabajador trabajador = new Trabajador(sueldo, antiguedad);
        trabajador.calcularAumentoSueldo();

        System.out.println("El nuevo sueldo del trabajador es: " + trabajador.getSueldo());

        scanner.close();
    }
}
