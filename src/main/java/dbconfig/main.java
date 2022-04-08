package dbconfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.descending;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;

public class main {

	public static void main(String[] args) {
		
		DBconnect db= new DBconnect();
		
		//Connect with a collection exist on database
		DBCollection collectionEmp = db.database.getCollection("employes");
		System.out.println(collectionEmp);
		
		//Test:: Read Data from db
		DBCursor cursor = collectionEmp.find(); //DBObject jo = cursor.one();
		
		//Iterate documents 
        while (cursor.hasNext()) {
            System.out.println(((DBObject) cursor.next()));
        }
        
        		
 
	
	}

}
