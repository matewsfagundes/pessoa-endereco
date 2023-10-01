package br.com.Attornatus.cadastropessoaendereco.endereco.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class EnderecoRequest {
	
	@NotBlank
	private String lagradouro;
	@NotBlank
	private String cep;
	@NotBlank
	private String numero;
	@NotBlank
	private String cidade;
	@NotNull
	private Boolean tipoEndereco;
}
