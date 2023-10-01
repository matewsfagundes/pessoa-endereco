package br.com.Attornatus.cadastropessoaendereco.endereco.application.service;

import java.util.List;
import java.util.UUID;

import br.com.Attornatus.cadastropessoaendereco.endereco.application.api.EnderecoRequest;
import br.com.Attornatus.cadastropessoaendereco.endereco.application.api.EnderecoResponse;
import br.com.Attornatus.cadastropessoaendereco.endereco.application.api.ListaEnderecosResponse;

public interface EnderecoService {

	EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);
	List<ListaEnderecosResponse> listaEnderecosDaPessoa(UUID idPessoa);

}
