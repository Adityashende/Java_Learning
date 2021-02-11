package tester;
import static utils.DButils.fetchDBConnection;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		
		try (Connection cn=fetchDBConnection()){
			System.out.println("Connected to DB "+cn);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
