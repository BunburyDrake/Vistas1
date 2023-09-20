package vista;

import java.util.Scanner;

public class NivelDeP {
	  
    public static double calcularPorcentaje(int correctas, int total) {
        return ((double) correctas / total) * 100;
    }
    
    public static String determinarNivel(double porcentaje) {
        if (porcentaje >= 90) {
            return "Nivel Máximo (90% o más)";
        } else if (porcentaje >= 75 && porcentaje<90) {
            return "Nivel Medio (75% - 89%)";
        } else if (porcentaje >= 50 && porcentaje <75) {
            return "Nivel Regular (50% - 74%)";
        } else if(porcentaje <= 49 && porcentaje >=1){
            return "Fuera de Nivel (menos del 50%)";
        }
		return null;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = s.nextInt();
        
        System.out.print("Ingrese la cantidad de preguntas respondidas correctamente: ");
        int preguntasCorrectas = s.nextInt();
        
        double porcentaje = calcularPorcentaje(preguntasCorrectas, totalPreguntas);
        
        String nivel = determinarNivel(porcentaje);
        
        System.out.println("El postulante tiene un nivel de " + nivel);
    }
    Scanner closet;
  
}