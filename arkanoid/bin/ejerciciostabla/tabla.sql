SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Cursan;
DROP TABLE IF EXISTS Hacen;
DROP TABLE IF EXISTS Realizan;
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Asignaturas;
DROP TABLE IF EXISTS Elaboran;
DROP TABLE IF EXISTS Examenes;
DROP TABLE IF EXISTS Practicas;
DROP TABLE IF EXISTS Profesores;




/* Create Tables */

CREATE TABLE Alumnos
(
	Num_al bigint NOT NULL,
	Nombre varchar(20) NOT NULL,
	Grupo varchar(5) NOT NULL,
	PRIMARY KEY (Num_al),
	UNIQUE (Num_al)
);


CREATE TABLE Asignaturas
(
	Num_asig binary(5) NOT NULL,
	Nombre varchar(20) NOT NULL,
	Num_profe binary(3) NOT NULL,
	PRIMARY KEY (Num_asig)
);


CREATE TABLE Cursan
(
	Num_al bigint NOT NULL,
	Num_asig binary(5) NOT NULL,
	Trimestre bit(2) NOT NULL,
	UNIQUE (Num_al)
);


CREATE TABLE Elaboran
(
	Cod_practica int(3) NOT NULL,
	Num_profe binary(3) NOT NULL,
	Fecha date NOT NULL
);


CREATE TABLE Examenes
(
	Num_exam bigint(5) NOT NULL,
	Preguntas bigint(20) NOT NULL,
	Fecha date NOT NULL,
	PRIMARY KEY (Num_exam),
	UNIQUE (Num_exam)
);


CREATE TABLE Hacen
(
	Num_al bigint NOT NULL,
	Num_exam bigint(5) NOT NULL,
	Nota bigint(3) NOT NULL,
	UNIQUE (Num_al),
	UNIQUE (Num_exam)
);


CREATE TABLE Practicas
(
	Cod_practica int(3) NOT NULL,
	Titulo bigint(20) NOT NULL,
	Nivel varchar(20) NOT NULL,
	PRIMARY KEY (Cod_practica)
);


CREATE TABLE Profesores
(
	Num_profe binary(3) NOT NULL,
	Nombre varchar(20) NOT NULL,
	PRIMARY KEY (Num_profe)
);


CREATE TABLE Realizan
(
	Num_al bigint NOT NULL,
	Cod_practica int(3) NOT NULL,
	Fecha date NOT NULL,
	Nota bigint(3) NOT NULL,
	UNIQUE (Num_al)
);



/* Create Foreign Keys */

ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_al)
	REFERENCES Alumnos (Num_al)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_al)
	REFERENCES Alumnos (Num_al)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Num_al)
	REFERENCES Alumnos (Num_al)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_asig)
	REFERENCES Asignaturas (Num_asig)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_exam)
	REFERENCES Examenes (Num_exam)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Cod_practica)
	REFERENCES Practicas (Cod_practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Cod_practica)
	REFERENCES Practicas (Cod_practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Asignaturas
	ADD FOREIGN KEY (Num_profe)
	REFERENCES Profesores (Num_profe)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Num_profe)
	REFERENCES Profesores (Num_profe)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



