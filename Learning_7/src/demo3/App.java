package demo3;

//import java.io.File;

class Temp implements AutoCloseable{
	
	@Override
	public void close() throws Exception {
		System.out.println("closing");
		throw new Exception("Oh No!");
	}
}





public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try(Temp t1 = new Temp()) {
			//t1.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
