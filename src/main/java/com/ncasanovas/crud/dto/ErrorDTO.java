package com.ncasanovas.crud.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDTO extends ResponseDTO {

    private int codigoError;


    public ErrorDTO(String mensaje, int codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }
}
