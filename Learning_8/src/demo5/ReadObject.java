package demo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	
	public static void main(String[] args) {
		System.out.println("Reading Objects....");
		
		try(FileInputStream fi = new FileInputStream("people.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Person p1 = (Person)os.readObject();
			Person p2 = (Person)os.readObject();
			
			os.close();
			
			System.out.println(p1);
			System.out.println(p2);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
