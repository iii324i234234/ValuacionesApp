package com.ejercicio.spring.valuaciones.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.spring.valuaciones.Utils.ExcelProcessUtils;
import com.ejercicio.spring.valuaciones.entity.Automovil;
import com.ejercicio.spring.valuaciones.repository.AutomovilRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class DataLoaderService {

    private static final Logger log = LogManager.getLogger(DataLoaderService.class);

    @Autowired
    private AutomovilRepository automovilRepository;

    /**
        Carga los datos de los automóviles desde un archivo Excel utilizando la utilidad 
        ExcelProcessUtils.extractValuesFromExcelFile().    Luego, realiza una inserción de los datos 
        de los automóviles en la base de datos a través del método     automovilRepository.saveAll(listadoAutos).
        Este método es anotado con @PostConstruct para asegurar que se ejecute después de que se hayan inyectado 
        todas las dependencias necesarias.
        
        @throws RuntimeException si hay un error al procesar el archivo Excel o al guardar los datos en la base
        de datos.
    */
    @PostConstruct
    public void loadDataExcel() {
        List<Automovil> listadoAutos = ExcelProcessUtils.extractValuesFromExcelFile();

        log.info("Realizando Insert de los Automoviles en la Base de Datos...");        
        automovilRepository.saveAll(listadoAutos);

        log.info("Finalizado Insert de los Automoviles en la Base de Datos");        
        
    }

}