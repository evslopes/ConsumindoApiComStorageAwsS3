package br.edu.infnet.controller;

import br.edu.infnet.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping(value = "/cep")
    public String buscaCep(Model model, @RequestParam String cep){
        model.addAttribute("oEndereco", enderecoService.buscarCep(cep));

        return "usuario/cadastro";
    }
}
