package com.retosofka.estacionespacialsofka.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.retosofka.estacionespacialsofka.Model.Nave;

import com.retosofka.estacionespacialsofka.service.NaveService;

// Comentario: Este controlador maneja las operaciones relacionadas con la clase Nave, incluyendo 
// la visualizacion de la lista de naves y la creacion de nuevas naves
@Controller
public class NavesController {

    @Autowired
    private NaveService naveService; // Comentario: Inyeccion de dependencia para la clase NaveService

    @GetMapping("/")
    public String principal(Model model) {
        model.addAttribute("inventario", naveService.getAllNaves());
        return "inventario";
    }

    @GetMapping("/inventario") // Comentario: Mapeo que devuelve la vista de la lista de naves en el inventario
    public String list(Model model) {
        model.addAttribute("inventario", naveService.getAllNaves());
        return "inventario";
    }

    @GetMapping("/inventario/new") // Comentario: Mapeo que devuelve la vista para crear una nueva nave
    public String createNaveForm(Model model) {
        Nave nave = new Nave();
        model.addAttribute("nave", nave);

        return "crear-nave";
    }

    @PostMapping("/inventario") // Comentario: Mapeo que maneja la creacion de una nueva nave
    public String createNave(@ModelAttribute("nave") Nave nave) {
        // Comentario: Verifica el tipo de nave y establece el valor en mayusculas
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
        naveService.saveNave(nave); // Comentario: Llama al metodo saveNave en NaveService para guardar
        return "redirect:/inventario";
    }
}