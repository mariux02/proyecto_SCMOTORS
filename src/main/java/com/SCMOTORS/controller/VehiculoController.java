package com.SCMOTORS.controller;

import com.SCMOTORS.domain.Vehiculo;
import com.SCMOTORS.service.VehiculoService;
import com.SCMOTORS.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("/listado")
    private String listado(Model model) {
        var vehiculos = vehiculoService.getVehiculos(false);
        model.addAttribute("vehiculos", vehiculos);
        model.addAttribute("totalVehiculos", vehiculos.size());
        return "/vehiculo/listado";
    }

    @GetMapping("/nuevo")
    public String vehiculoNuevo(Vehiculo vehiculo) {
        return "/vehiculo/modifica";
    }

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;

    @PostMapping("/guardar")
    public String vehiculoGuardar(Vehiculo vehiculo) {
        vehiculoService.save(vehiculo);
        return "redirect:/vehiculo/listado";
    }

    @GetMapping("/eliminar/{idVehiculo}")
    public String vehiculoEliminar(Vehiculo vehiculo) {
        vehiculoService.delete(vehiculo);
        return "redirect:/vehiculo/listado";
    }

    @GetMapping("/modificar/{idVehiculo}")
    public String vehiculoModificar(Vehiculo vehiculo, Model model) {
        vehiculo = vehiculoService.getVehiculo(vehiculo);
        model.addAttribute("vehiculo", vehiculo);
        return "/vehiculo/modifica";
    }
}
