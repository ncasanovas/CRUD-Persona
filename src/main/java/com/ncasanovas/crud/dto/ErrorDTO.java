package com.ncasanovas.crud.dto;

import lombok.Builder;
import lombok.Data;

public class ErrorDTO extends ResponseDTO {


    private int codigoError;
    @Builder
    public ErrorDTO(String mensaje, int codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }
}
