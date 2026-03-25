public class EmpleadoTemporal extends Empleado {
    private int duracionContrato;
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTemporal(String nombre , int id, String apellido, String tipoEmpleado, Departamento departamento, int salario, int duracionContrato, int horasTrabajadas, double tarifaPorHora){
        super( nombre,id, apellido, tipoEmpleado, departamento, salario);
        this.duracionContrato = duracionContrato;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
        
    }

    public double calcularSalario(){
        return this.horasTrabajadas * this.tarifaPorHora;
    }

    public void finalizarContrato(){
        double pagoFinal  = calcularSalario();
       System.out.println("cotrato de "  + getNombre()  + "finalizado");
       System.out.println("Duracion total :"  + this.duracionContrato + "meses");
       System.out.println("Liquidacion final :  "  +  pagoFinal);
    }

    public int getDuracionContrato(){
        return duracionContrato;
    }

    public void setDuracionContrato( int duracionContrato){
        this.duracionContrato = duracionContrato;
    }

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public void setHorasTrabajadas( int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    

    public double getTarifaPorHora(){
        return tarifaPorHora;
    }

    public void setTarifaPorHora( double tarifaPorHora){
        this.tarifaPorHora = tarifaPorHora;
    }




}
