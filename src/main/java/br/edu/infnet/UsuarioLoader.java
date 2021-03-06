package br.edu.infnet;

import br.edu.infnet.model.domain.Endereco;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioLoader implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Endereco endereco = new Endereco();
        endereco.setBairro("Bairro do Admin");
        endereco.setCep("99.999-99");
        endereco.setComplemento("Complemento do Admin");
        endereco.setLocalidade("Localidade do Admin");
        endereco.setLogradouro("Logradouro do Admin");
        endereco.setUf("UF");

        Usuario usuario = new Usuario();
        usuario.setNome("Teste");
        usuario.setEmail("teste@teste.com");
        usuario.setSenha("teste123");
        usuario.setTelefone("(21) 9999-9999");

        usuario.setEndereco(endereco);

        usuarioService.incluir(usuario);
    }
}
