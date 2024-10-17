package _2_dataTypes;

public class DataType2 {

	public static void main(String[] args){

		byte value1 = 127;
		System.out.println("Byte value stored "+value1);

		//implicit typecasting
		short value2 = value1;
		System.out.println("Short value stored "+value2);


		//explicit typecasting
		int a = 254;
		byte b = (byte)a; //(byte) --> explicit typecasting
		System.out.println("Byte value after explicit typecasting "+b); //-2


		float floatingValue = 143.56F;
		int integerValue = (int)floatingValue;
		System.out.println("Integer value "+integerValue);
		


		
	}

} 












