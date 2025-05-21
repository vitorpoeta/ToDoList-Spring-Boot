# ✅ Sistema de Gerenciamento de Tarefas (To-Do List)

Este é um projeto simples de To-Do List desenvolvido com **Spring Boot**, utilizando persistência com **Spring Data JPA**. Ele permite aos usuários **criar, visualizar, editar e excluir tarefas** de maneira prática.

---

## 🛠 Tecnologias Utilizadas

- Java 17+ (ou superior)
- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database (banco em memória)
- Maven
- (Opcional) Thymeleaf para renderização de páginas

---

## 📦 Estrutura do Projeto

O projeto segue o padrão MVC, dividido em:

- `model` → contém a entidade `Tarefa`
- `repository` → interface que herda de `JpaRepository`
- `service` → contém a lógica de negócio
- `controller` → endpoints REST (atualmente está utilizando REST) ou com Thymeleaf

---

## 📋 Entidade Tarefa

```java
public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private boolean completa;
}
