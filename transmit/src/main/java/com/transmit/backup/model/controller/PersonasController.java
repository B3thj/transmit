package com.transmit.backup.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.transmit.backup.model.PersonasDTO;
import com.transmit.backup.model.repository.PersonasRepository;

public class PersonasController {

	@Autowired
	private PersonasRepository personasRepo;
	
	@GetMapping("/todos")
	public ResponseEntity <?> getAllTodos() {
		List<PersonasDTO> todos = personasRepo.findAll();
		if(todos.size() > 0) {
			return new ResponseEntity <List<PersonasDTO>> (todos, HttpStatus.OK);
		}else {
			return new ResponseEntity<>("No available dats ", HttpStatus.NOT_FOUND);
		}
	}
}
