package br.com.Attornatus.cadastropessoaendereco.pessoa.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Attornatus.cadastropessoaendereco.pessoa.domain.Pessoa;

public interface PessoaSPringJPARepository extends JpaRepository<Pessoa, UUID>{

}
