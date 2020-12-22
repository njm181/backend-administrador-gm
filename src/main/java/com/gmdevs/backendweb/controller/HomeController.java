package com.gmdevs.backendweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/home")
public class HomeController {


    @RequestMapping(method = RequestMethod.GET, value = "")
    public String getListaReuniones(Model model) {
        return "index";
    }

}