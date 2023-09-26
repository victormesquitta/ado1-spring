package br.senac.tads.dsw.ado1spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class ExemploController {
    @GetMapping("/saudar")
    public String saudar1(Model modelo) {
        return "mensagemView";
    }







/*
    @GetMapping ("/exemplo-request-param")
    public ModelAndView exemploRequestParam(
        @RequestParam(value = "param1str", required = true, defaultValue = "valor") String param1,
        @RequestParam(value = "param2int", required = false, defaultValue = "99") int param2) {
            ModelAndView resposta = new ModelAndView ("view-exemplo");
            return resposta;
    }




    @GetMapping ("/exemplo-path-var/{param1str}/{param2int}")
        public ModelAndView exemploPathVariable(
        @PathVariable(value = "param1str", required = true) String param1,
        @PathVariable(value = "param2int", required = true) int param2) {
            ModelAndView resposta = new ModelAndView("view-exemplo");
            return resposta;
    }


 */
    @GetMapping ("/exemplo-view-obj")
    public ModelAndView exemploViewObj(){
            ModelAndView mv = new ModelAndView("view-exemplo");
            mv.addObject("texto", "Texto gerado no Controller v2");
            mv.addObject("numero", 100);
            mv.addObject("dataHora", LocalDateTime.now());
            return mv;
    }


}
