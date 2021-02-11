import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDaoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentDAO dao = new studentDAO();
		//Student s1=dao.getName(20);
		Student s2 = new Student();
		s2.studentId=15;
		s2.sname="Achraj";
		//System.out.println(s1.sname);
		dao.connect();
		dao.addStudent(s2);
	}

	
}
class studentDAO{
	Connection cn=null;
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?allowPublicKeyRetrieval=true&useSSL=false", "Aditya", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	public Student getName(int studentId) {

		try {
			String query = "select studentName from student where studentId=20";
			Student s= new Student();
			s.studentId=studentId;
			Statement st = cn.createStatement();
			ResultSet re = st.executeQuery(query);
			re.next();
			String name = re.getString(1);
			s.sname=name;
			return s;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		return null;
		
		
	}
	
	public void addStudent(Student s) {
		
	String query= "insert into student value(?,?)";
	PreparedStatement pst;
	try {
	pst = cn.prepareStatement(query);
	pst.setString(1, s.sname);
	pst.setInt(2, s.studentId);
	pst.executeUpdate();
	System.out.println("Added");
	}catch(Exception e){
		System.out.println(e);
	}
	}
}
class Student{
	int studentId;
	String sname;
}