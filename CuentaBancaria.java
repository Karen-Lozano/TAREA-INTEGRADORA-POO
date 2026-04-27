public abstract class CuentaBancaria {
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    public void depositar(double monto){
        if (monto>0){
            saldo+=monto;
        }else{
            System.out.println("Valor invalido");
        }
    }

    public void retirar(double monto){
        if (monto>0 && monto<+saldo){
            saldo-=monto;
        }else{
            System.out.println("Retiro invalido");
        }
    }

    public abstract double calcularInteresMensual();
}
