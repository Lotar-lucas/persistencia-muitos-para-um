package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDepartamentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  private final PersonRepository personRepository;
  private final DepartmentRepository departmentRepository;

  public PersonService(PersonRepository personRepository, DepartmentRepository departmentRepository) {
    this.personRepository = personRepository;
    this.departmentRepository = departmentRepository;
  }

  public PersonDepartamentDTO insert(PersonDepartamentDTO dto) {
    Person entity = new Person();
    entity.setName(dto.getName());
    entity.setSalary(dto.getSalary());

    //    Versão sem pegar o departamento do banco
    //    Department dept = new Department();
    //    dept.setId(dto.getDepartment().getId());

    //Objeto gerenciado pela JPA
    Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());
    entity.setDepartment(dept);

    entity = personRepository.save(entity);
    return new PersonDepartamentDTO(entity);
  }
}
