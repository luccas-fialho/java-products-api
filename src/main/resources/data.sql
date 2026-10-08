CREATE TABLE produto (
    id VARCHAR(255) NOT NULL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(300),
    preco numeric(18, 2),
    quantidade numeric(5)
);