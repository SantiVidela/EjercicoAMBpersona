public interface PersonaABMService {

    void altaPersona(String nombre,String apellido,int dni,boolean empleado);
    void updatePersona(Persona persona);
    void deletePersona(Persona persona);


}