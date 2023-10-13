package com.code.consumoAPI;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.code.consumoAPI.DTO.CepResultDTO;
import com.code.consumoAPI.viacepapi.ViaCepService;

@SpringBootApplication
public class ConsumoApiJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiJavaApplication.class, args);
		Scanner input = new Scanner(System.in);
		
		ViaCepService cepConsulta = new ViaCepService();
		String cep = input.next();
		CepResultDTO resultCep = cepConsulta.consultaCep(cep);
		System.out.println(resultCep);
	}

}
