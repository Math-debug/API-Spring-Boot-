package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Clients;
import com.example.demo.service.ClientService;


@RestController
@RequestMapping(value = "/clients")

public class ClientsResources {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Clients>> findAll(){
		List<Clients> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Clients> findById(@PathVariable Long id) {
		Clients obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
