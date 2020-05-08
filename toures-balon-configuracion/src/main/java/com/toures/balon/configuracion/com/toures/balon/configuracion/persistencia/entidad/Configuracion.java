package com.toures.balon.configuracion.com.toures.balon.configuracion.persistencia.entidad;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("configuracion")
@Data
public class Configuracion implements Serializable {
    @Id
    private String id;
    private String tipo;
    private String valor;
    public Configuracion(){}
    public Configuracion(String id){
        this.id=id;
    }
}
