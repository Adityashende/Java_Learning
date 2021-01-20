package demo5;

public class IteratorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UrlLib urlLib = new UrlLib();
		for(String urls: urlLib) {
			System.out.println(urls);
		}

	}

}
