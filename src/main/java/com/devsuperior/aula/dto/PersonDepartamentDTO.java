package com.devsuperior.aula.dto;


// DTO para receber o formato
//  {
//    "name": "Nova Pessoa",
//    "salary": 8000.0,
//    "department": {
//    "id": 1
//  }

import com.devsuperior.aula.entities.Person;

public class PersonDepartamentDTO {

  private Long id;
  private String name;
  private Double salary;

  private DepartamentDTO department;

  public PersonDepartamentDTO(Long id, String name, Double salary, DepartamentDTO department) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.department = department;
  }

  public PersonDepartamentDTO(Person entity) {
    id = entity.getId();
    name = entity.getName();
    salary = entity.getSalary();
    department = new DepartamentDTO(entity.getDepartment());
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getSalary() {
    return salary;
  }

  public DepartamentDTO getDepartment() {
    return department;
  }
}
