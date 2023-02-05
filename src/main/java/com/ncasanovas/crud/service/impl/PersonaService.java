package com.ncasanovas.crud.service.impl;

import com.ncasanovas.crud.dto.Persona;
import com.ncasanovas.crud.dto.ResponseDTO;

public interface PersonaService {

    ResponseDTO guardarPersona(Persona persona);
    ResponseDTO getPersona(long numeroDeDocumento);

    ResponseDTO getPersonas();

    ResponseDTO actualizarPersona(long numeroDeDocumento, Persona persona);

    ResponseDTO borrarPersona(long numeroDeDocumento);

    ResponseDTO relacionarPersonasPadre(long nroDoc1, long nroDoc2);

    ResponseDTO relacionarPersonasHermano(long nroDoc1, long nroDoc2);

    ResponseDTO relacionarPersonasPrimo(long nroDoc1, long nroDoc2);

    ResponseDTO relacionarPersonasTio(long nroDoc1, long nroDoc2);

    ResponseDTO relaciones(long nroDoc1, long nroDoc2);
}
