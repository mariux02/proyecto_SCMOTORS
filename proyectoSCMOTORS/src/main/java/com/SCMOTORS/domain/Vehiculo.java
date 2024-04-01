package com.SCMOTORS.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data​
@Entity​
@Table(name="vehiculo")
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id​
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Long idVehiculo;
    private String marca;
    private String modelo;
    private int year;
    private double precio;
    private String estado;

    public Vehiculo() {
    }

    public Vehiculo(Long idvehiculo, String marca, String modelo, int year, double precio, String estado) {
        this.idVehiculo = idvehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.estado = estado;
    }
}
