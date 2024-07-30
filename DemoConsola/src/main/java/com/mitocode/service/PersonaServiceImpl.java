package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.repository.IPersonaRepo;
import com.mitocode.repository.PersonaRepoImpl;

@Service
//esta capa realiza una logica de negocio
public class PersonaServiceImpl implements IPersonaService{

	@Autowired 
	//Ese auto va a buscr la definicion de IPersonaRepo
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		//repo = new PersonaRepoImpl(); // se saca la instalcia y se pone
		repo.registrar(nombre);
		
	}

}
