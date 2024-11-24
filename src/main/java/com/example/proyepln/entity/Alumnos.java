package com.example.proyepln.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "alumnos")
@Entity
public class Alumnos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_alumno;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private Integer edad;
    private String genero;

    public Alumnos(){
        super();
    }
    
    public Alumnos(Integer id_alumno, String nombre, String apellido_parterno, String apellido_materno, Integer edad,
            String genero) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido_paterno = apellido_parterno;
        this.apellido_materno = apellido_materno;
        this.edad = edad;
        this.genero = genero;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_parterno) {
        this.apellido_paterno = apellido_parterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
