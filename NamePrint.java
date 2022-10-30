package model;

public class NamePrint extends Thread{
	
	String name = this.getName();
	
	public NamePrint(String name) {
		super();
		this.name = name;
	}

	public NamePrint() {
		super();
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 15; i++) {
			
			System.out.println(this.name + " i: " + i);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
