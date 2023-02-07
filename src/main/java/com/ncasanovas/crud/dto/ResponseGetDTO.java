package com.ncasanovas.crud.dto;

import com.ncasanovas.crud.entity.PersonaEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseGetDTO extends ResponseDTO {

    private Optional<PersonaEntity> persona;


    public ResponseGetDTO(String mensaje, Optional<PersonaEntity> persona) {
        super(mensaje);
        this.persona = persona;

    }
}
