package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
    Usuario autenticacao(String email, String senha);
}
