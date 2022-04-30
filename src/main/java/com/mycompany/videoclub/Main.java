/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.videoclub;


/**
@author Fabio Romero
 */
public class Main {
    public static void main(String[] args){
            Pelicula spiderman = new Pelicula();
            Categoria _Accion = new Categoria();
            spiderman.setNombre("Spiderman");
            spiderman.setAnioEstreno(1994);
            _Accion.setNombre("Accion");
            spiderman.setCategoria(_Accion);
            
            
            System.out.print(spiderman.toString());
   
    }

   
   
    
}
