package br.com.Attornatus.cadastropessoaendereco.pessoa.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.Attornatus.cadastropessoaendereco.handler.APIException;
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

	@Override
	public List<Pessoa> buscaTodasPessoas() {
		log.info("[inicia] PessoaInfraRepository - buscaTodasPessoas");
		List<Pessoa> todasPessoas = pessoaSPringJPARepository.findAll();
		log.info("[finaliza] PessoaInfraRepository - buscaTodasPessoas");
		return todasPessoas;
	}

	@Override
	public Pessoa buscaPessoaAtravesId(UUID idPessoa) {
		log.info("[inicia] PessoaInfraRepository - buscaPessoaAtravesId");
		Pessoa pessoa = pessoaSPringJPARepository.findById(idPessoa)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pessoa Não encontrado"));
		log.info("[finaliza] PessoaInfraRepository - buscaPessoaAtravesId");
		return pessoa;
	}
}