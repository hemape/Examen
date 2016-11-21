import java.util.Scanner;

/* * CSI Florida
 * Reto Putadon
 * 
 * El siguiente c�digo busca una letra dentro de una frase
 * y devuelve d�nde se ha encontrado y ctas veces
 * 
 * Hay dos errores
 *  */
public class Putadon {
	
	public static void main(String[] args) {
		//Variables inicializaci�n
		String frase="";
		int numPos=0;
		int numRepeticiones=0;
		char letra=0;
		pideDatos();
		buscaLetra();
		
		//Pedimos datos
		public static void pideDatos(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();
		}
		public static void buscaLetra(){
		System.out.println("Introduce la letra a buscar");
		letra = sc.nextLine().charAt(0); //charAt(0) devuelve la primera letra
		
		//Buscamos las letras
		for(int i=0;i<frase.length();i++){
			if(letra==frase.charAt(i-1)){
				numRepeticiones=numRepeticiones;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
		}
		System.out.println("Total repeticiones "+numRepeticiones);
	
	}
}

//Deberiamos crear un metodo para cada objetivo, en este caso pideDatos (que pedira que introduzcas una frase), y buscaLetra (que buscara la posici�n de la letra que introduzcas)
//Y llamandolos desde el main, creariamos un codigo mas limpio (refactoring)
