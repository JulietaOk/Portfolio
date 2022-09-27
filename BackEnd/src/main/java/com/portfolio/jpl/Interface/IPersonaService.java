package com.portfolio.jpl.Interface;

import com.portfolio.jpl.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Lista de personas
    public List<Persona> getPersona();
    
    //Guardar
    public void savePersona(Persona persona);
    
    //Eliminar
    public void deletePersona(Long id);
    
    //Buscar
    public Persona findPersona(Long id);
    
    
}
