package com.example.proyepln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyepln.DTO.AlumnosDTO;
import com.example.proyepln.entity.Alumno_Grupo;
import com.example.proyepln.entity.Alumnos;
import com.example.proyepln.service.ServiceAlumnos;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/alumnos")
public class ControllerAlumnos {
    @Autowired
    private ServiceAlumnos alumnosService;

    @GetMapping("/listarAlumnos")
    public ResponseEntity<List<Alumnos>>getAllUsuarios(){
        try{
            List<Alumnos>alumnos=alumnosService.listAllAlumnos();
            return new ResponseEntity<>(alumnos,HttpStatus.OK);
        }catch(Exception e){

            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/guardarAlumnos")
    public ResponseEntity<Alumnos> createUsuario (@RequestBody Alumnos alumnos){
        try{
            Alumnos result= alumnosService.saveAlumnos(alumnos);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarAlumnosGrupo")
    public ResponseEntity<List<Alumno_Grupo>>gelAllAlumnosGrupo(){
        try{
            List<Alumno_Grupo>alumnos=alumnosService.listAllAlumnosGrupos();
            return new ResponseEntity<>(alumnos,HttpStatus.OK);
        }catch(Exception e){

            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping(value = "/obtenerAlumno/{alumno_id}")
    public ResponseEntity<Alumnos>obtenAlumno(@PathVariable Integer alumno_id){
        try{
            Alumnos alumnos =alumnosService.findOneAlumnos(alumno_id);
            return new ResponseEntity<>(alumnos, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    //EJEMPLOS DTO//
    /* 
    @GetMapping("/listarAlumnosDTO")
    public ResponseEntity<List<AlumnosDTO>> getAllAlumnosDTO() {
        try {
        List<AlumnosDTO> alumnos = alumnosService.listarAlumnosDTO();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
        } catch (Exception e) {
        System.out.println(e);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
    }
}

    @PostMapping("/guardarAlumnoDTO")
    public ResponseEntity<Alumnos> createAlumnoDTO(@RequestBody AlumnosDTO alumnos) {
        try {
        Alumnos result = alumnosService.saveAlumnosDTO(alumnos);
        return new ResponseEntity<>(result, HttpStatus.CREATED); 
        } catch (Exception e) {
        System.out.println(e);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
    }
}
    */
    @GetMapping("/listAlumnosObject")
    public ResponseEntity<List<Object>> getAllAlumnosObject() {
        try {
        List<Object> alumnos = alumnosService.listAObjects();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
        } catch (Exception e) {
        System.out.println(e);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);  
    }
}


}
