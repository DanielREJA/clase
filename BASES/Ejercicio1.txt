DROP DATABASE IF EXISTS CLINICA_SALUD;

CREATE DATABASE CLINICA_SALUD;

USE CLINICA_SALUD;

CREATE TABLE Especialidades;
	cod_especialidad INTEGER(3) PRIMARY KEY,
	nombre_especialidad VARCHAR(50) NOT NULL,
	area_medica VARCHAR(30),
	disponible CHAR(1) DEFAULT 'S',
	CONSTRAINT ck_area_Especialidades CHECK (area_medica IN ('MEDICINA', 'GENERAL', 'CIRUGIA', 'PEDIATRIA', 'CARDIOLOGIA')),
	CONSTRAINT ck_disponible_Especialidades CHECK (disponible IN ('S', 'N')),
);

CREATE TABLE Medicos (
	num_colegiado VARCHAR(15) PRIMARY KEY,
	nombre VARCHAR(40) NOT NULL,
	apellidos VARCHAR(60) NOT NULL,
	telefono CHAR(12),
	email VARCHAR(80) NOT NULL,
	fecha_y_ahora_alta DATETIME DEFAULT NOW(),
	anos_experiencia INTEGER,
	cod_especialidad INTEGER(3),
	CONSTRAINT ck_anos_experiencia CHECK (anos_experiencia>= 0 AND anos_experiencia < 50),
	CONSTRAINT fk_cod_especialidad FOREIGN KEY (cod_especialidad) REFERENCES Especialidades (cod_especialidad) ON DELTE RESTRICT
);

CREATE TABLE Pacientes (
	num_historial INTEGER AUTO_INCREMENT PRIMARY KEY,
	dni CHAR(10) NOT NULL UNIQUE,
	nombre VARCHAR(40) NOT NULL,
	apellidos VARCHAR(60) NOT NULL,
	fecha_nacimiento DATE NOT NULL,
	grupo_sanguineo CHAR(3),
	alergias TEXT,
	telefono_contacto CHAR(12) NOT NULL,
	CONSTRAINT ck_grupo_sanguineo CHECK (grupo_sanguineo IN('A+', 'A-', 'B+', 'B-', 'AB+', 'AB-', '0+', '0-'))
);

	
CREATE TABLE Pacientes (
	num_historial INTEGER AUTO_INCREMENT PRIMARY KEY,
	dni CHAR(10) NOT NULL UNIQUE,
	nombre VARCHAR(40) NOT NULL,
	apellidos VARCHAR(60) NOT NULL,
	fecha_nacimiento DATE NOT NULL,
	grupo_sanguineo CHAR(3),
	alergias TEXT,
	telefono_contacto CHAR(12) NOT NULL,
	CONSTRAINT ck_grupo_sanguineo CHECK (grupo_sanguineo IN('A+', 'A-', 'B+', 'B-', 'AB+', 'AB-', '0+', '0-'))
);

--Ejercicio 6

INSERT INTO Especialidades VALUES(101, 'CARDIOLOGIA', 'CARDIOLOGIA', 'S');

-- Ejercicio 7
-- INSERT INTO Medicos (num_colegiado, nombre, apellidos, email, anos_experiencia, cod_especialidad) VALUES('28-4567890', 'Carlos', 'Fernandez Ruiz', 'cfernandez@clinica.es', 5 , 999);
-- Da error porque no tenemos ningun codigo de especialidad 999 creado.


-- Ejercicio 8
INSERT INTO Medicos (num_colegiado, nombre, apellidos, email, anos_experiencia, cod_especialidad) VALUES('28-4567890', 'Carlos', 'Fernandez Ruiz', 'cfernandez@clinica.es', 5 , 101);


-- Ejercicio 9
INSERT INTO Pacientes (dni, nombre, apellidos, fecha_nacimiento, grupo_sanguineo, telefono_contacto) VALUES('12345667A','Maria','Garcia Lopez','1990-05-15','A+',666777888);


-- Ejercicio 10
INSERT INTO Consultas (num_historial_paciente, num_colegiado_medico, precio, pagado) VALUES (1, '28-4567890', 75.50, 'N');





-- Ejercicio 12 
ALTER TABLE Medicos MODIFY email VARCHAR(100);


-- Ejercicio 13
ALTER TABLE Pacientes ADD mutua VARCHAR(50) DEFAULT 'PARTICULAR';

-- Ejercicio 14
ALTER TABLE Pacientes DROP alergias;

-- Ejercicio 15
ALTER TABLE consultas DROP CONSTRAINT ck_precio;
ALTER TABLE Consultas ADD CONSTRAINT ck_precio CHECK (precio < 1000);

-- Ejercicio 16
ALTER TABLE Medicos MODIFY email VARCHAR(100) UNIQUE;