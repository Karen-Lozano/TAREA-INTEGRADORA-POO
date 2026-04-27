public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String titular, double saldo){
        super(titular,saldo);
    }
    @Override
    public void retirar(double monto){
        if (saldo-monto>=-500){
            saldo-=monto;
        }else{
            System.out.println("Limite de sobregiro excedido");

        }

        }
    @Override
    public double calcularInteresMensual(){
        return 0;
    }
}
