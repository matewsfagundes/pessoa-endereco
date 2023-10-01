package br.com.Attornatus.cadastropessoaendereco.endereco.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.Attornatus.cadastropessoaendereco.endereco.application.repository.EnderecoRepository;
import br.com.Attornatus.cadastropessoaendereco.endereco.domain.Endereco;
import br.com.Attornatus.cadastropessoaendereco.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class EnderecoInfraRepository implements EnderecoRepository {
	
	private final EnderecoSpringDataJPARepository enderecoSpringDataJPARepository; 

	@Override
	public Endereco salvaEndereco(Endereco endereco) {
		log.info("[inicia] EnderecoInfraRepository - salvaEndereco");
		 enderecoSpringDataJPARepository.save(endereco);
		log.info("[finaliza] EnderecoInfraRepository - salvaEndereco");
		return endereco;
	}

	@Override
	public List<Endereco> listaEnderecosDaPessoa(UUID idPessoa) {
		log.info("[inicia] EnderecoInfraRepository - listaEnderecosDaPessoa");
		List<Endereco> todosEnderecos = enderecoSpringDataJPARepository.findAll();
		log.info("[finaliza] EnderecoInfraRepository - listaEnderecosDaPessoa");
		return todosEnderecos;
	}

	@Override
	public Endereco buscaEnderecoId(UUID idEndereco) {
		log.info("[inicia] EnderecoInfraRepository - buscaEnderecoId");
		Endereco endereco = enderecoSpringDataJPARepository.findById(idEndereco)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Endereco não encontrado"));
		log.info("[finaliza] EnderecoInfraRepository - buscaEnderecoId");
		return endereco;
	}
}
