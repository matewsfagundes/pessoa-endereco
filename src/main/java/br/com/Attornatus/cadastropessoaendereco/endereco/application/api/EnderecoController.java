package br.com.Attornatus.cadastropessoaendereco.endereco.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.Attornatus.cadastropessoaendereco.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@RestController
@RequiredArgsConstructor
public class EnderecoController implements EnderecoAPI {
	
	private final EnderecoService enderecoService;

	@Override
	public EnderecoResponse criaEndereco(UUID idPessoa, @Valid EnderecoRequest enderecoRequest) {
		log.info("[inicia] EnderecoController - criaEndereco");
		log.info("[idPessoa] {}", idPessoa);
		EnderecoResponse endereco = enderecoService
				.criaEndereco(idPessoa, enderecoRequest);
		log.info("[finaliza] EnderecoController - criaEndereco");
		return endereco;
	}

	@Override
	public List<ListaEnderecosResponse> listaEnderecosDaPessoa(UUID idPessoa) {
		log.info("[inicia] EnderecoController - listaEnderecosDaPessoa");
		log.info("[idPessoa] {}", idPessoa);
		List<ListaEnderecosResponse> enderecosPessoa = enderecoService
				.listaEnderecosDaPessoa(idPessoa);
		log.info("[finaliza] EnderecoController - listaEnderecosDaPessoa");
		return enderecosPessoa;
	}

	@Override
	public void patchAlteraEndereco(UUID idEndereco, EnderecoRequest enderecoRequest) {
		log.info("[inicia] EnderecoController - patchAlteraCliente");
		log.info("[idPessoa] {}", idEndereco);
		enderecoService.patchAlteraEndereco(idEndereco, enderecoRequest);
		log.info("[finaliza] EnderecoController - patchAlteraCliente");
		
	}
}
