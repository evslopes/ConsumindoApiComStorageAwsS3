package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario autenticacao(String email, String senha){
        return usuarioRepository.autenticacao(email, senha);
    }

    public Usuario incluir(Usuario usuario){
        usuarioRepository.save(usuario);
        return usuario;
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario obterPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Collection<Usuario> obterLista(){
        return (Collection<Usuario>) usuarioRepository.findAll();
    }

}
