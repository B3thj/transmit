package com.transmit.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransmitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransmitApplication.class, args);
		
//		System.out.println(" La conexion a bdd ");
		connection.connect();
	}

}
