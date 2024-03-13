
package com.proyectoscmotors_requerimientos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ventanaPrincipal extends JFrame implements ActionListener {
    
    JButton btnVerMetodosPago;
    JButton btnRequisitosCompra;
    JComboBox<String> cmbModelosVehiculos;
    JButton btnComprar;
    String[] modelosVehiculos = {"Toyota Corolla", "Honda Civic", "Toyota Padro"};
    vehiculo vehiculoSeleccionado;

    public ventanaPrincipal(vehiculo vehiculoSeleccionado) {
        super("Sistema de Compra de Vehículos");
        this.vehiculoSeleccionado = vehiculoSeleccionado;

        btnVerMetodosPago = new JButton("Ver métodos de pago");
        btnRequisitosCompra = new JButton("Requisitos de compra");
        cmbModelosVehiculos = new JComboBox<>(modelosVehiculos);
        btnComprar = new JButton("Comprar");

        btnVerMetodosPago.addActionListener(this);
        btnRequisitosCompra.addActionListener(this);
        btnComprar.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(btnVerMetodosPago);
        panel.add(btnRequisitosCompra);
        panel.add(new JLabel("Seleccione un modelo de vehículo: "));
        panel.add(cmbModelosVehiculos);
        panel.add(btnComprar);

        if (vehiculoSeleccionado != null) {
            cmbModelosVehiculos.setSelectedItem(vehiculoSeleccionado.getModelo());
        }

        add(panel);
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVerMetodosPago) {
            String[] metodosPago = {"Pago en línea", "Pago presencial", "Pagos correspondientes a la letra de cambios"};
            String metodoSeleccionado = (String) JOptionPane.showInputDialog(this, "Seleccione un método de pago: ", "Métodos de Pago", JOptionPane.PLAIN_MESSAGE, null, metodosPago, metodosPago[0]);
            if (metodoSeleccionado != null) {
                JOptionPane.showMessageDialog(this, "Ha seleccionado el método de pago: " + metodoSeleccionado);
            }
        } else if (e.getSource() == btnRequisitosCompra) {
            String requisitos = "Requisitos para la compra de vehículos:\n";
            requisitos += "- Toyota Corolla: Documentación personal, comprobante de ingresos\n";
            requisitos += "- Honda Civic: Documentación personal, comprobante de domicilio\n";
            requisitos += "- Toyota Prado: Documentación personal, aval bancario\n";
            JOptionPane.showMessageDialog(this, requisitos);
        } else if (e.getSource() == btnComprar) {
            String modeloSeleccionado = (String) cmbModelosVehiculos.getSelectedItem();
            String metodoPago = (String) JOptionPane.showInputDialog(this, "Seleccione un método de pago: ", "Métodos de Pago", JOptionPane.PLAIN_MESSAGE, null, null, null);
            if (metodoPago != null) {
                String nombreCliente = JOptionPane.showInputDialog(this, "Ingrese su nombre: ");
                String direccionCliente = JOptionPane.showInputDialog(this, "Ingrese su dirección: ");
                JOptionPane.showMessageDialog(this, "¡Gracias por su compra!," + nombreCliente + "!Ha adquirido un " + modeloSeleccionado + ".\nSe enviará a la dirección: " + direccionCliente + ".\nMétodo de pago seleccionado: " + metodoPago);
            }
        }
    }
}