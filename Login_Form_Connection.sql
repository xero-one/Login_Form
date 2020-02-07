DROP {DATABASE | SCHEMA} [ IF EXISTS] Login_Form_Connection;

CREATE DATABASE Login_Form_Connection;
USE Login_Form_Connection;

CREATE Table User_Credentials (
id INTEGER(11) AUTO_INCREMENT NOT NULL,
username VARCHAR(100) NOT NULL,
pass VARCHAR(100) NOT NULL
);