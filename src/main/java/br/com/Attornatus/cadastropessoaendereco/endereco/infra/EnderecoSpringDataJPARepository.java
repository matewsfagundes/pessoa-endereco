package br.com.Attornatus.cadastropessoaendereco.endereco.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Attornatus.cadastropessoaendereco.endereco.domain.Endereco;

public interface EnderecoSpringDataJPARepository extends JpaRepository <Endereco, UUID> {

}
	