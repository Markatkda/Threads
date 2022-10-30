package model;

public class S2 extends Thread{
	
	public static void main(String[] args) {
		
	}
	public static int fibonacciRecursivo(int n) {
		 
        if (n == 0) {
        	
            return 0;
        } else if (n == 1) {
        	
            return 1;
        } else {
            
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
 
	}

}
