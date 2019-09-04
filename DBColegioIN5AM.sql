CREATE DATABASE DBColegioIN5AM;
USE DBColegioIN5AM;

CREATE TABLE Alumnos(
	codigoAlumno INT AUTO_INCREMENT NOT NULL,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    telefono VARCHAR(25) NOT NULL,
    codigoTecnico VARCHAR(25) NOT NULL,
    codigoAcademico VARCHAR(25) NOT NULL,
    edad INT NOT NULL,
    PRIMARY KEY PK_codigoAlumno(codigoAlumno)
);

