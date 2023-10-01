package br.com.Attornatus.cadastropessoaendereco.endereco.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.Attornatus.cadastropessoaendereco.endereco.domain.Endereco;
import lombok.Value;

@Value
public class ListaEnderecosResponse {
	
	private UUID idEndereco;
	private String lagradouro;
	private String cep;
	private String numero;
	private String cidade;
	private Boolean tipoEndereco;
	
	public static List<ListaEnderecosResponse> converte(List<Endereco> enderecos) {
		return enderecos.stream()
				.map(ListaEnderecosResponse::new)
				.collect(Collectors.toList());
	}

	private ListaEnderecosResponse(Endereco endereco) {
		this.idEndereco = endereco.getIdEndereco();
		this.lagradouro = endereco.getLagradouro();
		this.cep = endereco.getCep();
		this.numero = endereco.getNumero();
		this.cidade = endereco.getCidade();
		this.tipoEndereco = endereco.getTipoEndereco();
	}
}
