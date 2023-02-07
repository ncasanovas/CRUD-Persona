package com.ncasanovas.crud.service.impl;

import com.ncasanovas.crud.dto.Persona;
import com.ncasanovas.crud.dto.ResponseDTO;

public interface PersonaService {

    ResponseDTO guardarPersona(Persona persona);

    ResponseDTO getPersona(int numeroDeDocumento);

    ResponseDTO getPersonas();

    ResponseDTO actualizarPersona(int numeroDeDocumento, Persona persona);

    ResponseDTO borrarPersona(int numeroDeDocumento);

    ResponseDTO relacionarPersonasPadre(int nroDoc1, int nroDoc2);

    ResponseDTO relacionarPersonasHermano(int nroDoc1, int nroDoc2);

    ResponseDTO relacionarPersonasPrimo(int nroDoc1, int nroDoc2);

    ResponseDTO relacionarPersonasTio(int nroDoc1, int nroDoc2);

    ResponseDTO relaciones(int nroDoc1, int nroDoc2);
}
