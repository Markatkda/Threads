package model;

public class S4 extends Thread{
	
	int numero1;
	int numero2;
	
	public S4(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public S4() {
		super();
	}
	
	@Override
	public void run() {
		
		int suma = numero1 * numero2;
		System.out.println(suma);
	}

}
