/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;

/**
@author Fabio Romero
 */
public class Socio extends Usuario {
    private Integer Socio_num;
    private Integer idTarjeta;

    public void alquilarPeliculas(){}
    public void comprarPeliculas(){}
    
    public Integer getSocio_Num() {
        return Socio_num;
    }

    public void setNumSocio(Integer Socio_num) {
        this.Socio_num = Socio_num;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
    
}

