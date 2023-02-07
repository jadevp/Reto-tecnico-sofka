package com.retosofka.estacionespacialsofka.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.retosofka.estacionespacialsofka.Model.Nave;

import com.retosofka.estacionespacialsofka.service.NaveService;

@Controller
public class NavesController {

    @Autowired
    private NaveService naveService;

    @GetMapping("/")
    public String principal(Model model) {
        model.addAttribute("inventario", naveService.getAllNaves());
        return "inventario";
    }

    @GetMapping("/inventario")
    public String list(Model model) {
        model.addAttribute("inventario", naveService.getAllNaves());
        return "inventario";
    }

    @GetMapping("/inventario/new")
    public String createNaveForm(Model model) {
        Nave nave = new Nave();
        model.addAttribute("nave", nave);

        return "crear-nave";
    }

    @PostMapping("/inventario")
    public String createNave(@ModelAttribute("nave") Nave nave) {
        switch (nave.getTipoNave()) {
            case "nave no tripuladas":
                nave.setTipoNave("Nave-no-tripuladas");
                break;
            case "nave tripuladas":
                nave.setTipoNave("Nave-tripuladas");
                break;
            case "nave lazador":
                nave.setTipoNave("Nave-lazador");
                break;
            default:
                return ("Tipo de nave inválido");

        }
        naveService.saveNave(nave);
        return "redirect:/inventario";
    }
}