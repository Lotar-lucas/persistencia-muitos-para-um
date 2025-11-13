# Salvando Entidade Associada para Um

Este é um projeto de estudo focado em **salvar uma entidade associando-a a um relacionamento** utilizando Spring Boot e JPA/Hibernate.

**Exemplo prático:** Salvar uma `Person` associando-a a um `Department` existente.

## Objetivos de Aprendizado

- Compreender como salvar uma entidade associando-a a uma referência (usando `@ManyToOne`)
- Aprender a diferença entre usar `getReferenceById()` (objeto gerenciado pela JPA) versus criar uma nova instância apenas com o ID

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

