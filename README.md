### CardapioWeb API

Este projeto é uma API simples projetada para gerenciar itens de cardápio. Ele fornece endpoints para operações de CRUD em itens de comida. Abaixo está uma visão geral do projeto e de seus endpoints.

---

### Endpoints

- **GET /foods**
  - Recupera a lista de todos os itens de comida.
  
- **GET /foods/id**
  - Recupera um item de comida específico pelo seu ID.
  
- **POST /foods**
  - Cria um novo item de comida.
  
- **PUT /foods/id**
  - Atualiza um item de comida existente.
  
- **DELETE /foods/id**
  - Exclui um item de comida pelo seu ID.
  
---

### Instalação e Configuração

Para configurar e executar este projeto localmente, siga estes passos:

1. **Clone o repositório:**
  git clone https://github.com/HagathaSilva/cardapioweb.git

2. **Navegue até o diretório do projeto:**
  cd cardapioweb

3. **Construa o projeto:**
  mvn clean install

4. **Execute o projeto:**
  mvn spring-boot:run

5. **Acesse a API:**
  http://localhost:8080/foods

---

### Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Maven

---

### Autor

  [Hagatha Silva](https://github.com/HagathaSilva)

---
