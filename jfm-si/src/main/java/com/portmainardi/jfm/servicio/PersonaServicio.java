package com.portmainardi.jfm.servicio;

import com.portmainardi.jfm.entidad.Persona;
import com.portmainardi.jfm.repositorio.InterfacePersonaRepositori;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaServicio {
    @Autowired InterfacePersonaRepositori InterfacePersonaRepositori;
    
     public List<Persona> list(){
         return InterfacePersonaRepositori.findAll();
     }
     
     public Optional<Persona> getOne(int id){
         return InterfacePersonaRepositori.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombre){
         return InterfacePersonaRepositori.findByNombre(nombre);
     }
     
     public void save(Persona persona){
         InterfacePersonaRepositori.save(persona);
     }
     
     public void delete(int id){
         InterfacePersonaRepositori.deleteById(id);
     }
     
     public boolean existsById(int id){
         return InterfacePersonaRepositori.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return InterfacePersonaRepositori.existsByNombre(nombre);
     }
  
}
