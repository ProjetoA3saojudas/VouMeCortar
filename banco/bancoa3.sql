CREATE DATABASE bancoA3;

USE bancoA3;

CREATE TABLE cadastrousuario(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
email VARCHAR(100),
senha VARCHAR(100),
tipousuario VARCHAR(100)	
);


SELECT * FROM cadastrousuario;

CREATE TABLE produtos(
idP INT PRIMARY KEY AUTO_INCREMENT,
produtoP VARCHAR (100),
precoP VARCHAR (100),
descricaoP VARCHAR (900)
);

SELECT * FROM produtos;
