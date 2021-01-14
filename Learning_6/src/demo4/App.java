package demo4;

import java.io.IOException;
import java.text.ParseException;

public class App {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		Test test = new Test();
//		try {
//			test.run();
//		} catch (IOException e) {
//			System.out.println("IOE");
//		}catch(ParseException e){
//			System.out.println("Could'nt parse command file");
//		}
		
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO: handle exception
		}
		
		
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
