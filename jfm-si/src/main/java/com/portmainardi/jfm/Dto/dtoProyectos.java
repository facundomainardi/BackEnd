/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portmainardi.jfm.Dto;

/**
 *
 * @author Facundo
 */
import javax.validation.constraints.NotBlank;

public class dtoProyectos {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
     @NotBlank
    private String img;

   
    

    public dtoProyectos(String nombreE, String descripcionE, String img) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.img = img;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
}