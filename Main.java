import java.util.Scanner;
import ec.gob.subsidio.modelo.SolicitanteSubsidio;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in) ;

      SolicitanteSubsidio.mostrarReglasSubsidio();

        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su cedula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese la cantidad de vehiculos: ");
        int vehiculos = sc.nextInt();

        System.out.print("Vive en Ecuador? true/false:");
        boolean vive = sc.nextBoolean();

        SolicitanteSubsidio s= new SolicitanteSubsidio(nombre,cedula,ingresos,vehiculos,vive);

        System.out.println("=======DATOS SOLICITANTES=========");
        System.out.println(s);
        s.generarResultado();

        double consumo1=s.calcularConsumoMensual();
        double consumo2=s.calcularConsumoMensual(200);

        System.out.println("=====Calculo del consumo mensual========");
        System.out.println("Consumo mensual estimado(sin km extra): " + consumo1 + " galones");
        System.out.println("Consumo con kilometros extra(80 km adicionales): " + consumo2 + " galones");

    }
}