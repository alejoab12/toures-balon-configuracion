package com.toures.balon.configuracion.controlador;

import com.toures.balon.configuracion.com.toures.balon.configuracion.persistencia.entidad.Configuracion;
import com.toures.balon.configuracion.servicio.ConfiguracionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/configuracion")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ConfiguracionControlador {
    @Autowired
    private ConfiguracionServicio configuracionServicio;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Configuracion> buscarPorId(@RequestParam String id) {
        return ResponseEntity.ok(configuracionServicio.buscarConfiguracionPorId(id));
    }
    @GetMapping( value ="/tipo",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Configuracion>> buscarPorTipo(@RequestParam String tipo) {
        return ResponseEntity.ok(configuracionServicio.buscarConfiguracionesPorTipo(tipo));
    }


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Void> crearConfiguracion(@RequestBody Configuracion configuracion) {
        configuracionServicio.crearConfiguracion(configuracion);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Void> actualizarConfiguracion(@RequestBody Configuracion configuracion) {
        configuracionServicio.actualizarConfiguracion(configuracion);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> eliminarConfiguracion(@RequestParam String id) {
        configuracionServicio.eliminarConfiguracion(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
