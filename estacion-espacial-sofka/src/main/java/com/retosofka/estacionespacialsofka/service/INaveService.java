package com.retosofka.estacionespacialsofka.service;

import java.util.List;

import com.retosofka.estacionespacialsofka.Model.Nave;

public interface INaveService {

    List<Nave> getAllNaves();

    List<Nave> getNavesByName(String name);

    List<Nave> getNavesByPais(String pais);

    Nave saveNave(Nave nave);

    Nave getNaveById(Long id);

}
