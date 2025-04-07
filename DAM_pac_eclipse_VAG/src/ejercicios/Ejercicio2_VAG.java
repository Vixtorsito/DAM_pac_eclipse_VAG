package ejercicios;
import java.util.*;
public class Ejercicio2_VAG {

	public static boolean procesoSeleccion() { 

		 Scanner scanner = new Scanner(System.in); 

		 System.out.print("Edad: "); 
		 int edad = scanner.nextInt(); 

		 if (edad > 40) { 
			 System.out.println("Descartado por ser mayor de 40 años."); 
			 return false; 
		 } 

		 System.out.print("Nombre: "); 
		 String nombre = scanner.next(); 

		 System.out.print("Años trabajados: "); 
		 int añosTrabajados = scanner.nextInt(); 

		 System.out.print("Sueldo bruto anual anterior: "); 
		 double sueldoAnual = scanner.nextDouble(); 

		 if (sueldoAnual > 30000) { 
			 System.out.println("Descartado, salario anterior mayor a 30000 €."); 
			 return false; 

		 } 

		 System.out.println("¡Felicidades, contratado.");  

		 double sumaNominas = 0; 

		 for (int i = 1; i <= 5; i++) { 
			 System.out.print("Importe de la nómina " + i + ": "); 
			 double nomina = scanner.nextDouble(); 
			 sumaNominas += nomina; 
		 } 

		 System.out.println("La suma de las nóminas es: " + sumaNominas + " €");  

		 double media = sumaNominas / 5; 
		 double nuevoSalario; 

		 if (media > 2500) { 
			 nuevoSalario = media * 1.05; 
			 System.out.println("La media de las nominas supera los 2500 euros."); 
		 } else { 
			 nuevoSalario = media * 1.10;  
			 System.out.println("La media de las nominas no supera los 2500 euros."); 

		 } 

			 System.out.println("Su nueva nómina mensual será: " + nuevoSalario + " €"); 
			 return true; 
	} 

	public static void main(String[] args) { 
		 boolean resultado = procesoSeleccion(); 
		 System.out.println("Resultado: " + (resultado ? "contratado" : "no contratado")); 
	} 

} 
