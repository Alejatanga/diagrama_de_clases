

import java.util.Scanner;
import java.util.ArrayList;

public class InterfazU {
    private Scanner sc;
    private ArrayList<Departamento> listaDepartamentos;

    public InterfazU() {
        sc = new Scanner(System.in);
        listaDepartamentos = new ArrayList<>();
    }

    public void iniciar() {
        int opcion = 0;
        do {
            System.out.println("\n===== MENÚ DE GESTIÓN EMPRESARIAL =====");
            System.out.println("1. Gestionar Departamentos (Crear)");
            System.out.println("2. Gestionar Empleados (Agregar a Depto)");
            System.out.println("3. Listar Empleados por Departamento");
            System.out.println("4. Visualizar Reportes de Desempeño");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(sc.nextLine());
                ejecutarAccion(opcion);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        } while (opcion != 5);
    }

    private void ejecutarAccion(int opcion) {
        switch (opcion) {
            case 1:
                crearDepartamento();
                break;
            case 2:
                agregarEmpleadoADepartamento();
                break;
            case 3:
                mostrarTodosLosEmpleados();
                break;
            case 4:
                generarReporte();
                break;
            case 5:
                System.out.println("Cerrando aplicación...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    

    private void crearDepartamento() {
        System.out.println("Ingrese el id del deparatamento:");
          int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nombre del nuevo departamento: ");
        String nombre = sc.nextLine();
    
       listaDepartamentos.add(new Departamento( id,nombre));
        System.out.println("Departamento '" + nombre + "' creado con éxito.");
    }

    private void agregarEmpleadoADepartamento() {
        if (listaDepartamentos.isEmpty()) {
            System.out.println("Primero debe crear un departamento.");
            return;
        }

        
        System.out.println("Seleccione el departamento:");
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            System.out.println(i + ". " + listaDepartamentos.get(i).getNombre());
        }
        int departamentoIndice = Integer.parseInt(sc.nextLine());
        Departamento departamentoSeleccionado = listaDepartamentos.get(departamentoIndice);

    
        System.out.println("Tipo: 1. Temporal | 2. Permanente");
        int tipo = Integer.parseInt(sc.nextLine());
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
         System.out.print("ID: ");
        int  id = Integer.parseInt(sc.nextLine());
        System.out.println("apellido:");
        String apellido = sc.nextLine();
       
        System.out.println("Tipo de empleado:");
        String tipoEmpleado = sc.nextLine();
        System.out.println("salario:");
        int salario = Integer.parseInt( sc.nextLine());

        if (tipo == 1) {
            System.out.println("duracion del contrato ( meses):");
            int duracionContrato = Integer.parseInt(sc.nextLine());
            System.out.println(" horas trabajadas:");
            int horasTrabajadas = Integer.parseInt(sc.nextLine());
            System.out.println("tarifa por hora:");
            double tarifaPorHora = Double.parseDouble( sc.nextLine());



            departamentoSeleccionado.agregarEmpleado(new EmpleadoTemporal( nombre ,  id,  apellido,  tipoEmpleado,  departamentoSeleccionado,  salario,  duracionContrato,  horasTrabajadas,  tarifaPorHora));
              
             
      
        }  else if (tipo == 2 ){
            System.out.println("bono Fijo: ");
            double bonoFijo = Double.parseDouble(sc.nextLine());


             departamentoSeleccionado.agregarEmpleado(new EmpleadoPermanente (  nombre,id,  apellido,  tipoEmpleado,  departamentoSeleccionado,  salario, bonoFijo));
        }
    }

    private void mostrarTodosLosEmpleados() {
        for (Departamento d : listaDepartamentos) {
            System.out.println("\nDepartamento: " + d.getNombre());
        
            d.listarEmpleados(); 
        }
    }

    private void generarReporte() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Departamentos disponibles:");

    for ( int i = 0; i < listaDepartamentos.size(); i++){
        System.err.println(i +". " + listaDepartamentos.get(i).getNombre());

    } 
    System.out.println("seleccione el indice del departamento: ");
    int indiceDepartamento = Integer.parseInt(sc.nextLine());

    Departamento departamentoSeleccionado = listaDepartamentos.

    
     System.out.println(" empleados disponibles");
    System.out.print("Ingrese el ID del empleado: ");
    int idBusqueda = Integer.parseInt(sc.nextLine());

    
    Empleado empSeleccionado = null;
    for (Empleado e : departamentoSeleccionado.getListaEmpleados()) {
        if (e.getId() == idBusqueda) {
            empSeleccionado = e;
            break;
        }
    }

    
    if (empSeleccionado != null) {
        System.out.print("Ingrese el ID del reporte: ");
        int idReporte = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese la nota de desempeño (1-10): ");
        double nota = Double.parseDouble(sc.nextLine());


        ReporteDes nuevoReporte = departamentoSeleccionado.generarReporte(idReporte, nota, "Buen desempeño", empSeleccionado);
        
        System.out.println("\nReporte generado con éxito:");
        System.out.println(nuevoReporte.obtenerDetallesReporte());
    } else {
        System.out.println("Error: No se encontró un empleado con el ID " + idBusqueda);
    }
}

    }
        

    
