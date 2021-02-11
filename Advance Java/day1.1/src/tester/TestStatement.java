package tester;
import static utils.DButils.fetchDBConnection;

import java.sql.*;

public class TestStatement {
public static void main(String [] args) {
	String sql = "insert into student values(?,?)";
	String name="Adi";
	int id=2;
try(Connection cn = fetchDBConnection();
		PreparedStatement st = cn.prepareStatement(sql);
		
//			int count= st.executeUpdate(sql);
		){
	st.setString(1, name);
	st.setInt(2, id);
	int count= st.executeUpdate();
////		while(rst.next())
////			System.out.printf("ID: %d Name: %s\n",rst.getInt(2),rst.getString(1));
		System.out.println(count +" row/s effected");
	}catch(Exception e) {
//		e.printStackTrace();
	}
	
}
}