package com.mitocode.repository;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;

import com.mitocode.DemoConsolaApplication;

//import ch.qos.logback.classic.Logger;

@Repository
//Se usa el estereotipo para no tener que instanciar la clase

public class PersonaRepoImpl implements IPersonaRepo {

	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("Se registro a: " + nombre);
		
	}

}
