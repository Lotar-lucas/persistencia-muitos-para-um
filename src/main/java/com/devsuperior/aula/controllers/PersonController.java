package com.devsuperior.aula.controllers;

import com.devsuperior.aula.dto.PersonDTO;
import com.devsuperior.aula.dto.PersonDepartamentDTO;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.services.PersonService;
import jakarta.servlet.Servlet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/people")
public class PersonController {

  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  @PostMapping(value = "/departament")
  public ResponseEntity<PersonDepartamentDTO> insert(@RequestBody PersonDepartamentDTO dto) {

    dto = personService.insert(dto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();

    return ResponseEntity.created(uri).body(dto);
  }

  @PostMapping(value = "departmentId" )
  public ResponseEntity<PersonDTO> insert(@RequestBody PersonDTO dto) {

    dto = personService.insert(dto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();

    return ResponseEntity.created(uri).body(dto);
  }
}
