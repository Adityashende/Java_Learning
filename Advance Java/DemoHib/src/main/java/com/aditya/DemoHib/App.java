package com.aditya.DemoHib;



import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Student st = new Student();
    	st.setRollNo(1);
    	st.setName("Aditya");
    	st.setMarks(80);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	SessionFactory sf= con.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(st);
    	
    	tx.commit();
    	
    }
}
