CREATE DATABASE CADASTRO;
USE CADASTRO;

CREATE TABLE Usuario (
idUsuario int auto_increment primary key not null,
nome varchar(50) not null,
sobrenome varchar(50) not null,
dataNasc date not null,
documento varchar(15) not null unique, 
telefone varchar(20),
CEP int not null,
foreign key(CEP) references Endereco(CEP),
email varchar(50) not null,
user varchar(10) not null, 
senha varchar(20) not null
);

CREATE TABLE Endereco(
CEP int primary key not null unique,
rua varchar(50) not null,
numb int not null, 
bairro varchar(50) not null,
cidade varchar(20) not null, 
estado varchar(20) not null,
pais varchar(20) not null
);

SELECT * FROM Usuario;
SELECT * FROM Endereco;

ALTER TABLE Usuario ADD CONSTRAINT fk_endereco FOREIGN KEY (CEP) REFERENCES Endereco(CEP);

