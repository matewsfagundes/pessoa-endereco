package br.com.Attornatus.cadastropessoaendereco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CadastroPessoaEnderecoApplication {
	@GetMapping
	public String getHomeTest() {
		return "Pessoas e Enderecos - Api Home"; 
	}

	public static void main(String[] args) {
		SpringApplication.run(CadastroPessoaEnderecoApplication.class, args);
	}

}
