package br.edu.infnet.model.service;

import br.edu.infnet.clients.IEnderecoClient;
import br.edu.infnet.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private IEnderecoClient enderecoClient;

    public Endereco buscarCep(String cep) {
        return enderecoClient.buscarCep(cep);
    }
}
