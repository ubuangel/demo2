package com.example.demo2.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo2.modelo.Persona;

public interface IpersonaService {

    public List<Persona> Listar();

    public Optional<Persona> listarId(int id);

    public int save(Persona p);

    public void delete(int id);

}
