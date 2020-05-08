package com.toures.balon.configuracion.com.toures.balon.configuracion.persistencia.repositorio;

import com.toures.balon.configuracion.com.toures.balon.configuracion.persistencia.entidad.Configuracion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConfiguracionRepositorio extends CrudRepository<Configuracion,String> {
    List<Configuracion> findByTipo(String tipo);
}
