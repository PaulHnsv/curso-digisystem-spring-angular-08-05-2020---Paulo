package br.com.digisystem.api;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.digisystem.api.services.PopularBancoService;


@SpringBootApplication
public class ApiApplication implements CommandLineRunner {
	
	@Autowired
	private PopularBancoService popularBancoService; 

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.popularBancoService.criarMassaDados();
				
	}

}
