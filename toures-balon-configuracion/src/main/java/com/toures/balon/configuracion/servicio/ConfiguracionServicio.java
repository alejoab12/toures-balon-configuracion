package com.toures.balon.configuracion.servicio;

import com.toures.balon.configuracion.com.toures.balon.configuracion.persistencia.entidad.Configuracion;

import java.lang.module.Configuration;
import java.util.List;

public interface ConfiguracionServicio {

    Configuracion buscarConfiguracionPorId(String id);

    List<Configuracion> buscarConfiguracionesPorTipo(String tipo);

    void crearConfiguracion(Configuracion configuracion);

    void actualizarConfiguracion(Configuracion configuracion);

    void eliminarConfiguracion(String id);
}
