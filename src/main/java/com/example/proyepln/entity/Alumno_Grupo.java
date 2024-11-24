package com.example.proyepln.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alumno_grupo")
public class Alumno_Grupo implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id_alumno;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="alumnos_id")
    private Alumnos alumnos;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="grupos_id")
    private Grupos grupos_id;

    private Integer estatus;

    public Alumno_Grupo(){
        super();
    }

    public Alumno_Grupo(Integer id_alumno, Alumnos alumnos, Grupos grupos_id, Integer estatus) {
        this.id_alumno = id_alumno;
        this.alumnos = alumnos;
        this.grupos_id = grupos_id;
        this.estatus = estatus;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    public Grupos getGrupos_id() {
        return grupos_id;
    }

    public void setGrupos_id(Grupos grupos_id) {
        this.grupos_id = grupos_id;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }



    
    

    
}
