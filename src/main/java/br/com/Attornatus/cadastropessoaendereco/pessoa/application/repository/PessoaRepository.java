package br.com.Attornatus.cadastropessoaendereco.pessoa.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.Attornatus.cadastropessoaendereco.pessoa.domain.Pessoa;

public interface PessoaRepository {
	Pessoa salva(Pessoa pessoa);
	List<Pessoa> buscaTodasPessoas();
	Pessoa buscaPessoaAtravesId(UUID idPessoa);
}