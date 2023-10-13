package com.code.consumoAPI.viacepapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.code.consumoAPI.DTO.CepResultDTO;

@RestController
@RequestMapping("consulta-cep")
public class ViaCepService {

	@GetMapping("{cep}")
	public CepResultDTO consultaCep(@PathVariable("cep") String cep) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CepResultDTO> response =  restTemplate.
				getForEntity("https://viacep.com.br/ws/"+ cep +"/json" , CepResultDTO.class);
		
		return response.getBody();
	}
}
