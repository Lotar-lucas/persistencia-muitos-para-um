# Projeto de Estudo - Persistência Muitos-para-Um

Este projeto é um projeto de estudo focado em **persistência de relacionamento muitos-para-um** utilizando Spring Boot e JPA/Hibernate.

## Objetivos de Aprendizado

- Compreender como implementar e persistir relacionamentos muitos-para-um (many-to-one) entre entidades JPA
- Aprender as melhores práticas para salvar entidades relacionadas, incluindo o uso de objetos gerenciados pela JPA versus criação de novas instâncias

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (para testes)

## Estrutura do Projeto

O projeto contém:
- **Entidades**: `Person` e `Department` com relacionamento muitos-para-um
- **Repositórios**: Interfaces JPA para acesso aos dados
- **Serviços**: Lógica de negócio para persistência
- **Controllers**: Endpoints REST para operações CRUD
- **DTOs**: Objetos de transferência de dados

