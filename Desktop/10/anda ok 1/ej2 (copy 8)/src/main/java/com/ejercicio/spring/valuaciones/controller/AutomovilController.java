package com.ejercicio.spring.valuaciones.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ejercicio.spring.valuaciones.entity.Automovil;
import com.ejercicio.spring.valuaciones.repository.AutomovilRepository;

@Controller
public class AutomovilController {
    
    @Autowired
    private AutomovilRepository automovilRepository ;
    
    /**
    Método que maneja la petición GET para obtener todos los automóviles.
    @param model objeto Model de Spring para almacenar atributos de la vista.
    @param keyword palabra clave para filtrar los automóviles (opcional).
    @return nombre de la vista que muestra la lista de automóviles.
     */
    @GetMapping("/automoviles")
    public String getAll(Model model, @Param("keyword") String keyword) {
    try {
      List<Automovil> automovilesList = new ArrayList<>();

      automovilRepository.findAll().forEach(automovilesList::add);

      model.addAttribute("automoviles", automovilesList);
    } catch (Exception e) {
      model.addAttribute("message", e.getMessage());
    }

    return "automoviles";
  }


 

}
