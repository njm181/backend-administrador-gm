package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class HomeController {


    @RequestMapping("")
    public String getListaReuniones(Model model) {
        model.addAttribute("hola", "Hola");
        return "index";
    }

    /*@RequestMapping("/eventos")
    public String getListaEventos(Model model){
        return "sections/evento-crear";
    }*/
}