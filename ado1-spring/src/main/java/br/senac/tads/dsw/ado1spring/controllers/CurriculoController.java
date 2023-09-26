package br.senac.tads.dsw.ado1spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class CurriculoController {

//    @GetMapping("/")
//    public String verCurriculo(){
//        return "curriculo";
//    }
    @GetMapping("/")
    public ModelAndView exemploViewObj(){
        ModelAndView mv = new ModelAndView("curriculo");

        //seção 1 - Informações Pessoais
        mv.addObject("nome", "Victor Mesquita");
        mv.addObject("celular", "(11) 96333-9887");
        mv.addObject("email", "mvictormesquita@gmail.com");
        mv.addObject("linkedin", "LinkedIn: https://www.linkedin.com/in/victor-mesquit/");
        mv.addObject("github", "GitHub: https://github.com/victormesquitta");

        //seção 2 - Experiências Profissionais
        mv.addObject("empresa1", "APCEF/SP");
        mv.addObject("cargo1", "Jovem Aprendiz em Área Administrativa");
        mv.addObject("data_emprego1", "Set/2021 - Dez/2022");

        mv.addObject("empresa2", "TecBan");
        mv.addObject("cargo2", "Estágio em Sistemas de Processamento");
        mv.addObject("data_emprego2", "Mar/2023 - Atualmente");


        //seção 3 - Formação
        mv.addObject("faculdade", "Centro Universitário Senac");
        mv.addObject("curso", "Análise e Desenvolvimento de Sistemas");
        mv.addObject("data_curso", "Jan/2022 - Jun/2024 (2,5 anos)");

        //seção 4 - Conhecimentos
        mv.addObject("java", "Java");
        mv.addObject("javascript", "JavaScript");
        mv.addObject("python", "Python");
        mv.addObject("css", "CSS");
        mv.addObject("html", "HTML");
        mv.addObject("git", "Git");
        mv.addObject("sql", "SQL");
        mv.addObject("spring", "Spring");




        mv.addObject("dataHora", LocalDateTime.now());
        return mv;
    }



}
