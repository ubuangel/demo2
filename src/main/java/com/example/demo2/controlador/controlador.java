package com.example.demo2.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.interfaceService.IpersonaService;
import com.example.demo2.modelo.Persona;

@RestController
@RequestMapping
public class controlador {

    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona> personas = service.Listar();
        model.addAttribute("personas", personas);
        return "index";

    }
}
