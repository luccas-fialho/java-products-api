# Simple CRUD API

Este projeto foi desenvolvido com propósitos educacionais para aprofundar os estudos na construção de APIs RESTful utilizando **Java** e **Spring Boot**. Trata-se de um CRUD simples para gerenciamento de produtos, com persistência de dados em memória.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.2.5**
- **Spring Data JPA** (Mapeamento Objeto-Relacional)
- **H2 Database** (Banco de dados em memória)
- **Lombok** (Redução de código boilerplate)

## Como Executar o Projeto

### Pré-requisitos
Certifique-se de ter instalado em sua máquina:
- Java 21
- Maven (ou utilize o wrapper `./mvnw` incluído no projeto)

### Passos para rodar
1. Clone este repositório:
```bash
git clone https://github.com/luccas-fialho/java-products-api.git
```

2. Navegue até o diretório do projeto:
```bash
cd java-products-api
```

3. Inicie a aplicação via Maven:
```bash
./mvnw spring-boot:run
```

A API estará disponível na porta padrão: `http://localhost:8080`.

Como o projeto utiliza o H2, você pode acessar o console do banco de dados pelo navegador acessando `http://localhost:8080/h2-console` (verifique as credenciais no arquivo `application.properties`).

## Endpoints da API

### `GET /produtos`
Retorna a lista de todos os produtos. Suporta a utilização de query params para buscas específicas.

### `POST /produtos`
Cria um novo produto.
- **Corpo da Requisição (JSON):**
```json
{
  "nome": "Notebook",
  "descricao": "Notebook Acer",
  "preco": 3500.00,
  "quantidade": 1
}
```

### `PUT /produtos/{id}`
Atualiza as informações de um produto existente com base no ID fornecido na URL.
- **Corpo da Requisição (JSON):**
```json
{
  "nome": "Notebook Atualizado",
  "descricao": "Notebook Asus",
  "preco": 3200.00,
  "quantidade": 1
}
```

### `DELETE /produtos/{id}`
Deleta um produto específico do banco de dados utilizando o ID fornecido.

## Autor

**Luccas Fialho dos Santos**
[LinkedIn](https://linkedin.com/in/luccas-fialho) | [GitHub](https://github.com/luccas-fialho)