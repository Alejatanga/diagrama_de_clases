public class Empleado {
    private String nombre;
    private int id;
    private String apellido;
    private String tipoEmpleado;
    private Departamento departamento;
    private int salario;

    public Empleado( String nombre, int id, String apellido, String tipoEmpleado, Departamento departamento, int salario) {
        this.nombre = nombre;
        this.id = id;
        this.apellido = apellido;
        this.tipoEmpleado = tipoEmpleado;
        this.departamento = departamento;
        this.salario = salario;
    }

   

    public String getNombre(){
        return nombre;
    }

     public void setNombre( String nombre){
        this.nombre = nombre;
    }

     public int getId() {
        return id;
    }

     public void setId( int id) {
        this.id = id;
    }

   

    public String getApellido() {
        return apellido;
    }

    public void setApellido( String apellido){
        this.apellido = apellido;
    }

    public String getTipoEmpleado(){
        return tipoEmpleado;
    }

    public void setTipoEmpleado( String tipoEmpleado){
        this.tipoEmpleado = tipoEmpleado;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public void setDepartamento( Departamento departamento){
        this.departamento = departamento;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario( int salario){
        this.salario = salario;
    }

}
