public class PersonaABMServiceImp implement PersonaABMService {

    public static final PersonaRepository personaRepository;

    public Persona(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }
    
    @Override
    public void altaPersona(String nombre,String apellido,int dni,boolean empleado){
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDni(dni);
        persona.setEmpleado(empleado);
        personaRepository.save(persona)
    }
    
    @Override
    public void deletePersona(Persona persona){
        personaRepository.delete(persona)
    }
    
    @Override
    public void updatePersona(Persona persona){
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDni(dni);
        persona.setEmpleado(empleado);
        personaRepository.save(persona)
    }

}