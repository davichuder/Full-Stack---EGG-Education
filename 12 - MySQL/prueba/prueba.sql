-- Active: 1665100819101@@localhost@3306@jardineria
CREATE DATABASE IF NOT EXISTS prueba;

USE prueba;

CREATE TABLE IF NOT EXISTS personas(
    documento INT(8) NOT NULL PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    apellido VARCHAR(20) NOT NULL,
    vivo BOOLEAN NOT NULL,
    edad INT(3) NOT NULL,
    comentarios VARCHAR(255),
    altura FLOAT);

SELECT * FROM personas;

INSERT INTO personas VALUES (123, 'david', 'rolon', true, 27, 'estoy enseñando', 1.81);

SELECT * FROM personas;

INSERT INTO personas VALUES (124, 'david', 'rolon', true, 27, 'estoy enseñando', 1.81);
INSERT INTO personas VALUES (125, 'david', 'rolon', 3, 27, 'estoy enseñando', 1.81);
SELECT * FROM personas;

INSERT INTO personas VALUES (126, 'david', 'rolon', 3, 27, 'estoy enseñando', 1.81);
SELECT * FROM personas;

DROP DATABASE IF EXISTS prueba;

CREATE DATABASE csv;

CREATE TABLE archivo(
    columna1 FLOAT,
    columna2 FLOAT,
    columna3 FLOAT
);

USE csv;

LOAD DATA INFILE 'D:\Descargas/heikin_ashi_normalizados.csv'
INTO TABLE archivo
FIELDS TERMINATED BY ',' 
ENCLOSED BY ''
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

SHOW VARIABLES LIKE 'secure_file_priv';

SELECT columna3 FROM archivo WHERE columna1 > columna2;

USE jardineria;

SELECT * FROM cliente;

SELECT * FROM pedido;

SELECT tabla1.nombre_cliente as 'Nombre Completo', tabla2.codigo_pedido as 'Codigo de pedido', tabla2.estado
FROM cliente as tabla1
INNER JOIN pedido as tabla2
ON tabla1.codigo_cliente = tabla2.codigo_cliente
WHERE tabla2.codigo_pedido = 8;