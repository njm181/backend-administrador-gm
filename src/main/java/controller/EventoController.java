package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eventos")
public class EventoController {

    @RequestMapping("")
    public String getListaEventos(Model model){
        //List<Evento> listaEventos = reunionService.getReuniones();
        //model.addAttribute("eventos", listaEventos);
        return "sections/evento-crear";
    }
}
