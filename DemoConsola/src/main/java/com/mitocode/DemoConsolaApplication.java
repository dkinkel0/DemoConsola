package com.mitocode;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;
import com.mitocode.service.PersonaServiceImpl;

//import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	//private static org.slf4j.Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Hola mundo!");
		//LOG.info("Hola mundo LOG");
		//LOG.warn("HOLA MUNDOO!!");
		//service = new PersonaServiceImpl(); // lo cambio por un auto
		service.registrar("MitoCode");
	}
	
}
