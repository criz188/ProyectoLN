package com.example.proyepln.service;

import java.util.List;

import com.example.proyepln.DTO.AlumnosDTO;
import com.example.proyepln.entity.Alumno_Grupo;
import com.example.proyepln.entity.Alumnos;

public interface ServiceAlumnos {
    //SERVICIO PARA LISTAR TODOS LOS ALUMNOS
    public List<Alumnos> listAllAlumnos();
    //SERVICIO PARA GUARDAR ALUMNOS
    public Alumnos saveAlumnos(Alumnos alumnos);

    public List<Alumno_Grupo> listAllAlumnosGrupos();

    public Alumnos findOneAlumnos (Integer id_alumno);

    //EJEMPLOS DTO//

    /*public List <AlumnosDTO> listarAlumnosDTO();
    
    public Alumnos saveAlumnosDTO (AlumnosDTO alumnos);*/

    public List<Object> listAObjects();
}
