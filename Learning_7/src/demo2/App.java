package demo2;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.Buffer;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("text.txt");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);

		String line;
		
		while((line = br.readLine()) !=null){
			System.out.println(line);
		}
		
		
		System.out.println(line);
		br.close();
	}

}
