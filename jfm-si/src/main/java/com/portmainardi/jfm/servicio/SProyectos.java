/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portmainardi.jfm.servicio;

import com.portmainardi.jfm.entidad.Educacion;
import com.portmainardi.jfm.entidad.Proyectos;
import com.portmainardi.jfm.repositorio.REducacion;
import com.portmainardi.jfm.repositorio.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Facundo
 */
@Service
@Transactional
public class SProyectos {
    @Autowired
    RProyectos rproyectos;
    
    public List<Proyectos> list(){
        return rproyectos.findAll();
    }
    
    public Optional<Proyectos> getOne(int id){
        return rproyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNmbreE(String nombreE){
        return rproyectos.findByNombreE(nombreE);
    }
    
    public void save(Proyectos proyectos){
        rproyectos.save(proyectos);
    }
    
    public void delete(int id){
        rproyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rproyectos.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rproyectos.existsByNombreE(nombreE);
    }
}
