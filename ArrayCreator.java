package model;

public class ArrayCreator extends Thread{
	
	public static void main(String[] args) {
		
		int array[] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print("[" + "pos: " + i + "] ");
			
			try {
				sleep(1000);
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
