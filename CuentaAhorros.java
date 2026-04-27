public class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(String titular, double saldo){
        super(titular,saldo);

    }
    @Override
    public double calcularInteresMensual(){

        return saldo*0.03/12;
    }
}
