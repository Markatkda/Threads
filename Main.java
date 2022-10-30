package model;

public class Main  {
	
	public final static int numero = 10;
	public final static String palabra = "otorrinolaringologia";
	

	public static void main(String[] args) throws InterruptedException {
		
//		Thread array = new ArrayCreator();
//		Thread numero = new MulCreator();
//		Thread name = new NamePrint();
//		
//		array.start();
//		numero.start();
//		name.start();
		
		S1 s1 = new S1();
		S2 s2 = new S2();
		S3 s3 = new S3();
		S4 s4 = new S4();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new	Thread(s2);
		
		t1.start();
		t2.start();
		
		
		
	}

}
