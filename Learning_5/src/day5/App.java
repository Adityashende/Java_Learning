package day5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short shortValue = 55;
		int intValue = 888;
		
		byte byteValue=20;
		long longValue=23335;
		float floatValue = 23.56f;
		
		double doubleValue=32.4;
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		byteValue = (byte)128;
		System.out.println(byteValue);
		 
	}

}
