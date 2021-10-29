public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private boolean empledo;

   public Persona(){}

   public Persona(String nombre,String apellido,int dni,boolean empleado){
       this.nombre = nombre;
       this.apellido=apellido;
       this.dni=dni;
       this.empleado=empleado;
   }
// Geters and seters

   public String getNombre() {
    return nombre;
    }

    public String setNombre(String nombre){
    this.nombre = nombre;
    }

    
    public String getApellido() {
    return apellido;
    }
    
    public String setApellido(String apellido){
    this.apellido = apellido;
    }

    public int getDni() {
    return dni;
    }
        
    public int setDni(int dni){
    this.dni = dni;
    }

    public boolean getEmpleado() {
    return empleado;
    }
            
                
    public boolean setEmpleado(boolean empleado){
    this.empleado = empleado;
    }

}