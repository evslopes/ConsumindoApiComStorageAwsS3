package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "usuario/incluir")
    public ResponseEntity incluir(@RequestBody Usuario usuario){
        ResponseEntity resposta = ResponseEntity.notFound().build();

        if (usuario != null && usuario.getId() == null){
            Usuario registrado = usuarioService.incluir(usuario);
            resposta = ResponseEntity.status(HttpStatus.CREATED).body(registrado);
        }
        return resposta;
    }

}