package br.com.Attornatus.cadastropessoaendereco.pessoa.application.api;

import java.util.UUID;

import br.com.Attornatus.cadastropessoaendereco.pessoa.domain.Pessoa;
import lombok.Value;

@Value
public class PessoaDetalhadoResponse {

	private UUID idPessoa;
	private String nomeCompleto;

	public PessoaDetalhadoResponse(Pessoa pessoa) {
		this.idPessoa = pessoa.getIdPessoa();
		this.nomeCompleto = pessoa.getNomeCompleto();
	}
}