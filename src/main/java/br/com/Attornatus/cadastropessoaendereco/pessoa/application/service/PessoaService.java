package br.com.Attornatus.cadastropessoaendereco.pessoa.application.service;

import java.util.List;
import java.util.UUID;

import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaAlteracaoRequest;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaDetalhadoResponse;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaListResponse;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaRequest;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaResponse;

public interface PessoaService {
	PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

	List<PessoaListResponse> buscaTodasPessoas();

	PessoaDetalhadoResponse buscaPessoaAtravesId(UUID idPessoa);

	void deletaPessoaAtravesId(UUID idPessoa);

	void patchAlteraPessoa(UUID idPessoa, PessoaAlteracaoRequest pessoaAlteracaoRequest);
}