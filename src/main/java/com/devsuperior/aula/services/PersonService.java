package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDTO;
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

  /**
   * Método que persiste relação para um com o body da requisição no formato:
   * {
   *  "name": "Nova Pessoa",
   *  "salary": 8000.0,
   *  "department": {
   *  "id": 1
   *  }
   * }
   * @param dto
   * @return
   */
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

  /**
   * Método que persiste relação para um com o body da requisição no formato:
   * {
   *  "name": "Nova Pessoa",
   *  "salary": 8000.0,
   *  "departmentId":  1
   * }
   * @param dto
   * @return
   */
  public PersonDTO insert(PersonDTO dto) {
    Person entity = new Person();
    entity.setName(dto.getName());
    entity.setSalary(dto.getSalary());

    Department dept = departmentRepository.getReferenceById(dto.getDepartmentId());
    entity.setDepartment(dept);

    entity = personRepository.save(entity);
    return new PersonDTO(entity);
  }
}
