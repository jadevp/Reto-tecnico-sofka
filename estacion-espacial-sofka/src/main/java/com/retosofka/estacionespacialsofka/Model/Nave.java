package com.retosofka.estacionespacialsofka.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Naves")
public class Nave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipoNave")
    private String tipoNave;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "pais")
    private String pais;

    @Column(name = "combustible")
    private String combustible;

    @Column(name = "actividad")
    private String actividad;

    @Column(name = "imagenUrl")
    private String imagenUrl;

    public Nave() {
    }

    public Nave(String nombre, String pais, String tipoNave, String combustible, String actividad, String imagenUrl) {
        this.nombre = nombre;
        this.tipoNave = tipoNave;

        this.pais = pais;
        this.combustible = combustible;
        this.actividad = actividad;
        this.imagenUrl = imagenUrl;

    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public String setImagenUrl(String imagenUrl) {
        return this.imagenUrl = imagenUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + "tipoNave=" + tipoNave + ", pais=" + pais + ", combustible="
                + combustible + ", actividad="
                + actividad + "imagenUrl=" + imagenUrl + '}';
    }

}
