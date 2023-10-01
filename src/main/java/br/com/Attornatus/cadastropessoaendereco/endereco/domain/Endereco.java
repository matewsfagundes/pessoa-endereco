package br.com.Attornatus.cadastropessoaendereco.endereco.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.Attornatus.cadastropessoaendereco.endereco.application.api.EnderecoRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Data
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idEndereco;
	@Column(columnDefinition = "uuid", name = "idPessoa", nullable = false)
	private UUID idPessoaCadastro;
	private String lagradouro;
	private String cep;
	private String numero;
	private String cidade;
	private Boolean tipoEndereco;
	
	public Endereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
		this.idPessoaCadastro = idPessoa;
		this.lagradouro = enderecoRequest.getLagradouro();
		this.cep = enderecoRequest.getCep();
		this.numero = enderecoRequest.getNumero();
		this.cidade = enderecoRequest.getCidade();
		this.tipoEndereco = enderecoRequest.getTipoEndereco();
	}
}
