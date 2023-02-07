package com.ncasanovas.crud.service;

import com.ncasanovas.crud.dto.*;
import com.ncasanovas.crud.entity.PersonaEntity;
import com.ncasanovas.crud.entity.RelacionEntity;

import com.ncasanovas.crud.repository.PersonaRepository;
import com.ncasanovas.crud.repository.RelacionRepository;
import com.ncasanovas.crud.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    public static final String OK_CREADO_MENSAJE = "Se creó correctamente la persona";
    public static final String NOT_OK_CREADO_MENSAJE = "No se creó correctamente la persona";
    public static final int NOT_OK_CREADO_CODIGO = 100;

    public static final String OK_GET_MENSAJE = "Persona consultada correctamente";
    public static final String NOT_OK_GET_MENSAJE = "No se consultó la persona correctamente";
    public static final int NOT_OK_GET_CODIGO = 300;

    public static final String OK_GET_ALL_MENSAJE = "Personsa consultadas correctamente";
    public static final String NOT_OK_GET_ALL_MENSAJE = "No se consultaron las personas correctamente";
    public static final int NOT_OK_GET_ALL_CODIGO = 600;

    public static final String OK_ACTUALIZAR_MENSAJE = "Persona actualizada correctamente";
    public static final String NOT_OK_ACTUALIZAR_MENSAJE = "Persona no actualizada correctamente";
    public static final int NOT_OK_ACTUALIZAR_CODIGO = 700;

    public static final String OK_BORRAR_MENSAJE = "Persona eliminada correctamente";
    public static final String NOT_OK_BORRAR_MENSAJE = "Persona no eliminada correctamente";
    public static final int NOT_OK_BORRAR_CODIGO = 800;

    public static final String NOT_OK_GUARDAR_RELACION_MENSAJE = "Relación no guardada correctamente";
    public static final int NOT_OK_GUARDAR_RELACION_CODIGO = 900;

    public static final String NOT_OK_OBTENER_RELACION_MENSAJE = "No se pudo obtener la relación correctamente";
    public static final int NOT_OK_OBTENER_RELACION_CODIGO = 998;

    public static final String NOT_OK_MENOR_MENSAJE = "No se creo la persona, es menor de 18 años";
    public static final int NOT_OK_MENOR_CODIGO = 999;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private RelacionRepository relacionRepository;


    @Override
    public ResponseDTO guardarPersona(Persona persona) {

        try {


           Optional<PersonaEntity> personaEntity = personaRepository.findById(persona.getNumeroDeDocumento());


            if (personaEntity.isPresent()){
                return ErrorDTO.builder().mensaje(NOT_OK_CREADO_MENSAJE).codigoError(NOT_OK_CREADO_CODIGO).build();
            } else if (persona.getEdad() >= 18){

                PersonaEntity personaEnt = new PersonaEntity(persona.getNumeroDeDocumento(),
                        persona.getTipoDeDocumento(),
                        persona.getPais(),
                        persona.getEdad(),
                        persona.getDatosDeContacto());
                personaRepository.save(personaEnt);
            } else if(persona.getNumeroDeDocumento() > 18) {
                return ErrorDTO.builder().mensaje(NOT_OK_MENOR_MENSAJE).codigoError(NOT_OK_MENOR_CODIGO).build();

            }
        } catch(Exception e){
            return ErrorDTO.builder().mensaje(NOT_OK_CREADO_MENSAJE).codigoError(NOT_OK_CREADO_CODIGO).build();
        }

        return ResponseDTO.builder().mensaje(OK_CREADO_MENSAJE).build();
    }

    @Override
    public ResponseDTO getPersona(int numeroDeDocumento) {
        Optional<PersonaEntity> persona;
        try {
             persona = personaRepository.findById(numeroDeDocumento);
        } catch(Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_GET_MENSAJE).codigoError(NOT_OK_GET_CODIGO).build();
        }

            return ResponseGetDTO.builder().mensaje(OK_GET_MENSAJE).persona(persona).build();
    }

    @Override
    public ResponseDTO getPersonas() {

        Iterable<PersonaEntity> personas;
        try {
            personas = personaRepository.findAll();
        } catch(Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_GET_ALL_MENSAJE).codigoError(NOT_OK_GET_ALL_CODIGO).build();
        }

        return ResponseGetAllDTO.builder().mensaje(OK_GET_ALL_MENSAJE).personas(personas).build();
    }


    @Override
    public ResponseDTO actualizarPersona(int numeroDeDocumento, Persona persona) {

        PersonaEntity personaEntity = new PersonaEntity(persona.getNumeroDeDocumento(),
                persona.getTipoDeDocumento(),
                persona.getPais(),
                persona.getEdad(),
                persona.getDatosDeContacto());

        try {
            Optional<PersonaEntity> personaEntity1 = personaRepository.findById(numeroDeDocumento);
            if(personaEntity1.isPresent()){
                personaRepository.save(personaEntity);
            }


        } catch (Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_ACTUALIZAR_MENSAJE).codigoError(NOT_OK_ACTUALIZAR_CODIGO).build();
        }

        return ResponseDTO.builder().mensaje(OK_ACTUALIZAR_MENSAJE).build();
    }

    @Override
    public ResponseDTO borrarPersona(int numeroDeDocumento) {

        try{
            personaRepository.deleteById(numeroDeDocumento);
        } catch(Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_BORRAR_MENSAJE).codigoError(NOT_OK_BORRAR_CODIGO).build();
        }
        return ResponseDTO.builder().mensaje(OK_BORRAR_MENSAJE).build();
    }

    @Override
    public ResponseDTO relacionarPersonasPadre(int nroDoc1, int nroDoc2) {

        RelacionEntity relacionEntity = new RelacionEntity(nroDoc1, nroDoc2, "PADRE");

        try {
            relacionRepository.save(relacionEntity);
        } catch(Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_GUARDAR_RELACION_MENSAJE).codigoError(NOT_OK_GUARDAR_RELACION_CODIGO).build();
        }

        return ResponseDTO.builder().mensaje(nroDoc1 + " es " + relacionEntity.getRelacion() + " de "+ nroDoc2).build();
    }

    @Override
    public ResponseDTO relacionarPersonasHermano(int nroDoc1, int nroDoc2) {


        RelacionEntity relacionEntity = new RelacionEntity(nroDoc1, nroDoc2, "HERMAN@");

        try {
            relacionRepository.save(relacionEntity);
        } catch(Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_GUARDAR_RELACION_MENSAJE).codigoError(NOT_OK_GUARDAR_RELACION_CODIGO).build();
        }

        return ResponseDTO.builder().mensaje(nroDoc1 + " es " + relacionEntity.getRelacion() + " de "+ nroDoc2).build();
    }

    @Override
    public ResponseDTO relacionarPersonasPrimo(int nroDoc1, int nroDoc2) {

        RelacionEntity relacionEntity = new RelacionEntity(nroDoc1, nroDoc2, "PRIM@");

        try {
            relacionRepository.save(relacionEntity);
        } catch(Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_GUARDAR_RELACION_MENSAJE).codigoError(NOT_OK_GUARDAR_RELACION_CODIGO).build();
        }

        return ResponseDTO.builder().mensaje(nroDoc1 + " es " + relacionEntity.getRelacion() + " de "+ nroDoc2).build();
    }

    @Override
    public ResponseDTO relacionarPersonasTio(int nroDoc1, int nroDoc2) {

        RelacionEntity relacionEntity = new RelacionEntity(nroDoc1, nroDoc2, "TI@");

        try {
            relacionRepository.save(relacionEntity);
        } catch(Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_GUARDAR_RELACION_MENSAJE).codigoError(NOT_OK_GUARDAR_RELACION_CODIGO).build();
        }

        return ResponseDTO.builder().mensaje(nroDoc1 + " es " + relacionEntity.getRelacion() + " de "+ nroDoc2).build();
    }

    @Override
    public ResponseDTO relaciones(int nroDoc1, int nroDoc2) {
        Optional<RelacionEntity> relacionEntity;
        try {
           relacionEntity = relacionRepository.findById(nroDoc1);


        } catch(Exception e) {
            return ErrorDTO.builder().mensaje(NOT_OK_OBTENER_RELACION_MENSAJE).codigoError(NOT_OK_OBTENER_RELACION_CODIGO).build();
        }

       /* if(relacionEntity.isPresent() && relacionEntity.get().getNumeroDeDocumento2() == nroDoc2) {


        }*/

        return ResponseDTO.builder().mensaje(nroDoc1 + " es " + relacionEntity.get().getRelacion() + " de "+ nroDoc2).build();
    }


}
