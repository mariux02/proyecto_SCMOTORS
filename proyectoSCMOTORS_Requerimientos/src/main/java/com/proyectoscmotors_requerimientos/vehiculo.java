/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoscmotors_requerimientos;

public class vehiculo {
    private String color;
    private String marca;
    private int anio;
    private int placa;
    private String modelo;
    private int kilometraje;
    private int Cedulacliente;

    public vehiculo(String color, String marca, int anio, int placa, String modelo, int kilometraje) {
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.placa = placa;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public vehiculo() {
    }

    public void setCedulacliente(int Cedulacliente) {
        this.Cedulacliente = Cedulacliente;
    }

    public int getCedulacliente() {
        return Cedulacliente;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getPlaca() {
        return placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "color=" + color + ", marca=" + marca + ", anio=" + anio + ", placa=" + placa + ", modelo=" + modelo + ", kilometraje=" + kilometraje + ", Cedulacliente=" + Cedulacliente + '}';
    }
}
