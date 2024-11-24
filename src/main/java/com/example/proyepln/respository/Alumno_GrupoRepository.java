package com.example.proyepln.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyepln.entity.Alumno_Grupo;

@Repository
public interface Alumno_GrupoRepository extends JpaRepository<Alumno_Grupo, Integer> {

}
