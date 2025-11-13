package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;

public class DepartamentDTO {

  private Long id;
  private String name;

  public DepartamentDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public DepartamentDTO(Department entity) {
    id = entity.getId();
    name = entity.getName();
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
