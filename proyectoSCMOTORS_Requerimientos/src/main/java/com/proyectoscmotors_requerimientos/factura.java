/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoscmotors_requerimientos;

import javax.swing.JOptionPane;

public class factura  {
    
    
    private static final String nombreEmpresa = "SC MOTORS";
    private static final String direccionEmpresa = "Calle Principal, Ciudad";
    private static final String telefonoEmpresa = "+1234567890";
    private static final String correoEmpresa = "info@SCmotors.com";

 public static void generarFactura() {
        StringBuilder factura = new StringBuilder();
        factura.append("** Factura **\n\n");
        factura.append("Datos de la empresa:\n");
        factura.append("Nombre: ").append(nombreEmpresa).append("\n");
        factura.append("Dirección: ").append(direccionEmpresa).append("\n");
        factura.append("Teléfono: ").append(telefonoEmpresa).append("\n");
        factura.append("Email: ").append(correoEmpresa).append("\n\n");
        /*
        factura.append("Datos del cliente:\n");
        factura.append("Nombre: ").append(nombre).append("\n");
        factura.append("Correo Electrónico: ").append(correo).append("\n\n");
        factura.append("Número de Celular: ").append(numero).append("\n");
        factura.append("Número de Cédula: ").append(cedula).append("\n");
        factura.append("Detalle de Compra:\n");
        */
        JOptionPane.showMessageDialog(null, factura.toString(), "Factura", JOptionPane.INFORMATION_MESSAGE);
      
}//fin del metodo
}
