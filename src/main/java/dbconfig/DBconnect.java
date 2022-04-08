package dbconfig;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.*;


public class DBconnect {
	
	public static DB database=null;
	
	public DBconnect() {
		super();
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		database = mongoClient.getDB("gescom");
	}
}



