package br.com.Attornatus.cadastropessoaendereco.endereco.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
@Log4j2
@RestController
public class EnderecoController implements EnderecoAPI {

	@Override
	public EnderecoResponse criaEndereco(UUID idPessoa, @Valid EnderecoRequest enderecoRequest) {
		log.info("[inicia] EnderecoController - criaEndereco");
		log.info("[idPessoa] {}", idPessoa);
		log.info("[finaliza] EnderecoController - criaEndereco");
		return null;
	}

}
