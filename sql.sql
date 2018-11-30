CREATE DATABASE AplicacaoFinanceira;

USE AplicacaoFinanceira;

create table cliente (
codigo BIGINT not null auto_increment,
nome VARCHAR(255),
nasc DATE,
login VARCHAR(50),
senha VARCHAR(50),
primary key (codigo)
);
    
    create table titulo (
        codigo BIGINT not null auto_increment,
nome VARCHAR(255),
vencimento DATE,
valor NUMERIC(50),
taxaRendimento NUMERIC(50),
tipo VARCHAR(10),
primary key (codigo));