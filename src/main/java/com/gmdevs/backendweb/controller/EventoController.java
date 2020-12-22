package com.gmdevs.backendweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/evento")
public class EventoController {


    @RequestMapping(method = RequestMethod.GET, value = "/crear")
    public String getViewCrearEvento(Model model) {
        return "sections/evento/evento-crear";
    }

    @RequestMapping(method = RequestMethod.GET ,value = "/buscar")
    public String getListaEvento(Model model) {
        return "sections/evento/evento-lista";
    }

    @RequestMapping(method = RequestMethod.GET ,value = "/detalle")
    public String getViewDetalleEvento(Model model) {
        return "sections/evento/evento-detalle";
    }

    @RequestMapping(method = RequestMethod.GET ,value = "/actualizar")
    public String getViewActualizarEvento(Model model) {
        return "sections/evento/evento-actualizar";
    }
}