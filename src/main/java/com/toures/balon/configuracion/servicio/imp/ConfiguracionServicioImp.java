package com.toures.balon.configuracion.servicio.imp;

import com.toures.balon.configuracion.com.toures.balon.configuracion.persistencia.entidad.Configuracion;
import com.toures.balon.configuracion.com.toures.balon.configuracion.persistencia.repositorio.ConfiguracionRepositorio;
import com.toures.balon.configuracion.servicio.ConfiguracionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfiguracionServicioImp implements ConfiguracionServicio {
    @Autowired
    private ConfiguracionRepositorio configuracionRepositorio;
    @Override
    public Configuracion buscarConfiguracionPorId(String id) {
        return configuracionRepositorio.findById(id).get();
    }

    @Override
    public List<Configuracion> buscarConfiguracionesPorTipo(String tipo) {
        return configuracionRepositorio.findByTipo(tipo);
    }

    @Override
    public void crearConfiguracion(Configuracion configuracion) {
        configuracionRepositorio.save(configuracion);
    }

    @Override
    public void actualizarConfiguracion(Configuracion configuracion) {
        configuracionRepositorio.save(configuracion);
    }

    @Override
    public void eliminarConfiguracion(String id) {
        configuracionRepositorio.delete(new Configuracion(id));
    }
}
