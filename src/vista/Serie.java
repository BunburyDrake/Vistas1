package vista;

public class Serie {
	public static void ser(int inicio, int fin, int paso ) {
		for(int i=inicio;i<= fin; i+=paso) {
			System.out.print(i+", ");
		}
		
	}
	public static void main(String[]args) {
		int inicio=11;
		int fin=275;
		int paso=11;
		ser(inicio,fin,paso);
	}

}
