/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portmainardi.jfm.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.*;

/**
 *
 * @author Facundo
 */
public class UsuarioPrincipal implements UserDetails{
  
    private int id;
    private String nombre;
    private String nombreUser;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public static UsuarioPrincipal build( Usuario usuario){
        List <GrantedAuthority> authorities = usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
        return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(),  usuario.getEmail(), usuario.getPassword(), authorities );
    }
    public UsuarioPrincipal(String nombre, String nombreUser, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.nombre = nombre;
        this.nombreUser = nombreUser;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public void setPassword(String password) {
        this.password = password;
        
    }
  
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
      return authorities;
    }

    @Override
    public String getPassword() {
      return password;
    }

    @Override
    public String getUsername() {
        return nombreUser;
    }

    @Override
    public boolean isAccountNonExpired() {
       return true;
    }

    @Override
    public boolean isAccountNonLocked() {
         return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
         return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
