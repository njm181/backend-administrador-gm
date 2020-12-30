package com.gmdevs.backendweb.controller;

import com.gmdevs.backendweb.domain.entity.Evento;
import com.gmdevs.backendweb.exception.ServiceException;
import com.gmdevs.backendweb.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**CAMBIAR A FORMATO APIREST, QUITAR LOS MODEL Y CAMBIAR RETURN A RESPONSEENTITY*/
@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/crear")
    public String getViewCrearEvento(Model model) {
        model.addAttribute("evento", new Evento());
        return "sections/evento/evento-crear";
    }

    @PostMapping("/guardar")
    public String guardarEvento(Evento evento, BindingResult bindingResult, Model model) {
        System.out.println(evento);
        Map<String, Object> response = new HashMap<>();
        /*if(bindingResult.hasErrors()){
            new ResponseEntity<>("Error en los campos ingresados", HttpStatus.BAD_REQUEST);
            //activar popup mostrando error
        }
        try {
            Evento eventoCreado = eventoService.guardarEvento(evento);
            response.put("Evento", eventoCreado);
            response.put("Mensaje", "Evento creado");
            model.addAttribute("evento_creado", eventoCreado);
            model.addAttribute("evento_guardado", true);
        } catch (ServiceException e) {
            new ResponseEntity<>(e.getMensaje(), HttpStatus.INTERNAL_SERVER_ERROR);
            model.addAttribute("evento_creado", new Evento());
            model.addAttribute("evento_guardado", false);
        }*/
        //return new ResponseEntity<>(response, HttpStatus.CREATED);
        model.addAttribute("evento_guardado", true);
        return "redirect:/evento/buscar";
    }


    @RequestMapping(method = RequestMethod.GET ,value = "/buscar")
    public String getListaEvento(Model model) {
        model.addAttribute("evento_guardado", true);
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