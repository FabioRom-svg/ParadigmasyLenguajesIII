/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.videoclub;

/**
@author Fabio Romero
 */
public class Videoclub {

   private String nombre;
   private Integer cantidadSocios;
   private Integer cantidadUsuarios;
   private Integer cantidadPeliculas;

   public void pedirPeliculas(){}   
   public void CatalogoGestionar(){}
   public void UsuariosGestionar(){}
   public void SociosGestionar(){}
   
    public Integer getCantidadSocios() {
        return cantidadSocios;
    }

    public void setCantidadSocios(Integer cantidadSocios) {
        this.cantidadSocios = cantidadSocios;
    }

    public Integer getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuarios(Integer cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
    }

    public Integer getCantidadPeliculas() {
        return cantidadPeliculas;
    }

    public void setCantidadPeliculas(Integer cantidadPeliculas) {
        this.cantidadPeliculas = cantidadPeliculas;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
