package model;

public class MulCreator extends Thread{
	
	public static void main(String[] args) {
		
//		int numero = (int) (Math.random() * 4) + 1;
		int numero = 2;
		
		for (int i = 0; i < 10; i++) {
			
			numero = numero * numero;
			
			System.out.println("Mul:" + numero + " num: " + i);
			
			try {
				sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void run() {
		
		try {
			main(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
