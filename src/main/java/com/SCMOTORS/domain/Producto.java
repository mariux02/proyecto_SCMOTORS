package com.SCMOTORS.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="vehiculo")
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    private String marca;
    private String modelo;
    private double precio;
    private String año;
    private String estado;


    public Producto() {
    }

    public Producto(String descripcion, String modelo) {
        this.marca = descripcion;
        this.modelo = modelo;
    }
    
}
