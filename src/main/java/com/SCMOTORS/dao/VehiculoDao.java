package com.SCMOTORS.dao;

import com.SCMOTORS.domain.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoDao extends JpaRepository <Vehiculo, Long>{
    
}
