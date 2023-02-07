package com.ncasanovas.crud.dto;

import com.ncasanovas.crud.entity.PersonaEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseGetAllDTO extends ResponseDTO {

    private Iterable<PersonaEntity> personas;

     public ResponseGetAllDTO(String mensaje, Iterable<PersonaEntity> personas) {
        super(mensaje);
        this.personas = personas;
    }
}
