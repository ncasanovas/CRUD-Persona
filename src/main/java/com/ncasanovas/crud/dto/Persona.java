package com.ncasanovas.crud.dto;

import com.ncasanovas.crud.enums.TipoDeDocumento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private long numeroDeDocumento;
    private TipoDeDocumento tipoDeDocumento;
    private String pais;
    private String datoDeContacto;

}
