
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private int id;
    private String nombre;
     public Departamento( int id,String nombre){
        this.id =id;
        this .nombre = nombre;
     }

     public List<Empleado> getListaEmpleados(){
        return listaEmpleados;
     }

     public int getId(){
        return this.id;
     }
    public String getNombre(){
        return this.nombre;
    }
    

    



    public void agregarEmpleado(Empleado e) {
        listaEmpleados.add(e);
        System.out.println("Empleado guardado.");
    }

    
    public void listarEmpleados() {
        System.out.println("--- Lista de Empleados ---");
        for (Empleado e : listaEmpleados) {
            System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre());
        }
    }

    
    public ReporteDes generarReporte( int id, double nota , String comentario, Empleado empleado) {
        System.out.println("--- Reporte del Departamento " + nombre + " ---");
        for (Empleado e : listaEmpleados) {
            System.out.println("Empleado: " + e.getNombre());
    
        }
         ReporteDes reporteDesnuevo = new ReporteDes(id, id, comentario, empleado);
            return reporteDesnuevo;
    }

    
    public void eliminarEmpleado(int idEliminar) {
        listaEmpleados.removeIf(emp -> emp.getId() == idEliminar);
        System.out.println("ID " + idEliminar + " empleado eliminado.");
    }
}