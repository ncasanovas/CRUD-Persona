package com.ncasanovas.crud.repository;

import com.ncasanovas.crud.entity.PersonaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends CrudRepository<PersonaEntity, Integer> {

}
