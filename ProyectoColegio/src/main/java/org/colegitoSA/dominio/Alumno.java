package org.colegitoSA.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="alumnos")

public class Alumno implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigoAlumno")
    
    private int codigoAlumno;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @Column
    private String telefono;
    @Column
    private String codigoTecnico;
    @Column
    private String codigoAcademico;
    @Column
    private int edad;

    public Alumno() {
    }

    public Alumno(int codigoAlumno, String nombres, String apellidos, String telefono, String codigoTecnico, String codigoAcademico, int edad) {
        this.codigoAlumno = codigoAlumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.codigoTecnico = codigoTecnico;
        this.codigoAcademico = codigoAcademico;
        this.edad = edad;
    }

    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(int codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoTecnico() {
        return codigoTecnico;
    }

    public void setCodigoTecnico(String codigoTecnico) {
        this.codigoTecnico = codigoTecnico;
    }

    public String getCodigoAcademico() {
        return codigoAcademico;
    }

    public void setCodigoAcademico(String codigoAcademico) {
        this.codigoAcademico = codigoAcademico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoAlumno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if (this.codigoAlumno != other.codigoAlumno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigoAlumno=" + codigoAlumno + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", codigoTecnico=" + codigoTecnico + ", codigoAcademico=" + codigoAcademico + ", edad=" + edad + '}';
    }
        
    
    }
    

