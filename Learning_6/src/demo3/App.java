package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
		}
		
		
	}
	
	public static void openFile() throws FileNotFoundException{
		File f1=new File("test.txt");
		
		FileReader fr = new FileReader(f1);
	}

}
