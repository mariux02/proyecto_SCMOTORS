package com.SCMOTORS.service.impl;

import com.SCMOTORS.dao.VehiculoDao;
import com.SCMOTORS.domain.Vehiculo;
import com.SCMOTORS.service.VehiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired//se conecta durectamente con este de abajo
    private VehiculoDao vehiculoDao;

    @Override
    @Transactional(readOnly = true)//dimplemente se lee lo que hay en la base de datos
    public List<Vehiculo> getVehiculos(boolean activos) {
        var lista = vehiculoDao.findAll();//obtenemos todos los objetos de la categoria de la base de datos
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Vehiculo getVehiculo(Vehiculo categoria) {
        return vehiculoDao.findById(categoria.getIdVehiculo()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Vehiculo categoria) {
        vehiculoDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Vehiculo categoria) {
        vehiculoDao.delete(categoria);
    }
}
