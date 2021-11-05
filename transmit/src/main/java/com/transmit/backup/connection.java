package com.transmit.backup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.DBCollection;

public class connection {
	
	static MongoClient mongoClient = new MongoClient(); // mongodb://myDBReader:D1fficultP%40ssw0rd @localhost:27017,localhost:27020,localhost:27030/?authSource=[usuario]&replicaSet=testrep
	static MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017,localhost:27020,localhost:27030/?replicaSet=testrep" + "");
	static MongoCollection<org.bson.Document> coll;
	
	public static void main(String[] args) {
	
//	Logger logger = LoggerFactory.getLogger(connection.class);
	 
	connect();
	}
	
	public static void connect() {
		
		Logger logger = LoggerFactory.getLogger(connection.class);
		
		 System.out.println("<<------------------Conexion----------------->>>>");    
		 String Db="prueba";
		 
		try {
			mongoClient = new MongoClient(connectionString);
			MongoDatabase db= mongoClient.getDatabase(Db);
			
			MongoCollection<org.bson.Document>  coll = db.getCollection("datos");
			 // coll.drop();
			  for (String name : db.listCollectionNames()) {
				    System.out.println(name);
				}
			  System.out.println("<<<<<<<<----------------------------------");
			  System.out.println("<<<<<<<<-----------------------------------");
			 
			  System.out.println("<<<<----------------------------->>");
			System.out.println("------------>>>>>>>>>>>>>>>>>>>>><<<<<<<<"+db);
			System.out.println("<<<<----------------------------->>");
			} catch(Exception e) {
	    	logger.info("Ocurrio un error " + e.toString());
	    }
	}
}