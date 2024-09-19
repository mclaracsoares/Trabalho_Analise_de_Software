package com.projeto.gestao_escolar.controller;

import com.projeto.gestao_escolar.domain.User;
import com.projeto.gestao_escolar.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping() //entrada de dados
    public String helloWorld(Model model) {
        model.addAttribute("teste", 20);
        return "teste.html";
        //return helloWorldService.helloWorld("Seu nome");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
        return "Hello " + body.getName();
    }
}
