package com.ejercicio.spring.valuaciones.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad Automovil que coincide con la Tabla Automoviles 
 */
@Entity
@Table(name = "AUTOMOVILES")
public class Automovil {

    /* Atributos */
    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "I_N")
    private String origen; // Importado o Nacional

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "valor_2021")
    private Integer valor2021;

    @Column(name = "valor_2020")
    private Integer valor2020;

    @Column(name = "valor_2019")
    private Integer valor2019;

    @Column(name = "valor_2018")
    private Integer valor2018;

    @Column(name = "valor_2017")
    private Integer valor2017;

    @Column(name = "valor_2016")
    private Integer valor2016;

    @Column(name = "valor_2015")
    private Integer valor2015;

    @Column(name = "valor_2014")
    private Integer valor2014;

    @Column(name = "valor_2013")
    private Integer valor2013;

    @Column(name = "valor_2012")
    private Integer valor2012;


    /* Constructores  */
    public Automovil() {

    }

    public Automovil(Long id, String origen, String marca, String descripcion, String tipo, Integer valor2021,
            Integer valor2020, Integer valor2019, Integer valor2018, Integer valor2017, Integer valor2016, Integer valor2015,
            Integer valor2014, Integer valor2013, Integer valor2012) {
        this.id = id;
        this.origen = origen;
        this.marca = marca;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.valor2021 = valor2021;
        this.valor2020 = valor2020;
        this.valor2019 = valor2019;
        this.valor2018 = valor2018;
        this.valor2017 = valor2017;
        this.valor2016 = valor2016;
        this.valor2015 = valor2015;
        this.valor2014 = valor2014;
        this.valor2013 = valor2013;
        this.valor2012 = valor2012;
    }

    /* Getters y Setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor2021() {
        return valor2021;
    }

    public void setValor2021(Integer d) {
        this.valor2021 = d;
    }

    public Integer getValor2020() {
        return valor2020;
    }

    public void setValor2020(Integer d) {
        this.valor2020 = d;
    }

    public Integer getValor2019() {
        return valor2019;
    }

    public void setValor2019(Integer d) {
        this.valor2019 = d;
    }

    public Integer getValor2018() {
        return valor2018;
    }

    public void setValor2018(Integer d) {
        this.valor2018 = d;
    }

    public Integer getValor2017() {
        return valor2017;
    }

    public void setValor2017(Integer d) {
        this.valor2017 = d;
    }

    public Integer getValor2016() {
        return valor2016;
    }

    public void setValor2016(Integer d) {
        this.valor2016 = d;
    }

    public Integer getValor2015() {
        return valor2015;
    }

    public void setValor2015(Integer d) {
        this.valor2015 = d;
    }

    public Integer getValor2014() {
        return valor2014;
    }

    public void setValor2014(Integer d) {
        this.valor2014 = d;
    }

    public Integer getValor2013() {
        return valor2013;
    }

    public void setValor2013(Integer d) {
        this.valor2013 = d;
    }

    public Integer getValor2012() {
        return valor2012;
    }

    public void setValor2012(Integer d) {
        this.valor2012 = d;
    }

    /* To String */

    @Override
    public String toString() {
        return "Automovil [id=" + id + ", origen=" + origen + ", marca=" + marca + ", descripcion=" + descripcion
                + ", tipo=" + tipo + ", valor2021=" + valor2021 + ", valor2020=" + valor2020 + ", valor2019="
                + valor2019 + ", valor2018=" + valor2018 + ", valor2017=" + valor2017 + ", valor2016=" + valor2016
                + ", valor2015=" + valor2015 + ", valor2014=" + valor2014 + ", valor2013=" + valor2013 + ", valor2012="
                + valor2012 + "]";
    }


    

    
}
