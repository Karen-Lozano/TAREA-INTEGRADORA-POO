package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {

    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador){
        this.nombreCompleto=nombreCompleto;
        this.cedula=cedula;
        this.ingresosMensuales=ingresosMensuales;
        this.cantidadVehiculos=cantidadVehiculos;
        this.viveEnEcuador=viveEnEcuador;

    }
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    public String Cedula(){
        return cedula;
    }
    public double IngresosMensuales(){
        return ingresosMensuales;
    }
    public int CantidadVehiculos(){
        return cantidadVehiculos;
    }
    public boolean isViveEnEcuador(){
        return viveEnEcuador;
    }
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public void setIngresosMensuales(double ingresosMensuales){
        if (ingresosMensuales >= 470){
            this.ingresosMensuales=ingresosMensuales;
        } else {
            System.out.println("Ingreso invalido. se asigna 470.");
            this.ingresosMensuales=470;
        }
    }
    public void setCantidadVehiculos(int cantidadVehiculos){
        if (cantidadVehiculos >=0){
            this.cantidadVehiculos=cantidadVehiculos;
        }else {
            System.out.println("Cantidad invalida. Se asigna 0.");
            this.cantidadVehiculos=0;
        }
    }
    public void setViveEnEcuador(boolean viveEnEcuador){
        this.viveEnEcuador=viveEnEcuador;
    }
    public boolean subsidioAprobado(){
        return ingresosMensuales<=1200 &&
                cantidadVehiculos<=1 &&
                viveEnEcuador;
    }
    public void generarResultado(){
        if (subsidioAprobado()){
            System.out.println("Subsidio Aprobado");
        }else{
            System.out.println("Subsidio Rechazado");

            if (ingresosMensuales> 1200){
                System.out.println("Supera el limite de ingresos");
            }
            if (cantidadVehiculos>1){
                System.out.println("Tiene mas de un vehiculo");
            }
            if (!viveEnEcuador){
                System.out.println("Noreside en Ecuador");
            }
        }
    }
    @Override
    public String toString(){
        return "Nombre: "+ nombreCompleto +
                "\nCedula: " + cedula +
                "\nIngresos: " + ingresosMensuales +
                "\nVehiculos: " + cantidadVehiculos +
                "\nVive en Ecuador: " + viveEnEcuador;
    }
    public static void mostrarReglasSubsidio(){
        System.out.println("========= REGLAS DE SUBSIDIO======== ");
        System.out.println("Tener ingresos mensuales menores o iguales a $1,200");
        System.out.println("No poseer mas de un vehiculo registrado");
        System.out.println("Tener residencia en Ecuador");
        System.out.println("====================================");
    }
    public double calcularConsumoMensual(){
        double km = 1000;
        return km / 40;
    }
    public double calcularConsumoMensual(double kmExtra){
        double km = 1000;
        return km / 40;
    }

}
