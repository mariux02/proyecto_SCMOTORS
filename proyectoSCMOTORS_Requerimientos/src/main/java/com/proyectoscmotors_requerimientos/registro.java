/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoscmotors_requerimientos;

import javax.swing.JOptionPane;

public class registro {
    
    usuario x = new usuario();
    
    public static void datosInicioS(){
    
     String usuario =JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario: ");
     String contrasena= JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");
     
     JOptionPane.showMessageDialog(null,"Inicio de sesión exitoso");
    
    }//fin del metodo
    
    public static void datosRegistro(){
 
         JOptionPane.showMessageDialog(null,"Registro de usuario");
         String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo: ");
         String correo = JOptionPane.showInputDialog(null, "Ingrese su correo electrónico: ");
         int numero =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de teléfono: "));
         int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de cédula: "));
         
         String usuario = JOptionPane.showInputDialog(null, "Cree un nombre de usuario(Debe contar con un mínimo de 4 letras y un máximo de 8 letras): ");
         String contrasena = JOptionPane.showInputDialog(null, "Cree una contraseña(Debe contar con un mínimo de 4 letras y un máximo de 8 letras): ");
         
         
         usuario Usuario = new usuario(nombre, correo, numero, cedula, usuario, contrasena);
                 
         if(usuario.length() < 4){
             JOptionPane.showMessageDialog(null,"Nombre de usuario invalido" + "/nDebe contar con un mínimo de 4 letras y un máximo de 8 letras");
         }//fin del if
         else if (usuario.length() > 8){
             JOptionPane.showMessageDialog(null,"Nombre de usuario invalido" + "/nDebe contar con un mínimo de 4 letras y un máximo de 8 letras");
        
    }//fin del else if
         else{
             JOptionPane.showMessageDialog(null,"Nombre de usuario valido");
         }//fin del else
         
          if(contrasena.length() < 4){
             JOptionPane.showMessageDialog(null,"Contraseña invalida" + "\nDebe contar con un mínimo de 4 letras y un máximo de 8 letras");
         }//fin del if
         else if (contrasena.length() > 8){
             JOptionPane.showMessageDialog(null,"Contraseña invalida" + "\nDebe contar con un mínimo de 4 letras y un máximo de 8 letras");
        
    }//fin del else if
         else{
             JOptionPane.showMessageDialog(null,"Contraseña valida");
              JOptionPane.showMessageDialog(null,"Mostrando Datos de Registro" + "\nNombre: " + nombre 
              + "\nCorreo Electrónico: " + correo + "\nNúmero de Celular: " + numero + "\nNúmero de Cédula: " + cedula);
             
         }//fin del else
         
    }//fin del metodo
    
    
}
