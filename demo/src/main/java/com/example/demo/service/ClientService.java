package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Clients;
import com.example.demo.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<Clients> findAll() {
		return repository.findAll();
	}
	
	public Clients findById(Long id) {
		Optional<Clients> obj = repository.findById(id);
		return obj.get();
	}
	
	public Clients insert (Clients obj) {
		return repository.save(obj);
	}
}
