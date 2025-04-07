package ejercicios;
import java.util.*;
public class Ejercicio4_VAG {

	 public static void main(String[] args) {
	        String[] nombres = new String[20];
	        int[] puntos = new int[20];

	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        for (int i = 0; i < 20; i++) {
	            System.out.print("Nombre del equipo " + (i + 1) + ": ");
	            nombres[i] = scanner.nextLine();
	        }

	        for (int i = 0; i < 20; i++) {
	            puntos[i] = random.nextInt(66) + 35;
	        }

	        System.out.println("\nEquipos y puntuaciones:");
	        for (int i = 0; i < 20; i++) {
	            System.out.println(nombres[i] + " - " + puntos[i] + " puntos");
	        }

	        int max = puntos[0];
	        int min = puntos[0];
	        int posMax = 0;
	        int posMin = 0;
	        int suma = puntos[0];

	        for (int i = 1; i < 20; i++) {
	            suma += puntos[i];

	            if (puntos[i] > max) {
	                max = puntos[i];
	                posMax = i;
	            }

	            if (puntos[i] < min) {
	                min = puntos[i];
	                posMin = i;
	            }
	        }

	        double media = (double) suma / 20;

	        System.out.println("Ganador: " + nombres[posMax] + " / Puntos: " + max);
	        System.out.println("Último: " + nombres[posMin] + " / Puntos: " + min);
	        System.out.println("Media: " + media);
	    }
	}
