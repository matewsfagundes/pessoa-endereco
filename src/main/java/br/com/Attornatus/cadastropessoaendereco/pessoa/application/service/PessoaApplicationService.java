package br.com.Attornatus.cadastropessoaendereco.pessoa.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaDetalhadoResponse;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaListResponse;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaRequest;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.api.PessoaResponse;
import br.com.Attornatus.cadastropessoaendereco.pessoa.application.repository.PessoaRepository;
import br.com.Attornatus.cadastropessoaendereco.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {
	private final PessoaRepository pessoaRepository;

	@Override
	public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa");
		Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
		log.info("[finaliza] PessoaApplicationService - criaPessoa");
		return PessoaResponse.builder()
				.idPessoa(pessoa.getIdPessoa())
				.build();
	}

	@Override
	public List<PessoaListResponse> buscaTodasPessoas() {
		log.info("[inicia] PessoaApplicationService - buscaTodasPessoas");
		List<Pessoa> pessoas = pessoaRepository.buscaTodasPessoas();
		log.info("[finaliza] PessoaApplicationService - buscaTodasPessoas");
		return PessoaListResponse.converte(pessoas);
	}

	@Override
	public PessoaDetalhadoResponse buscaPessoaAtravesId(UUID idPessoa) {
		log.info("[inicia] PessoaApplicationService - buscaPessoaAtravesId");
		Pessoa pessoa = pessoaRepository.buscaPessoaAtravesId(idPessoa);
		log.info("[finaliza] PessoaApplicationService - buscaPessoaAtravesId");
		return new PessoaDetalhadoResponse(pessoa);
	}

	@Override
	public void deletaPessoaAtravesId(UUID idPessoa) {
		log.info("[inicia] PessoaApplicationService - deletaPessoaAtravesId");
		Pessoa pessoa = pessoaRepository.buscaPessoaAtravesId(idPessoa);
		pessoaRepository.deletaPessoa(pessoa);
		log.info("[finaliza] PessoaApplicationService - deletaPessoaAtravesId");
	}
}