package br.com.Attornatus.cadastropessoaendereco.pessoa.infra;

import org.springframework.stereotype.Repository;

import br.com.Attornatus.cadastropessoaendereco.pessoa.application.repository.PessoaRepository;
import br.com.Attornatus.cadastropessoaendereco.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PessoaInfraRepository implements PessoaRepository {

	private final PessoaSPringJPARepository pessoaSPringJPARepository;

	@Override
	public Pessoa salva(Pessoa pessoa) {
		log.info("[inicia] PessoaInfraRepository - salva");
		pessoaSPringJPARepository.save(pessoa);
		log.info("[finaliza] PessoaInfraRepository - salva");
		return pessoa;
	}
}