/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectoscmotors_requerimientos;

import javax.swing.JOptionPane;

public class ProyectoSCMOTORS_Requerimientos {

      public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"BIENVENIDOS A SC MOTORS" + "\nElija una opción para comenzar");
      int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Iniciar Sesión" + "\n2. Regístrate" + "\n3. Factura"+"\n4. Ventana Principal"+"\n5. Salir"));
      
      if(opcion == 1){
          registro.datosInicioS();
      }//fin del if
      else if(opcion == 2){
          registro.datosRegistro();
      }//fin del else if
      else if(opcion == 3){
          
          factura.generarFactura();
      }//fin del else if
      else if(opcion == 4){
          
        vehiculo vehiculoSeleccionado = new vehiculo("Rojo", "Toyota", 2022, 1234, "Corolla", 50000);
            new ventanaPrincipal(vehiculoSeleccionado);
      }//fin del else if
      else{
          System.exit(0);
      }//fin del else
 
    }//fin del main
    
}//fin de la clase

