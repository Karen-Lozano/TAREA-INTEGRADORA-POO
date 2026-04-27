import java.util.ArrayList;
import java.util.List;

public class MainBanco {
    public static void main(String[] args){
        List<CuentaBancaria> cuentas=new ArrayList<>();

        cuentas.add(new CuentaAhorros("Ana Perez",1200));
        cuentas.add(new CuentaCorriente("Luis Sanchez",800));
        cuentas.add(new CuentaInversion("Marta Julia",7000));

        double totalInteres=0;

        for (CuentaBancaria c: cuentas){
            double interes = c.calcularInteresMensual();
            totalInteres += interes;

            System.out.println("Titular: " + c.titular);
            System.out.println("Saldo: " + c.saldo);
            System.out.println("Interes mensual: " + interes);
            System.out.println("=============================");
        }
        System.out.println("Total intereses del banco: "+ totalInteres);
    }
}
