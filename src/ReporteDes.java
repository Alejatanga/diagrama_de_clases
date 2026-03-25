public class ReporteDes {
    private int id;
    private int calificacion;
    private String comentarios;
    private Empleado empleado;

    public ReporteDes( int id, int calificacion, String comemntarios, Empleado empleado){
        this.id = id;
        this.calificacion = calificacion;
        this.comentarios = comemntarios;
        this.empleado = empleado;

    }
    public String  obtenerDetallesReporte(){
        return " ===DETALLE DEL REPORTE=== \n" + "ID Reporte:" + id + "\n" +"Empleado: " + empleado.getNombre()+"  "  + empleado.getApellido() + "\n" + "calificacion:" + calificacion + "\5\n" + "comentarios:" + comentarios;
    }

    public int getId(){
        return id;
    }

    public void setId( int id){
        this.id = id;

    }

    public int getCalificacion(){
        return calificacion;
    }

    public void setCalificacion( int calificacion){
        if (calificacion <= 1 &&  calificacion <= 5){
            this.calificacion = calificacion;
        }   else{
            System.out.println("la calificacion debe estar entre 1 y 5");
        }

        

    }

    public String getComentarios(){
        return comentarios;
    }

    public void setComentarios( String comentarios){
        this.comentarios = comentarios;

    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public void setEmpleado( Empleado empleado){
        this.empleado = empleado;
    }

    }


