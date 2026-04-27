public class CuentaInversion extends CuentaBancaria {
    public CuentaInversion(String titular, double saldo){
        super(titular,saldo);
    }

    @Override
    public double calcularInteresMensual(){
        double tasa;

        if (saldo<1000){
            tasa=0.04;
        }else if (saldo <= 5000){
            tasa = 0.05;
        }else {
            tasa = 0.06;
        }
        return saldo * tasa /12;
    }
}
