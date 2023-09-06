package br.com.Attornatus.cadastropessoaendereco.pessoa.application.repository;

import br.com.Attornatus.cadastropessoaendereco.pessoa.domain.Pessoa;

public interface PessoaRepository {

	Pessoa salva(Pessoa pessoa);
}