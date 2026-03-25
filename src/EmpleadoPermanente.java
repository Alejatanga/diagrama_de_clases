public class EmpleadoPermanente extends Empleado {
    private double bonoFijo;
    
    
    public EmpleadoPermanente( String nombre, int id, String apellido, String tipoEmpleado, Departamento departamento, int salario, double bonofijo) {
        super(nombre,id, apellido, tipoEmpleado, departamento,salario );
        this.bonoFijo = bonofijo;

    }

     public double calcularBeneficios(){
        return this.bonoFijo + (getSalario() * 0.03);
     }

      public double calcularSalarioTotal() {
         return getSalario() + calcularBeneficios();
      }

      public void setBonoFijo(double bonoFijo){
         this.bonoFijo = bonoFijo;
      }

      public double getBonoFijo(){
        return bonoFijo;
      }

}
