/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portmainardi.jfm.repositorio;

import com.portmainardi.jfm.entidad.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacePersonaRepositori extends JpaRepository<Persona,Integer>{
      public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
