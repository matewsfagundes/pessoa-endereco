package br.com.Attornatus.cadastropessoaendereco.pessoa.application.service;

import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaRequest;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaResponse;

public interface PessoaService {

	PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

}
