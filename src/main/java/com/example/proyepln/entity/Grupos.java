package com.example.proyepln.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "grupos")
public class Grupos {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id_grupo;
    private String des;
    private String turno;

    public Grupos(){
        super();
    }

    public Grupos(Integer id_grupo, String des, String turno) {
        this.id_grupo = id_grupo;
        this.des = des;
        this.turno = turno;
    }

    public Integer getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(Integer id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
}
