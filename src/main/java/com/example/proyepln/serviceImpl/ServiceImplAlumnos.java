package com.example.proyepln.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyepln.DTO.AlumnosDTO;
import com.example.proyepln.entity.Alumno_Grupo;
import com.example.proyepln.entity.Alumnos;
import com.example.proyepln.respository.Alumno_GrupoRepository;
import com.example.proyepln.respository.AlumnosRepository;
import com.example.proyepln.service.ServiceAlumnos;

@Service
@Transactional
public class ServiceImplAlumnos implements ServiceAlumnos {

    @Autowired
    private AlumnosRepository alumnosRepository;

    @Autowired
    private Alumno_GrupoRepository alumno_GrupoRepository;

    @Override
    public List<Alumnos> listAllAlumnos() {
        return alumnosRepository.findAllAlumnos();
    }

    @Override
    public Alumnos saveAlumnos(Alumnos alumnos) {
        return alumnosRepository.save(alumnos);
    }

    @Override
    public List<Alumno_Grupo> listAllAlumnosGrupos() {
        return alumno_GrupoRepository.findAll();
    }

    @Override
    public Alumnos findOneAlumnos(Integer id_alumno) {
        return alumnosRepository.findOneAlumno(id_alumno);
    }

    /* 
    @Override
    public List<AlumnosDTO> listarAlumnosDTO() {
        return alumnosRepository.findAllAlumnosDTO();
    }

    @Override
    public Alumnos saveAlumnosDTO(AlumnosDTO alumnos) {
        Alumnos a = new Alumnos();
        a.setNombre(alumnos.getNombre());
        a.setEdad((alumnos.getEdad()));

        return alumnosRepository.save(a);
    } */

    @Override
    public List<Object> listAObjects() {
        return alumnosRepository.findAllAlumnosObject();
    }

    
}
