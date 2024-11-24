package com.example.proyepln.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasController {


    @GetMapping(value= "/alumnosAdmin")
    public String alumnosAdmin(){
        return"alumnosAdmin";
    }
}
