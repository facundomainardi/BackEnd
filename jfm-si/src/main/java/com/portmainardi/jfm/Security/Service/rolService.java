/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portmainardi.jfm.Security.Service;

import com.portmainardi.jfm.Security.Entity.Rol;
import com.portmainardi.jfm.Security.Enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portmainardi.jfm.Security.Repository.iRolRepository;

/**
 *
 * @author Facundo
 */
@Service
@Transactional
public class rolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
      return irolRepository.findByRolNombre(rolNombre);
    }
   public void save( Rol rol){
       irolRepository.save(rol);
   }
}
