package demo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.Buffer;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("text.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(f1))){
			String line;
			
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Found: "+f1.toString());
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Unable to read file: "+f1.toString());
		}
		
		
		
		
		

	}

}
