/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;

/**
@author Fabio Romero
 */
public class Pedido {
    private Integer pedido_num;
    private Usuario user;
    private Pelicula pelicula;
    private Tarjeta tarjeta;

    public Integer getPedido_Num() {
        return pedido_num;
    }

    public void setNumPedido(Integer numPedido) {
        this.pedido_num = numPedido;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
}