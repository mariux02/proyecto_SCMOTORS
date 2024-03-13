/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoscmotors_requerimientos;

import java.awt.List;

public class usuario {
        
        private vehiculo[] carritoCompraVehiculo;
      
        public vehiculo[] getCarritoCompraVehiculo() {
        return carritoCompraVehiculo;
    }
        public void setCarritoCompraVehiculo(vehiculo[] carritoCompraVehiculo) {
        this.carritoCompraVehiculo = carritoCompraVehiculo;
    }
        private String nombre;
        private String correo;
        private int numero;
        private int cedula;
        private String usuario;
        private String contrasena;

    public usuario(String nombre, String correo, int numero, int cedula, String usuario, String contrasena) {
        this.carritoCompraVehiculo = null;
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
        this.cedula = cedula;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public usuario(){
    }
    
    @Override
    public String toString() {
        return "usuario{" + "carritoCompraVehiculo=" + carritoCompraVehiculo + ", nombre=" + nombre + ", correo=" + correo + ", numero=" + numero + ", cedula=" + cedula + '}';
    }     
}
