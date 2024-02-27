package com.example.demo2.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
