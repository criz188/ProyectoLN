package com.example.proyepln.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proyepln.DTO.AlumnosDTO;
import com.example.proyepln.entity.Alumnos;

@Repository
public interface AlumnosRepository extends JpaRepository <Alumnos, Integer> {
    @Query(value= "SELECT * FROM alumnos", nativeQuery = true)
    List<Alumnos>findAllAlumnos();

    @Query(value = "SELECT * FROM alumnos WHERE id_alumno = :alumno_id", nativeQuery = true)
    Alumnos findOneAlumno(@Param ("alumno_id") Integer alumno_id);


    //DTO REPOSITORY//
    /*@Query(value = "SELECT new com.example.p.DTO.AlumnosDTO(id_alumno, nombre, edad) FROM Alumnos")
    List<AlumnosDTO> findAllAlumnosDTO();*/

    @Query(value = "SELECT id_alumno, nombre, edad FROM Alumnos", nativeQuery = true)
    List<Object> findAllAlumnosObject();

}
