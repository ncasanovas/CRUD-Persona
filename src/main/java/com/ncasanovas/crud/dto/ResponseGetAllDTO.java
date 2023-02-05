package com.ncasanovas.crud.dto;

import com.ncasanovas.crud.entity.PersonaEntity;
import lombok.Builder;

public class ResponseGetAllDTO extends ResponseDTO {

    private Iterable<PersonaEntity> personas;
    @Builder
     public ResponseGetAllDTO(String mensaje, Iterable<PersonaEntity> personas) {
        super(mensaje);
        this.personas = personas;
    }
}
