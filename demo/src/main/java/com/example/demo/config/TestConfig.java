package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.Clients;
import com.example.demo.repositories.ClientRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Clients cli1 = new Clients(null,"Matheus",21);
		clientRepository.saveAll(Arrays.asList(cli1));
	}
}
