package com.ncasanovas.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private Integer numeroDeDocumento;
    private String tipoDeDocumento;
    private String pais;
    private Integer edad;
    private String datosDeContacto;

}
