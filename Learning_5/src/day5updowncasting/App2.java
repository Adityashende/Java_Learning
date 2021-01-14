package day5updowncasting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		String fileName = "C:\\Users\\Aditya Shende\\Dropbox\\My PC (LAPTOP-37ER80MG)\\Desktop\\Java_Learning\\Learning_3";
		
		 File textFile = new File(fileName);
		 
		 Scanner in = new Scanner(textFile);

		 
		 while(in.hasNextLine()) {
			 String line = in.nextLine();
			 
			 System.out.println(line);
		 }
		 
		 
		 in.close();
	}

}
