package com.projeto.gestao_escolar.controller;


import com.projeto.gestao_escolar.domain.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("loginForm", new LoginForm()); // classe a ser criada ainda
        return "login"; // arquivo html para login
    }

    @PostMapping("login")
    public String login(LoginForm loginForm){

        if("usuario".equals(loginForm.getUsername()) && "senha".equals(loginForm.getPassword())){
            return "redirect:/home";
        }
        return "redirect:/login?error";
    }
}
