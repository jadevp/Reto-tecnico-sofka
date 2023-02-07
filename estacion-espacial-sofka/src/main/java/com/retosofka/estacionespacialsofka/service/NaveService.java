package com.retosofka.estacionespacialsofka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.retosofka.estacionespacialsofka.Model.Nave;
import com.retosofka.estacionespacialsofka.Repository.INaveRepository;

@Service
public class NaveService implements INaveService {

    private INaveRepository navesRepository;

    public NaveService(INaveRepository navesRepository) {
        this.navesRepository = navesRepository;
    }

    @Override
    public List<Nave> getAllNaves() {
        return navesRepository.findAll();
    }

    @Override
    public Nave saveNave(Nave Nave) {
        return navesRepository.save(Nave);
    }

    @Override
    public List<Nave> getNavesByName(String name) {

        return navesRepository.findByTitleContaining(name);
    }

    @Override
    public List<Nave> getNavesByPais(String pais) {

        return navesRepository.findByPaisContaining(pais);
    }

    @Override
    public Nave getNaveById(Long id) {

        return navesRepository.getReferenceById(id);
    }

}
