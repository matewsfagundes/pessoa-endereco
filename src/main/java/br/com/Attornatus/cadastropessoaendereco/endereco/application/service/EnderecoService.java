package br.com.Attornatus.cadastropessoaendereco.endereco.application.service;

import java.util.UUID;

import br.com.Attornatus.cadastropessoaendereco.endereco.application.api.EnderecoRequest;
import br.com.Attornatus.cadastropessoaendereco.endereco.application.api.EnderecoResponse;

public interface EnderecoService {

	EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);

}
