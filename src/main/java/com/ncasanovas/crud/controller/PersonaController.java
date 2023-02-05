package com.ncasanovas.crud.controller;

import com.ncasanovas.crud.dto.Persona;
import com.ncasanovas.crud.dto.ResponseDTO;
import com.ncasanovas.crud.service.impl.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonaController {

    PersonaService personaService;

    @RequestMapping(value= "/personas", method = RequestMethod.POST)
    public ResponseEntity<Object> guardarPersona(@RequestBody Persona persona) {

        ResponseDTO responseDTO = personaService.guardarPersona(persona);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    @RequestMapping(value = "/personas/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getPersona(@PathVariable("id") long nroDoc) {

        ResponseDTO responseDTO = personaService.getPersona(nroDoc);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    @RequestMapping(value = "/personas", method = RequestMethod.GET)
    public ResponseEntity<Object> getPersonas() {

        ResponseDTO responseDTO = personaService.getPersonas();

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    @RequestMapping(value = "/personas/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> actualizarPersona(@PathVariable("id") long nroDoc, @RequestBody Persona persona) {

        ResponseDTO responseDTO = personaService.actualizarPersona(nroDoc, persona);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    public ResponseEntity<Object> borrarPersona(@PathVariable("id") long nroDoc) {

        ResponseDTO responseDTO = personaService.borrarPersona(nroDoc);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @RequestMapping(value= "/personas/{id1}/padre/{id2}", method = RequestMethod.POST)
    public ResponseEntity<Object> relacionarPersonasPadre(@PathVariable("id1") long nroDoc1,
                                                     @PathVariable("id2") long nroDoc2) {

        ResponseDTO responseDTO = personaService.relacionarPersonasPadre(nroDoc1, nroDoc2);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    @RequestMapping(value= "/personas/{id1}/hermano/{id2}", method = RequestMethod.POST)
    public ResponseEntity<Object> relacionarPersonasHermano(@PathVariable("id1") long nroDoc1,
                                                          @PathVariable("id2") long nroDoc2) {

        ResponseDTO responseDTO = personaService.relacionarPersonasHermano(nroDoc1, nroDoc2);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    @RequestMapping(value= "/personas/{id1}/primo/{id2}", method = RequestMethod.POST)
    public ResponseEntity<Object> relacionarPersonasPrimo(@PathVariable("id1") long nroDoc1,
                                                            @PathVariable("id2") long nroDoc2) {

        ResponseDTO responseDTO = personaService.relacionarPersonasPrimo(nroDoc1, nroDoc2);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    @RequestMapping(value= "/personas/{id1}/tio/{id2}", method = RequestMethod.POST)
    public ResponseEntity<Object> relacionarPersonasTio(@PathVariable("id1") long nroDoc1,
                                                            @PathVariable("id2") long nroDoc2) {

        ResponseDTO responseDTO = personaService.relacionarPersonasTio(nroDoc1, nroDoc2);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    @RequestMapping(value= "/relaciones/{id1}/{id2}", method = RequestMethod.GET)
    public ResponseEntity<Object> getRelaciones(@PathVariable("id1") long nroDoc1,
                                                @PathVariable("id2") long nroDoc2) {

        ResponseDTO responseDTO = personaService.relaciones(nroDoc1, nroDoc2);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

}
