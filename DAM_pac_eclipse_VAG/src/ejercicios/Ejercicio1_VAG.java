package ejercicios;
import java.util.*;
public class Ejercicio1_VAG {

	public static boolean auditoriaEmpresa(int salarioJefe, int salarioEncargado, int salarioOficinistas, int numeroOficinistas, boolean proyectosTerminados, int presupuestoEmpresa) {
        if (!proyectosTerminados) {
            System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
            return false;
        }

        double gastoPersonal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);
        
        if (gastoPersonal > 20000) {
            System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoPersonal + " y excede el límite mensual de 20.000 euros");
            return false;
        }

        if (presupuestoEmpresa > 100000) {
            System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
            return false;
        }

        System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salario jefe: ");
        int salarioJefe = scanner.nextInt();

        System.out.print("Salario encargado: ");
        int salarioEncargado = scanner.nextInt();

        System.out.print("Slario oficinistas: ");
        int salarioOficinistas = scanner.nextInt();

        System.out.print("Numero de oficinistas: ");
        int numeroOficinistas = scanner.nextInt();

        System.out.print("¿Se han terminado los proyectos? (true/false): ");
        boolean proyectosTerminados = scanner.nextBoolean();

        System.out.print("Ingrese el presupuesto de la empresa: ");
        int presupuestoEmpresa = scanner.nextInt();

        boolean resultado = auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);
        System.out.println(resultado);
    }

}
