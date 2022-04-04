package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Endereco;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "cep/buscarCep";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario, Endereco endereco){

        usuario.setEndereco(endereco);

        usuarioService.incluir(usuario);

        return "redirect:/";
    }

    @GetMapping(value = "/usuarios")
    public String telaLista(Model model) {

        model.addAttribute("usuarioLista", usuarioService.obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id) {

        Usuario usuario = usuarioService.obterPorId(id);

        if(usuario != null) {
            usuarioService.excluir(id);

            model.addAttribute("mensagem", "O usuário "+usuario.getNome()+" foi excluído com sucesso!!!");
        } else {
            model.addAttribute("mensagem", "Usuário inexistente.. impossível realizar a exclusão!!!");
        }

        return telaLista(model);
    }




}
