package com.ncasanovas.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
@NoArgsConstructor
public class ResponseDTO {

    private String mensaje;


    public ResponseDTO(String mensaje) {
        this.mensaje = mensaje;
    }
}
