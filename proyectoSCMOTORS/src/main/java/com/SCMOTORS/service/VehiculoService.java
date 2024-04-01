package com.SCMOTORS.service;

import com.SCMOTORS.domain.Vehiculo;
import java.util.List;

public interface VehiculoService {
    
    // Se obtiene un listado de Vehiculo en un List
    public List<Vehiculo> getVehiculos(boolean activos);
    
   // Se obtiene un Vehiculo, a partir del id de un Vehiculo
    public Vehiculo getVehiculo(Vehiculo vehiculo);
    
    // Se inserta un nuevo Vehiculo si el id del Vehiculo esta vacío
    // Se actualiza un Vehiculo si el id del Vehiculo NO esta vacío
    public void save(Vehiculo vehiculo);
    
    // Se elimina el Vehiculo que tiene el id pasado por parámetro
    public void delete(Vehiculo vehiculo);
}