package br.com.Attornatus.cadastropessoaendereco.pessoa.application.service;

import java.util.List;

import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaListResponse;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaRequest;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaResponse;

public interface PessoaService {
	PessoaResponse criaPessoa(PessoaRequest pessoaRequest);
	List<PessoaListResponse> buscaTodasPessoas();
}