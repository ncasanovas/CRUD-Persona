package com.ncasanovas.crud.dto;

import com.ncasanovas.crud.entity.PersonaEntity;
import lombok.Builder;

import java.util.Optional;

public class ResponseGetDTO extends  ResponseDTO {

    private Optional<PersonaEntity> persona;

    @Builder
    public ResponseGetDTO(String mensaje, Optional<PersonaEntity> persona) {
        super(mensaje);
        this.persona = persona;

    }
}
