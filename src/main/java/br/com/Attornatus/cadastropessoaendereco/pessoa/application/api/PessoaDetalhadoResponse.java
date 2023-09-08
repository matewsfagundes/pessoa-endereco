package br.com.Attornatus.cadastropessoaendereco.pessoa.application.api;

import java.util.UUID;

import lombok.Value;
@Value
public class PessoaDetalhadoResponse {
	private UUID idPessoa;
	private String nomeCompleto;

}
