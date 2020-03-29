package cts.harikrishna;

public class Program20 {
	public static void goLoop(int a) { 
		start: for (int i = 1; i < 2; i++) {
			for (int j = 1; j < 2; j++) { 
				if (a > 5) { 
					break start; 
					} 
				System.out.print(i + j); 
				} 
			} 
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    LoopTest.goLoop(15);

	}

}
