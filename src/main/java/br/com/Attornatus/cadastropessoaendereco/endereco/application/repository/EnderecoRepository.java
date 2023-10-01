package br.com.Attornatus.cadastropessoaendereco.endereco.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.Attornatus.cadastropessoaendereco.endereco.domain.Endereco;

public interface EnderecoRepository {

	Endereco salvaEndereco(Endereco endereco);
	List<Endereco> listaEnderecosDaPessoa(UUID idPessoa);

}
