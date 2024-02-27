package com.example.demo2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.interfaceService.IpersonaService;
import com.example.demo2.interfaces.IPersona;
import com.example.demo2.modelo.Persona;

//@Serevice  ojito con esto que ayudo a resolver com.example.demo2.controlador.controlador required a bean of type  'com.example.demo2.interfaceService.IpersonaService' that could not be found.
@Service // 'com.example.demo2.interfaceService.IpersonaService' that could not be found.
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> Listar() {

        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Listar'");
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public int save(Persona p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
