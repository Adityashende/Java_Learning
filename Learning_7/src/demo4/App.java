package demo4;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1= new File("text.txt");
		
		try(BufferedWriter br= new BufferedWriter(new FileWriter(f1))){
			br.write("This line one");
			br.newLine();
			br.write("This line one");
			br.newLine();
			br.write("This line one");
		}catch(IOException e) {
			System.out.println("Unable to write file: "+f1.toString());
		}
		
		
	}

}
