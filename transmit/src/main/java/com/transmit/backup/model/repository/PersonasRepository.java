package com.transmit.backup.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.transmit.backup.model.PersonasDTO;

public interface PersonasRepository extends MongoRepository<PersonasDTO, String> {

}
